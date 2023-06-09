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
import net.prictous.testmod.item.ModItemGroup;
import net.prictous.testmod.world.tree.StrangeTreeSaplingGenerator;

public class ModBlocks {

    public static final Block DS_RAW_TANZANITE_ORE = registerBlock("ds_raw_tanzanite",
        new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(),
                UniformIntProvider.create(3, 7)), ModItemGroup.GEMS);
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST).strength(4.0f).requiresTool()), ModItemGroup.GEMS);

    public static final Block STRANGE_TREE_LOG = registerBlock("strange_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.GEMS);
    public static final Block STRANGE_TREE_WOOD = registerBlock("strange_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.GEMS);
    public static final Block STRIPPED_STRANGE_TREE_LOG = registerBlock("stripped_strange_tree_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.GEMS);
    public static final Block STRIPPED_STRANGE_TREE_WOOD = registerBlock("stripped_strange_tree_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.GEMS);

    public static final Block STRANGE_TREE_PLANKS = registerBlock("strange_tree_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.GEMS);
    public static final Block STRANGE_TREE_LEAVES = registerBlock("strange_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ModItemGroup.GEMS);

    public static final Block STRANGE_TREE_SAPLING = registerBlock("strange_tree_sapling",
            new SaplingBlock(new StrangeTreeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ModItemGroup.GEMS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering ModBlocks for " + TestMod.MOD_ID);
    }
}
