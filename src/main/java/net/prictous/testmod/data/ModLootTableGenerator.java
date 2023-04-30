package net.prictous.testmod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.prictous.testmod.block.ModBlocks;
import net.prictous.testmod.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TANZANITE_BLOCK);
        addDrop(ModBlocks.DS_RAW_TANZANITE_ORE, oreDrops(ModBlocks.DS_RAW_TANZANITE_ORE, ModItems.RAW_TANZANITE));
    }
}
