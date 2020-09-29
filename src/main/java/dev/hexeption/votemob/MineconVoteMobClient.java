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

import dev.hexeption.votemob.client.model.GlowSquidRenderer;
import dev.hexeption.votemob.client.model.MoobloomRenderer;
import dev.hexeption.votemob.registry.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.client.render.RenderLayer;

/**
 * VoteClient
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 28/09/2020 - 11:08 pm
 */
@Environment(EnvType.CLIENT)
public class MineconVoteMobClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(MineconVoteMob.GLOW_SQUID, (dispatcher, context) -> {
            return new GlowSquidRenderer(dispatcher);
        });
        EntityRendererRegistry.INSTANCE.register(MineconVoteMob.MOOBLOOM, (dispatcher, context) -> {
            return new MoobloomRenderer(dispatcher);
        });
        BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.BUTTERCUP);
    }
}
