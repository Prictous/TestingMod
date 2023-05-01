package net.prictous.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC,ModItems.TUMBLED_TANZANITE, ModItems.RAW_TANZANITE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUMBLED_TANZANITE, RecipeCategory.DECORATIONS,
                ModBlocks.TANZANITE_BLOCK);
    }
}
