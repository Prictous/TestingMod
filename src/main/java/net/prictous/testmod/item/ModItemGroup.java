package net.prictous.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;

public class ModItemGroup {
    public static ItemGroup GEMS;

    public static void registerItemGroups() {
        GEMS = FabricItemGroup.builder(new Identifier(TestMod.MOD_ID, "gemsgroup"))
                .displayName(Text.translatable("itemgroup.gems"))
                .icon(() -> new ItemStack(ModItems.RAW_TANZANITE)).build();
    }
}
