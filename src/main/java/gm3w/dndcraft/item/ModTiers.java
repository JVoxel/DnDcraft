package gm3w.dndcraft.item;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.Collections;
import java.util.List;

public class ModTiers {

    public static final Tier BONE = TierSortingRegistry.registerTier(
            new ForgeTier(1, 59, 2.0F, 0.0F, 5, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.BONE)),
            new ResourceLocation(DnDcraft.MOD_ID, "bone"),
            List.of(Tiers.WOOD),
            List.of(Tiers.STONE)
    );

    public static final Tier COPPER = TierSortingRegistry.registerTier(
            new ForgeTier(2, 250, 3.0F, 1.0F, 10, ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT)),
            new ResourceLocation(DnDcraft.MOD_ID, "copper"),
            List.of(Tiers.STONE),
            List.of(Tiers.IRON)
    );

    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(4, 890, 5.0F, 3.0F, 8, ModTags.Blocks.NEEDS_TITANIUM_TOOL, () ->  Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(DnDcraft.MOD_ID, "titanium"),
            List.of(Tiers.DIAMOND),
            List.of()
    );

    public static final Tier VANADIUM = TierSortingRegistry.registerTier(
            new ForgeTier(4, 890, 5.0F, 3.0F, 8, ModTags.Blocks.NEEDS_VANADIUM_TOOL, () ->  Ingredient.of(ModItems.VANADIUM_INGOT.get())),
            new ResourceLocation(DnDcraft.MOD_ID, "vanadium"),
            List.of(Tiers.DIAMOND),
            List.of()
    );

    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 890, 5.0F, 3.0F, 8, ModTags.Blocks.NEEDS_MITHRIL_TOOL, () ->  Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(DnDcraft.MOD_ID, "mithril"),
            List.of(Tiers.DIAMOND),
            List.of()
    );

    public static final Tier ADAMANTINE = TierSortingRegistry.registerTier(
            new ForgeTier(7, 3047, 10.0F, 8.0F, 18, ModTags.Blocks.NEEDS_ADAMANTINE_TOOL, () -> Ingredient.of(ModItems.ADAMANTINE_INGOT.get())),
            new ResourceLocation(DnDcraft.MOD_ID, "adamantine"),
            List.of(Tiers.DIAMOND),
            List.of()
    );
}
