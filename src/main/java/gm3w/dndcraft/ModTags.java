package gm3w.dndcraft;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ORES_SILVER = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_ore"));
        public static final TagKey<Block> ORES_TITANIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_ore"));
        public static final TagKey<Block> ORES_MITHRIL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_ore"));
        public static final TagKey<Block> ORES_ADAMANT = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamant_ore"));
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_TITANIUM = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_MITHRIL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_block"));
        public static final TagKey<Block> STORAGE_BLOCKS_ADAMANTINE = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamantine_block"));
        public static final TagKey<Block> NEEDS_COPPER_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_copper_tool"));
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_titanium_tool"));
        public static final TagKey<Block> NEEDS_ADAMANTINE_TOOL = BlockTags.create(new ResourceLocation(DnDcraft.MOD_ID, "needs_silver_tool"));
    }

    public static class Items {

        public static final TagKey<Item> ORES_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_ore"));
        public static final TagKey<Item> ORES_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_ore"));
        public static final TagKey<Item> ORES_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_ore"));
        public static final TagKey<Item> ORES_ADAMANT = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamant_ore"));
        public static final TagKey<Item> STORAGE_BLOCKS_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "silver_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "titanium_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "mithril_block"));
        public static final TagKey<Item> STORAGE_BLOCKS_ADAMANTINE = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "adamantine_block"));
        public static final TagKey<Item> RAW_MATERIALS_SILVER = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/silver"));
        public static final TagKey<Item> RAW_MATEIRALS_TITANIUM = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/titanium"));
        public static final TagKey<Item> RAW_MATERIALS_MITHRIL = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/mithril"));
        public static final TagKey<Item> RAW_MATERIALS_ADAMANT = ItemTags.create(new ResourceLocation(DnDcraft.MOD_ID, "raw_materials/adamant"));
    }

}
