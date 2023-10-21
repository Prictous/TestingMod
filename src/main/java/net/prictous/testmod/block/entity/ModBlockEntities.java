package net.prictous.testmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.prictous.testmod.TestMod;
import net.prictous.testmod.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<RockTumblerBlockEntity> ROCK_TUMBLER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TestMod.MOD_ID, "rock_tumbler_be"),
                    FabricBlockEntityTypeBuilder.create(RockTumblerBlockEntity::new,
                            ModBlocks.ROCK_TUMBLER).build());

    public static void registerBlockEntities() {
        TestMod.LOGGER.info("Registering Block Entities for " + TestMod.MOD_ID);
    }
}
