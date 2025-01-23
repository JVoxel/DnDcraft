package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.registration.ModBlocks;
import gm3w.dndcraft.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static gm3w.dndcraft.setup.ModSetup.TAB_NAME;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String locale) {
        super(gen, DnDcraft.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Example");

        add(ModBlocks.SILVER_ORE.get(), "Silver Ore");
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        add(ModBlocks.TITANIUM_ORE.get(), "Titanium Ore");
        add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), "Deepslate Titanium Ore");
        add(ModBlocks.MITHRIL_ORE.get(), "Mithril Ore");
        add(ModBlocks.ADAMANT_ORE.get(), "Adamant Ore");

        add(ModItems.SILVER_BLOCK.get(), "Silver Block");
        add(ModItems.TITANIUM_BLOCK.get(), "Titanium Block");
        add(ModItems.MITHRIL_BLOCK.get(), "Mithril Block");
        add(ModItems.ADAMANTINE_BLOCK.get(), "Adamantine Block");

        add(ModItems.RAW_SILVER.get(), "Raw Silver");
        add(ModItems.RAW_TITANIUM.get(), "Raw Titanium");
        add(ModItems.RAW_MITHRIL.get(), "Raw Mithril");
        add(ModItems.RAW_ADAMANT.get(), "Raw Adamant");

        add(ModItems.SILVER_INGOT.get(), "Silver Ingot");
        add(ModItems.TITANIUM_INGOT.get(), "Titanium Ingot");
        add(ModItems.MITHRIL_INGOT.get(), "Mithril Ingot");
        add(ModItems.ADAMANTINE_INGOT.get(), "Adamantine Ingot");

        add(ModItems.COPPER_NUGGET.get(), "Copper Nugget");
        add(ModItems.SILVER_NUGGET.get(), "Silver Nugget");
        add(ModItems.TITANIUM_NUGGET.get(), "Titanium Nugget");
        add(ModItems.MITHRIL_NUGGET.get(), "Mithril Nugget");
        add(ModItems.ADAMANTINE_NUGGET.get(), "Adamantine Nugget");

        add(ModItems.COPPER_SWORD.get(), "Copper Sword");
        add(ModItems.COPPER_SHOVEL.get(), "Copper Shovel");
        add(ModItems.COPPER_PICKAXE.get(), "Copper Pickaxe");
        add(ModItems.COPPER_AXE.get(), "Copper Axe");
        add(ModItems.COPPER_HOE.get(), "Copper Hoe");

        add(ModItems.SILVER_SWORD.get(), "Silver Sword");
        add(ModItems.SILVER_SHOVEL.get(), "Silver Shovel");
        add(ModItems.SILVER_PICKAXE.get(), "Silver Pickaxe");
        add(ModItems.SILVER_AXE.get(), "Silver Axe");
        add(ModItems.SILVER_HOE.get(), "Silver Hoe");

        add(ModItems.TITANIUM_SWORD.get(), "Titanium Sword");
        add(ModItems.TITANIUM_SHOVEL.get(), "Titanium Shovel");
        add(ModItems.TITANIUM_PICKAXE.get(), "Titanium Pickaxe");
        add(ModItems.TITANIUM_AXE.get(), "Titanium Axe");
        add(ModItems.TITANIUM_HOE.get(), "Titanium Hoe");

        add(ModItems.MITHRIL_SWORD.get(), "Mithril Sword");
        add(ModItems.MITHRIL_SHOVEL.get(), "Mithril Shovel");
        add(ModItems.MITHRIL_PICKAXE.get(), "Mithril Pickaxe");
        add(ModItems.MITHRIL_AXE.get(), "Mithril Axe");
        add(ModItems.MITHRIL_HOE.get(), "Mithril Hoe");

        add(ModItems.ADAMANTINE_SWORD.get(), "Adamantine Sword");
        add(ModItems.ADAMANTINE_SHOVEL.get(), "Adamantine Shovel");
        add(ModItems.ADAMANTINE_PICKAXE.get(), "Adamantine Pickaxe");
        add(ModItems.ADAMANTINE_AXE.get(), "Adamantine Axe");
        add(ModItems.ADAMANTINE_HOE.get(), "Adamantine Hoe");
    }
}
