package net.prictous.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;
import net.prictous.testmod.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup GEMS = Registry.register(Registries.ITEM_GROUP, new Identifier(TestMod.MOD_ID, "gems"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.gems"))
                    .icon(() -> new ItemStack(ModItems.TANZANITE_DIAMOND_ALLOY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TANZANITE);
                        entries.add(ModItems.TUMBLED_TANZANITE);
                        entries.add(ModItems.RAW_GARNET);
                        entries.add(ModItems.TUMBLED_GARNET);
                        entries.add(ModItems.TANZANITE_NECKLACE);
                        entries.add(ModItems.TANZANITE_DIAMOND_ALLOY);

                        entries.add(ModBlocks.DS_RAW_TANZANITE_ORE);
                        entries.add(ModBlocks.RAW_GARNET_ORE);
                        entries.add(ModBlocks.TANZANITE_BLOCK);
                        entries.add(ModBlocks.ROCK_TUMBLER);
                    }).build());

    public static void registerItemGroups() {

    }
}
