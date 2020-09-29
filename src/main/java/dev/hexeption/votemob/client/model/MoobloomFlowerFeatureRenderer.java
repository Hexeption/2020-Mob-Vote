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

package dev.hexeption.votemob.client.model;

import dev.hexeption.votemob.entity.MoobloomEntity;
import dev.hexeption.votemob.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.CowEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;

/**
 * MoobloomFlowerFeatureRenderer
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 04:55 am
 */
public class MoobloomFlowerFeatureRenderer<T extends MoobloomEntity> extends FeatureRenderer<T, CowEntityModel<T>> {

    public MoobloomFlowerFeatureRenderer(FeatureRendererContext<T, CowEntityModel<T>> featureRendererContext) {
        super(featureRendererContext);
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T mooshroomEntity, float f, float g, float h, float j, float k, float l) {
        if (!mooshroomEntity.isBaby() && !mooshroomEntity.isInvisible()) {
            BlockRenderManager blockRenderManager = MinecraftClient.getInstance().getBlockRenderManager();
            BlockState blockState = ModBlocks.BUTTERCUP.getDefaultState();
            int m = LivingEntityRenderer.getOverlay(mooshroomEntity, 0.0F);
            matrixStack.push();
            matrixStack.translate(0.20000000298023224D, -0.3499999940395355D, 0.5D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(-48.0F));
            matrixStack.scale(-1.0F, -1.0F, 1.0F);
            matrixStack.translate(-0.5D, -0.5D, -0.5D);
            blockRenderManager.renderBlockAsEntity(blockState, matrixStack, vertexConsumerProvider, i, m);
            matrixStack.pop();
            matrixStack.push();
            matrixStack.translate(0.10000000298023224D, -0.3499999940395355D, 0.5D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(42.0F));
            matrixStack.translate(0.10000000149011612D, 0.0D, -0.6000000238418579D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(-48.0F));
            matrixStack.scale(-1.0F, -1.0F, 1.0F);
            matrixStack.translate(-0.5D, -0.5D, -0.5D);
            blockRenderManager.renderBlockAsEntity(blockState, matrixStack, vertexConsumerProvider, i, m);
            matrixStack.pop();
            matrixStack.push();
            matrixStack.translate(0.20000000298023224D, -0.3499999940395355D, 0.5D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(42.0F));
            matrixStack.translate(0.50000000149011612D, 0.0D, -0.6000000238418579D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(-48.0F));
            matrixStack.scale(-1.0F, -1.0F, 1.0F);
            matrixStack.translate(-0.5D, -0.5D, -0.5D);
            blockRenderManager.renderBlockAsEntity(blockState, matrixStack, vertexConsumerProvider, i, m);
            matrixStack.pop();
            matrixStack.push();
            ((CowEntityModel) this.getContextModel()).getHead().rotate(matrixStack);
            matrixStack.translate(0.0D, -0.699999988079071D, -0.20000000298023224D);
            matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(-78.0F));
            matrixStack.scale(-1.0F, -1.0F, 1.0F);
            matrixStack.translate(-0.5D, -0.5D, -0.5D);
            blockRenderManager.renderBlockAsEntity(blockState, matrixStack, vertexConsumerProvider, i, m);
            matrixStack.pop();
        }
    }
}
