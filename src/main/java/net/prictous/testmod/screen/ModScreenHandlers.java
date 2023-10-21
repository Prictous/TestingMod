package net.prictous.testmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;

public class ModScreenHandlers {
    public static final ScreenHandlerType<RockTumblerScreenHandler> ROCK_TUMBLER_SCREEN_HANDLER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TestMod.MOD_ID, "rock_tumbling"),
                    new ExtendedScreenHandlerType<>(RockTumblerScreenHandler::new));

    public static void registerScreenHandlers() {
        TestMod.LOGGER.info("Registering Screen Handlers for " + TestMod.MOD_ID);
    }
}
