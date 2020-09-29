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
import dev.hexeption.votemob.entity.GlowSquidEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

/**
 * GlowSquidRenderer
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/09/2020 - 11:03 pm
 */
public class GlowSquidRenderer extends MobEntityRenderer<GlowSquidEntity, GlowSquidModel<GlowSquidEntity>> {
    private static final Identifier TEXTURE = new Identifier(MineconVoteMob.MOD_ID, "textures/entity/glowsquid/texture.png");

    public GlowSquidRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new GlowSquidModel<>(), 0.7F);
        this.addFeature(new GlowSquidSparkleFeatureRenderer(this));
    }

    public Identifier getTexture(GlowSquidEntity squidEntity) {
        return TEXTURE;
    }

    protected void setupTransforms(GlowSquidEntity squidEntity, MatrixStack matrixStack, float f, float g, float h) {
        float i = MathHelper.lerp(h, squidEntity.field_6905, squidEntity.field_6907);
        float j = MathHelper.lerp(h, squidEntity.field_6906, squidEntity.field_6903);
        matrixStack.translate(0.0D, 0.5D, 0.0D);
        matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(180.0F - g));
        matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(i));
        matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(j));
        matrixStack.translate(0.0D, -1.2000000476837158D, 0.0D);
    }

    protected float getAnimationProgress(GlowSquidEntity squidEntity, float f) {
        return MathHelper.lerp(f, squidEntity.field_6900, squidEntity.field_6904);
    }

//    @Override
//    protected int getBlockLight(GlowSquidEntity entity, BlockPos blockPos) {
//        return 15;
//    }
}
