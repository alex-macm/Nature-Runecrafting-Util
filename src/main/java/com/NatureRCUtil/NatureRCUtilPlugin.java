/*
 * Copyright (c) 2024, alex-macm
 * Copyright (c) 2022, Jacob Petersen <jakepetersen1221@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */



package com.NatureRCUtil;
import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.api.events.PostMenuSort;
import net.runelite.api.*;
import org.apache.commons.lang3.ArrayUtils;
import net.runelite.api.coords.WorldPoint;

@Slf4j
@PluginDescriptor(
		name = "Nature Runecraft Utilities"
)
public class NatureRCUtilPlugin extends Plugin
{
	int[] capes = {
			ItemID.ACHIEVEMENT_DIARY_CAPE, //diary cape
			ItemID.ACHIEVEMENT_DIARY_CAPE_T // diary cape (t)
	};
	@Inject
	private Client client;

	@Inject
	private NatureRCUtilConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("NatureRCutil started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("NatureRCUtil stopped!");
	}

	@Subscribe(priority = -1)
	public void onPostMenuSort(PostMenuSort event) {
		WorldPoint playerLoc = client.getLocalPlayer().getWorldLocation();
		if (9547 == playerLoc.getRegionID()) {
			String teleportString = "Jarr";
			if (config.sirRebral()){
				teleportString = "Sir Rebral";
			}

			Menu menu = client.getMenu();
			MenuEntry[] menuEntries = menu.getMenuEntries();
			if (menuEntries.length > 2) {
				int cape = menuEntries[menuEntries.length - 2].getItemId();
				int teleportIdx = -1;
				int jarrIdx = -1;
				if (ArrayUtils.contains(capes, cape)) {
					teleportIdx = getIndexOfNameFromMenu(menu, "Teleport");
					if (teleportIdx == -1) {
						return;
					}
					Menu subMenu = menuEntries[teleportIdx].getSubMenu();
					if (subMenu == null) {
						return;
					}

					MenuEntry[] subMenuEntries = subMenu.getMenuEntries();
					jarrIdx = getIndexOfNameFromMenu(subMenu, teleportString);

					if (jarrIdx >= 0 && jarrIdx < subMenuEntries.length) {
						MenuEntry jarr = subMenuEntries[jarrIdx];
						client.getMenu().createMenuEntry(-1)
								.setOption(jarr.getOption())
								.setTarget(jarr.getTarget())
								.onClick(jarr.onClick())
								.setDeprioritized(false);
					}
				}
			}
		}
	}

	@Provides
	NatureRCUtilConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(NatureRCUtilConfig.class);
	}

	private int getIndexOfNameFromMenu (Menu menu, String name){
		for (int i = 0; i < menu.getMenuEntries().length - 1; i++) {
			if (menu.getMenuEntries()[i].getOption().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}