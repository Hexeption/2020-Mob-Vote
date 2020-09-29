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

package dev.hexeption.votemob.mixin;

import dev.hexeption.votemob.MineconVoteMob;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.DefaultBiomeCreator;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.SpawnSettings.Builder;
import net.minecraft.world.biome.SpawnSettings.SpawnEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * DefaultBiomeCreatorMixin
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 06:07 am
 */
@Mixin(DefaultBiomeCreator.class)
public class DefaultBiomeCreatorMixin {

    @Redirect(method = "createFlowerForest", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/SpawnSettings$Builder;spawn(Lnet/minecraft/entity/SpawnGroup;Lnet/minecraft/world/biome/SpawnSettings$SpawnEntry;)Lnet/minecraft/world/biome/SpawnSettings$Builder;"))
    private static SpawnSettings.Builder createFlowerForest(Builder builder, SpawnGroup spawnGroup, SpawnEntry spawnEntry) {
        builder.spawn(SpawnGroup.CREATURE, new SpawnEntry(MineconVoteMob.MOOBLOOM, 8, 2, 4));
        return builder;
    }

}
