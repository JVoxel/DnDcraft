package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.item.ModItems;
import net.minecraft.data.DataGenerator;

public class ModLootTableProvider extends BaseLootTableProvider {

    public ModLootTableProvider(DataGenerator gen) { super(gen); }

    protected void addTables() {
        lootTables.put(ModBlocks.SILVER_ORE.get(), createSilkTouchTable("silver_ore", ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        lootTables.put(ModBlocks.DEEPSLATE_SILVER_ORE.get(), createSilkTouchTable("deepslate_silver_ore", ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        lootTables.put(ModBlocks.TITANIUM_ORE.get(), createSilkTouchTable("titanium_ore", ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        lootTables.put(ModBlocks.VANADIUM_ORE.get(), createSilkTouchTable("vanadium_ore", ModBlocks.VANADIUM_ORE.get(), ModItems.RAW_VANADIUM.get()));
        lootTables.put(ModBlocks.MITHRIL_ORE.get(), createSilkTouchTable("mithril_ore", ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        lootTables.put(ModBlocks.ADAMANT_ORE.get(), createSilkTouchTable("adamant_ore", ModBlocks.ADAMANT_ORE.get(), ModItems.RAW_ADAMANT.get()));

        lootTables.put(ModBlocks.SILVER_BLOCK.get(), createSimpleTable("silver_block", ModBlocks.SILVER_BLOCK.get()));
        lootTables.put(ModBlocks.TITANIUM_BLOCK.get(), createSimpleTable("titanium_block", ModBlocks.TITANIUM_BLOCK.get()));
        lootTables.put(ModBlocks.VANADIUM_BLOCK.get(), createSimpleTable("vanadium_block", ModBlocks.VANADIUM_BLOCK.get()));
        lootTables.put(ModBlocks.MITHRIL_BLOCK.get(), createSimpleTable("mithril_block", ModBlocks.MITHRIL_BLOCK.get()));
        lootTables.put(ModBlocks.ADAMANTINE_BLOCK.get(), createSimpleTable("adamantine_block", ModBlocks.ADAMANTINE_BLOCK.get()));
    }
}
