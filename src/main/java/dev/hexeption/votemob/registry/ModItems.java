/*******************************************************************************
 * Mob Vote
 * Copyright (C) 2020  Hexeption (Keir Davis)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package dev.hexeption.votemob.registry;

import dev.hexeption.votemob.MineconVoteMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

/**
 * ModItems
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 12:56 am
 */
public class ModItems {

    public static final Item GLOW_SQUID_SPAWN_EGG = register("glow_squid_spawn_egg", new SpawnEggItem(MineconVoteMob.GLOW_SQUID, 0xc5ffde, 0x32a1a1, (new Item.Settings().group(ItemGroup.MISC))));
    public static final Item MOOBLOOM_SPAWN_EGG = register("moobloom_spawn_egg", new SpawnEggItem(MineconVoteMob.MOOBLOOM, 0xc7ae14, 0xffffff, (new Item.Settings().group(ItemGroup.MISC))));

    protected static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, MineconVoteMob.id(name), item);
    }

    public static void init() {

    }

}
