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

        HandledScreens.register(ModScreenHandlers.ROCK_TUMBLER_SCREEN_HANDLER_SCREEN_HANDLER, RockTumblerScreen::new);
    }
}
