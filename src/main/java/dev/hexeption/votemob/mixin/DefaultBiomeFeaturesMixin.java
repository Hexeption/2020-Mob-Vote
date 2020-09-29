/*******************************************************************************
 * Template for Fabric Mods
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

package dev.hexeption.votemob.mixin;

import dev.hexeption.votemob.MineconVoteMob;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.SpawnSettings.Builder;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * DefaultBiomeFeaturesMixin
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/09/2020 - 11:51 pm
 */
@Mixin(DefaultBiomeFeatures.class)
public class DefaultBiomeFeaturesMixin {

    @Inject(method = "addWarmOceanMobs", at = @At("TAIL"))
    private static void addWarmOceanMobs(Builder builder, int squidWeight, int squidMinGroupSize, CallbackInfo ci) {
        if(squidWeight == 5){
            builder.spawn(SpawnGroup.WATER_CREATURE, new SpawnSettings.SpawnEntry(MineconVoteMob.GLOW_SQUID, 10, squidMinGroupSize, 4));
        }
    }

}
