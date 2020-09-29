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

package dev.hexeption.votemob;

import dev.hexeption.votemob.entity.GlowSquidEntity;
import dev.hexeption.votemob.entity.MoobloomEntity;
import dev.hexeption.votemob.registry.ModBlocks;
import dev.hexeption.votemob.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MineconVoteMob implements ModInitializer {

    public static final String MOD_ID = "votemob";

    public static final EntityType<GlowSquidEntity> GLOW_SQUID = Registry
        .register(Registry.ENTITY_TYPE, id("glow_squid"), FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, GlowSquidEntity::new).dimensions(
            EntityDimensions.fixed(0.8F, 0.8F)).build());

    public static final EntityType<MoobloomEntity> MOOBLOOM = Registry
        .register(Registry.ENTITY_TYPE, id("moobloom"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MoobloomEntity::new).dimensions(
            EntityDimensions.fixed(0.9F, 1.4F)).trackRangeBlocks(10).build());

    public static Identifier id(String name) {
        return new Identifier(MOD_ID, name);
    }

    @Override
    public void onInitialize() {
        ModItems.init();
        ModBlocks.init();
        FabricDefaultAttributeRegistry.register(GLOW_SQUID, GlowSquidEntity.createSquidAttributes());
        FabricDefaultAttributeRegistry.register(MOOBLOOM, MoobloomEntity.createCowAttributes());
    }
}
