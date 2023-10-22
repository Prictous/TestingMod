package net.prictous.testmod.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;

public class ModRecipes {

    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(TestMod.MOD_ID, RockTumblerRecipe.Serializer.ID),
                RockTumblerRecipe.Serializer.INSTANCE);

        Registry.register(Registries.RECIPE_TYPE, new Identifier(TestMod.MOD_ID, RockTumblerRecipe.Type.ID),
                RockTumblerRecipe.Type.INSTANCE);
    }
}
