package net.prictous.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));
    public static final Item TUMBLED_TANZANITE = registerItem("tumbled_tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item RAW_GARNET = registerItem("raw_garnet",
            new Item(new FabricItemSettings()));
    public static final Item TUMBLED_GARNET = registerItem("tumbled_garnet",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE_DIAMOND_ALLOY = registerItem("tanzanite_diamond_alloy",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE_NECKLACE = registerItem("tanzanite_necklace",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering mod items for " + TestMod.MOD_ID);
    }
}
