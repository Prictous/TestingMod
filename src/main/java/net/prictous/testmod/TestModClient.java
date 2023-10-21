package net.prictous.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.screen.ModScreenHandlers;
import net.prictous.testmod.screen.RockTumblerScreen;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRANGE_TREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRANGE_TREE_SAPLING, RenderLayer.getCutout());

        HandledScreens.register(ModScreenHandlers.ROCK_TUMBLER_SCREEN_HANDLER_SCREEN_HANDLER, RockTumblerScreen::new);
    }
}
