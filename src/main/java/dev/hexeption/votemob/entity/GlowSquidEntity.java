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

package dev.hexeption.votemob.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.world.World;

/**
 * GlowSquidEntity
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/09/2020 - 11:00 pm
 */
public class GlowSquidEntity extends SquidEntity {

    public GlowSquidEntity(EntityType<? extends SquidEntity> entityType, World world) {
        super(entityType, world);
    }
}
