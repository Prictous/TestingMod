package net.prictous.testmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.block.ModFlammableBlockRegistry;
import net.prictous.testmod.block.entity.ModBlockEntities;
import net.prictous.testmod.data.ModWorldGenerator;
import net.prictous.testmod.item.ModItemGroup;
import net.prictous.testmod.item.ModItems;
import net.prictous.testmod.recipe.ModRecipes;
import net.prictous.testmod.screen.ModScreenHandlers;
import net.prictous.testmod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		ModFlammableBlockRegistry.registerFlammableBlocks();

	}
}
