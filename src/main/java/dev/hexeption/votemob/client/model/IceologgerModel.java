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

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

/**
 * IceologgerModel
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 29/09/2020 - 08:53 pm
 */
public class IceologgerModel<T extends Entity> extends EntityModel<T> {

    private final ModelPart head;
    private final ModelPart hat;
    private final ModelPart nose;
    private final ModelPart body;
    private final ModelPart arms;
    private final ModelPart arms_flipped;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    private final ModelPart right_arm;
    private final ModelPart left_arm;
    private final ModelPart Cape;

    public IceologgerModel() {
        textureWidth = 128;
        textureHeight = 128;
        head = new ModelPart(this);
        head.setPivot(0.0F, 0.0F, 0.0F);
        head.setTextureOffset(28, 0).addCuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(22, 0).addCuboid(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(20, 20).addCuboid(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);

        hat = new ModelPart(this);
        hat.setPivot(0.0F, 24.0F, 0.0F);

        nose = new ModelPart(this);
        nose.setPivot(0.0F, 24.0F, 0.0F);

        body = new ModelPart(this);
        body.setPivot(0.0F, 0.0F, 0.0F);
        body.setTextureOffset(0, 38).addCuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addCuboid(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, false);

        arms = new ModelPart(this);
        arms.setPivot(0.0F, 2.0F, 0.0F);
        arms.setTextureOffset(52, 0).addCuboid(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
        arms.setTextureOffset(0, 24).addCuboid(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        arms_flipped = new ModelPart(this);
        arms_flipped.setPivot(0.0F, 22.0F, 0.0F);
        arms.addChild(arms_flipped);
        arms_flipped.setTextureOffset(0, 24).addCuboid(4.0F, -24.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

        right_leg = new ModelPart(this);
        right_leg.setPivot(2.0F, 12.0F, 0.0F);
        right_leg.setTextureOffset(50, 34).addCuboid(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        left_leg = new ModelPart(this);
        left_leg.setPivot(-2.0F, 12.0F, 0.0F);
        left_leg.setTextureOffset(50, 34).addCuboid(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        right_arm = new ModelPart(this);
        right_arm.setPivot(5.0F, 2.0F, 0.0F);
        right_arm.setTextureOffset(50, 50).addCuboid(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        left_arm = new ModelPart(this);
        left_arm.setPivot(-5.0F, 2.0F, 0.0F);
        left_arm.setTextureOffset(50, 50).addCuboid(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        Cape = new ModelPart(this);
        Cape.setPivot(1.0F, 1.0F, 3.0F);
        Cape.setTextureOffset(0, 56).addCuboid(-6.0F, 0.0F, 1.0F, 10.0F, 17.0F, 1.0F, 0.0F, false);
        Cape.setTextureOffset(22, 56).addCuboid(-6.0F, -1.0F, 0.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        head.render(matrixStack, buffer, packedLight, packedOverlay);
        hat.render(matrixStack, buffer, packedLight, packedOverlay);
        nose.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        arms.render(matrixStack, buffer, packedLight, packedOverlay);
        right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
        left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
        Cape.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelPart bone, float x, float y, float z) {
        bone.pitch = x;
        bone.yaw = y;
        bone.roll = z;
    }
}
