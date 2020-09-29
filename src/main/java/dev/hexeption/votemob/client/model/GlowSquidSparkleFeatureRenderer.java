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
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.feature.EyesFeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;

/**
 * GlowSquidSparkleFeatureRenderer
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 12:25 am
 */
public class GlowSquidSparkleFeatureRenderer<T extends LivingEntity> extends EyesFeatureRenderer<T, GlowSquidModel<T>> {

    private static final Identifier TEXTURE = new Identifier(MineconVoteMob.MOD_ID, "textures/entity/glowsquid/glow.png");

    private static final RenderLayer SKIN = RenderLayer.getEyes(TEXTURE);

    public GlowSquidSparkleFeatureRenderer(FeatureRendererContext<T, GlowSquidModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    public RenderLayer getEyesTexture() {
        return SKIN;
    }
}
