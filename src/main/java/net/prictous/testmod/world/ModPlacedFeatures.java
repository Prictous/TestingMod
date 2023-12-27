package net.prictous.testmod.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.prictous.testmod.TestMod;
import net.prictous.testmod.block.ModBlocks;

import java.util.List;

import static net.prictous.testmod.world.ModConfiguredFeatures.registerKey;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> TANZANITE_DS_ORE_PLACE_KEY = registerKey("ds_tanzanite_placed");
    public static final RegistryKey<PlacedFeature> GARNET_ORE_PLACE_KEY = registerKey("garnet_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);



        register(context, TANZANITE_DS_ORE_PLACE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TANZ_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(200))));

        register(context, GARNET_ORE_PLACE_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GARN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(200))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TestMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
