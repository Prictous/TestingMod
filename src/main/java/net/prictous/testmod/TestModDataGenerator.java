package net.prictous.testmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.data.ModLootTableGenerator;
import net.prictous.testmod.data.ModModelProvider;
import net.prictous.testmod.data.ModRecipeGenerator;
import net.prictous.testmod.data.ModWorldGenerator;
import net.prictous.testmod.world.ModConfiguredFeatures;
import net.prictous.testmod.world.ModPlacedFeatures;

public class TestModDataGenerator implements DataGeneratorEntrypoint {


    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TANZANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DS_RAW_TANZANITE_ORE);

        blockStateModelGenerator.registerSimpleState(ModBlocks.ROCK_TUMBLER);
    }
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);

    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder){
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
