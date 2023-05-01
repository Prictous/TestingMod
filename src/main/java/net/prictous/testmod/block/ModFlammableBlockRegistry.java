package net.prictous.testmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.STRANGE_TREE_LOG, 5, 5);
        registry.add(ModBlocks.STRANGE_TREE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_STRANGE_TREE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_STRANGE_TREE_WOOD, 5, 5);

        registry.add(ModBlocks.STRANGE_TREE_LEAVES, 30, 60);
        registry.add(ModBlocks.STRANGE_TREE_PLANKS, 5, 20);
    }
}
