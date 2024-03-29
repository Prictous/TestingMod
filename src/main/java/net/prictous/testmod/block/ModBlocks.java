package net.prictous.testmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.prictous.testmod.TestMod;
import net.prictous.testmod.block.custom.RockTumblerBlock;
import net.prictous.testmod.item.ModItemGroup;


public class ModBlocks {

    public static final Block DS_RAW_TANZANITE_ORE = registerBlock("ds_raw_tanzanite",
        new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.0f).requiresTool(),
                UniformIntProvider.create(3, 7)));

    public static final Block RAW_GARNET_ORE = registerBlock("raw_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.0f).requiresTool(),
                    UniformIntProvider.create(2, 5)));
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(4.0f).requiresTool()));


    public static final Block ROCK_TUMBLER = registerBlock("rock_tumbler",
            new RockTumblerBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque().strength(3.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        //ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
