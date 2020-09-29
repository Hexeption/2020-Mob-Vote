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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.CompositeEntityModel;
import net.minecraft.entity.Entity;

/**
 * GlowSquidModel
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/09/2020 - 11:02 pm
 */
public class GlowSquidModel<T extends Entity> extends CompositeEntityModel<T> {

    private final ModelPart head;
    private final ModelPart[] field_3574 = new ModelPart[8];
    private final ImmutableList<ModelPart> parts;

    public GlowSquidModel() {
        textureWidth = 128;
        textureHeight = 128;
        this.head = new ModelPart(this, 0, 0);
        this.head.addCuboid(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
        ModelPart var10000 = this.head;
        var10000.pivotY += 8.0F;

        for (int j = 0; j < this.field_3574.length; ++j) {
            this.field_3574[j] = new ModelPart(this, 48, 0);
            double d = (double) j * 3.141592653589793D * 2.0D / (double) this.field_3574.length;
            float f = (float) Math.cos(d) * 5.0F;
            float g = (float) Math.sin(d) * 5.0F;
            this.field_3574[j].setTextureOffset(0, 28).addCuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
            this.field_3574[j].pivotX = f;
            this.field_3574[j].pivotZ = g;
            this.field_3574[j].pivotY = 15.0F;
            d = (double) j * 3.141592653589793D * -2.0D / (double) this.field_3574.length + 1.5707963267948966D;
            this.field_3574[j].yaw = (float) d;
        }

        Builder<ModelPart> builder = ImmutableList.builder();
        builder.add(this.head);
        builder.addAll(Arrays.asList(this.field_3574));
        this.parts = builder.build();
    }

    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        ModelPart[] var7 = this.field_3574;
        int var8 = var7.length;

        for (int var9 = 0; var9 < var8; ++var9) {
            ModelPart modelPart = var7[var9];
            modelPart.pitch = animationProgress;
        }

    }

    public Iterable<ModelPart> getParts() {
        return this.parts;
    }
}
