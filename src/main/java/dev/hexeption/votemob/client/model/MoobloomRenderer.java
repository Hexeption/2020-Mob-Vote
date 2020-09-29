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

package dev.hexeption.votemob.client.model;

import dev.hexeption.votemob.MineconVoteMob;
import dev.hexeption.votemob.entity.MoobloomEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.util.Identifier;

/**
 * MoobloomRenderer
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 04:40 am
 */
public class MoobloomRenderer extends MobEntityRenderer<MoobloomEntity, CowEntityModel<MoobloomEntity>> {

    private static final Identifier TEXTURE = new Identifier(MineconVoteMob.MOD_ID, "textures/entity/moobloom/texture.png");


    public MoobloomRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CowEntityModel(), 0.7F);
        this.addFeature(new MoobloomFlowerFeatureRenderer<>(this));
    }

    @Override
    public Identifier getTexture(MoobloomEntity entity) {
        return TEXTURE;
    }
}
