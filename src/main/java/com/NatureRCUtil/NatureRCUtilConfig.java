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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("naturerunecraftutilities")
public interface NatureRCUtilConfig extends Config
{
    @ConfigItem(
            keyName = "sirRebral",
            name = "Sir Rebral",
            description = "Swap Jarr to Sir Rebral.",
            position = 0
    )
    default boolean sirRebral(){
        return false;
    }

    @ConfigItem(
            keyName = "abyss",
            name = "Abyss",
            description = "Teleport to Wilderness line from Jarr",
            position = 1
    )
    default boolean abyss(){
        return false;
    }

    @ConfigItem(
            keyName = "airAltar",
            name = "Air Altar",
            description = "Teleport from Air Altar",
            position = 2
    )
    default boolean airAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "mindAltar",
            name = "Mind Altar",
            description = "Teleport from Mind Altar",
            position = 3
    )
    default boolean mindAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "waterAltar",
            name = "Water Altar",
            description = "Teleport from Water Altar",
            position = 4
    )
    default boolean waterAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "earthAltar",
            name = "Earth Altar",
            description = "Teleport from Earth Altar",
            position = 5
    )
    default boolean earthAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "fireAltar",
            name = "Fire Altar",
            description = "Teleport from Fire Altar",
            position = 6
    )
    default boolean fireAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "bodyAltar",
            name = "Body Altar",
            description = "Teleport from Body Altar",
            position = 7
    )
    default boolean bodyAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "cosmicAltar",
            name = "Cosmic Altar",
            description = "Teleport from Cosmic Altar",
            position = 8
    )
    default boolean cosmicAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "chaosAltar",
            name = "Chaos Altar",
            description = "Teleport from Chaos Altar",
            position = 9
    )
    default boolean chaosAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "astralAltar",
            name = "Astral Altar",
            description = "Teleport from Astral Altar",
            position = 10
    )
    default boolean astralAltar(){ return false; }

    @ConfigItem(
            keyName = "natureAltar",
            name = "Nature Altar",
            description = "Teleport from Nature Altar",
            position = 11
    )
    default boolean natureAltar(){
        return true;
    }

    @ConfigItem(
            keyName = "lawAltar",
            name = "Law Altar",
            description = "Teleport from Law Altar",
            position = 12
    )
    default boolean lawAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "deathAltar",
            name = "Death Altar",
            description = "Teleport from Death Altar",
            position = 13
    )
    default boolean deathAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "truebloodAltar",
            name = "True Blood Altar",
            description = "Teleport from True Blood (Morytania) Altar",
            position = 14
    )
    default boolean truebloodAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "darkbloodAltar",
            name = "Dark Blood Altar",
            description = "Teleport from Dark Blood (Kourend) Altar",
            position = 15
    )
    default boolean darkbloodAltar(){
        return false;
    }

    @ConfigItem(
            keyName = "darksoulAltar",
            name = "Dark Soul Altar",
            description = "Teleport from Dark Soul (Kourend) Altar",
            position = 16
    )
    default boolean darksoulAltar(){
        return false;
    }
    @ConfigItem(
            keyName = "wrathAltar",
            name = "Wrath Altar",
            description = "Teleport from Wrath Altar",
            position = 17
    )
    default boolean wrathAltar(){
        return false;
    }

}
