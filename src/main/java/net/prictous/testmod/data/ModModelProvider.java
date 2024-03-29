package net.prictous.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DS_RAW_TANZANITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TANZANITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_GARNET_ORE);


        blockStateModelGenerator.registerSimpleState(ModBlocks.ROCK_TUMBLER);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TANZANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TANZANITE_NECKLACE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUMBLED_TANZANITE, Models.GENERATED);
    }
}
