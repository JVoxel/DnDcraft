package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.item.ModItems;
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

        // Materials

        add(ModBlocks.SILVER_ORE.get(), "Silver Ore");
        add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        add(ModBlocks.TITANIUM_ORE.get(), "Titanium Ore");
        add(ModBlocks.VANADIUM_ORE.get(), "Vanadium Ore");
        add(ModBlocks.MITHRIL_ORE.get(), "Mithril Ore");
        add(ModBlocks.ADAMANT_ORE.get(), "Adamant Ore");

        add(ModItems.SILVER_BLOCK.get(), "Silver Block");
        add(ModItems.TITANIUM_BLOCK.get(), "Titanium Block");
        add(ModItems.VANADIUM_BLOCK.get(), "Vanadium Block");
        add(ModItems.MITHRIL_BLOCK.get(), "Mithril Block");
        add(ModItems.ADAMANTINE_BLOCK.get(), "Adamantine Block");

        add(ModItems.RAW_SILVER.get(), "Raw Silver");
        add(ModItems.RAW_TITANIUM.get(), "Raw Titanium");
        add(ModItems.RAW_VANADIUM.get(), "Raw Vanadium");
        add(ModItems.RAW_MITHRIL.get(), "Raw Mithril");
        add(ModItems.RAW_ADAMANT.get(), "Raw Adamant");

        add(ModItems.COPPER_NUGGET.get(), "Copper Nugget");
        add(ModItems.SILVER_NUGGET.get(), "Silver Nugget");
        add(ModItems.TITANIUM_NUGGET.get(), "Titanium Nugget");
        add(ModItems.VANADIUM_NUGGET.get(), "Vanadium Nugget");
        add(ModItems.MITHRIL_NUGGET.get(), "Mithril Nugget");
        add(ModItems.ADAMANTINE_NUGGET.get(), "Adamantine Nugget");

        add(ModItems.SILVER_INGOT.get(), "Silver Ingot");
        add(ModItems.TITANIUM_INGOT.get(), "Titanium Ingot");
        add(ModItems.VANADIUM_INGOT.get(), "Vanadium Ingot");
        add(ModItems.MITHRIL_INGOT.get(), "Mithril Ingot");
        add(ModItems.ADAMANTINE_INGOT.get(), "Adamantine Ingot");

        add(ModItems.COPPER_CHAINMAIL_PLATE.get(), "Copper Chainmail Plate");
        add(ModItems.GOLD_CHAINMAIL_PLATE.get(), "Gold Chainmail Plate");
        add(ModItems.IRON_CHAINMAIL_PLATE.get(), "Iron Chainmail Plate");
        add(ModItems.SILVER_CHAINMAIL_PLATE.get(), "Silver Chainmail Plate");
        add(ModItems.TITANIUM_CHAINMAIL_PLATE.get(), "Titanium Chainmail Plate");
        add(ModItems.VANADIUM_CHAINMAIL_PLATE.get(), "Vanadium Chainmail Plate");
        add(ModItems.MITHRIL_CHAINMAIL_PLATE.get(), "Mithril Chainmail Plate");
        add(ModItems.ADAMANTINE_CHAINMAIL_PLATE.get(), "Adamantine Chainmail Plate");

        // Tools

        add(ModItems.BONE_SWORD.get(), "Bone Sword");
        add(ModItems.BONE_SHOVEL.get(), "Bone Shovel");
        add(ModItems.BONE_PICKAXE.get(), "Bone Pickaxe");
        add(ModItems.BONE_AXE.get(), "Bone Axe");
        add(ModItems.BONE_HOE.get(), "Bone Hoe");

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

        add(ModItems.VANADIUM_SWORD.get(), "Vanadium Sword");
        add(ModItems.VANADIUM_SHOVEL.get(), "Vanadium Shovel");
        add(ModItems.VANADIUM_PICKAXE.get(), "Vanadium Pickaxe");
        add(ModItems.VANADIUM_AXE.get(), "Vanadium Axe");
        add(ModItems.VANADIUM_HOE.get(), "Vanadium Hoe");

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

        // Armor

        add(ModItems.WOODEN_HELMET.get(), "Wooden Helmet");
        add(ModItems.WOODEN_CHESTPLATE.get(), "Wooden Chestplate");
        add(ModItems.WOODEN_LEGGINGS.get(), "Wooden Leggings");
        add(ModItems.WOODEN_BOOTS.get(), "Wooden Boots");

        add(ModItems.COPPER_CHAINMAIL_HELMET.get(), "Copper Chainmail Helmet");
        add(ModItems.COPPER_CHAINMAIL_CHESTPLATE.get(), "Copper Chainmail Chestplate");
        add(ModItems.COPPER_CHAINMAIL_LEGGINGS.get(), "Copper Chainmail Leggings");
        add(ModItems.COPPER_CHAINMAIL_BOOTS.get(), "Copper Chainmail Boots");

        add(ModItems.GOLD_CHAINMAIL_HELMET.get(), "Golden Chainmail Helmet");
        add(ModItems.GOLD_CHAINMAIL_CHESTPLATE.get(), "Golden Chainmail Chestplate");
        add(ModItems.GOLD_CHAINMAIL_LEGGINGS.get(), "Golden Chainmail Leggings");
        add(ModItems.GOLD_CHAINMAIL_BOOTS.get(), "Golden Chainmail Boots");

        add(ModItems.COPPER_HELMET.get(), "Copper Helmet");
        add(ModItems.COPPER_CHESTPLATE.get(), "Copper Chestplate");
        add(ModItems.COPPER_LEGGINGS.get(), "Copper Leggings");
        add(ModItems.COPPER_BOOTS.get(), "Copper Boots");

        add(ModItems.SILVER_CHAINMAIL_HELMET.get(), "Silver Chainmail Helmet");
        add(ModItems.SILVER_CHAINMAIL_CHESTPLATE.get(), "Silver Chainmail Chestplate");
        add(ModItems.SILVER_CHAINMAIL_LEGGINGS.get(), "Silver Chainmail Leggings");
        add(ModItems.SILVER_CHAINMAIL_BOOTS.get(), "Silver Chainmail Boots");

        add(ModItems.SILVER_HELMET.get(), "Silver Helmet");
        add(ModItems.SILVER_CHESTPLATE.get(), "Silver Chestplate");
        add(ModItems.SILVER_LEGGINGS.get(), "Silver Leggings");
        add(ModItems.SILVER_BOOTS.get(), "Silver Boots");

        add(ModItems.TITANIUM_CHAINMAIL_HELMET.get(), "Titanium Chainmail Helmet");
        add(ModItems.TITANIUM_CHAINMAIL_CHESTPLATE.get(), "Titanium Chainmail Chestplate");
        add(ModItems.TITANIUM_CHAINMAIL_LEGGINGS.get(), "Titanium Chainmail Leggings");
        add(ModItems.TITANIUM_CHAINMAIL_BOOTS.get(), "Titanium Chainmail Boots");

        add(ModItems.TITANIUM_HELMET.get(), "Titanium Helmet");
        add(ModItems.TITANIUM_CHESTPLATE.get(), "Titanium Chestplate");
        add(ModItems.TITANIUM_LEGGINGS.get(), "Titanium Leggings");
        add(ModItems.TITANIUM_BOOTS.get(), "Titanium Boots");

        add(ModItems.VANADIUM_CHAINMAIL_HELMET.get(), "Vanadium Chainmail Helmet");
        add(ModItems.VANADIUM_CHAINMAIL_CHESTPLATE.get(), "Vanadium Chainmail Chestplate");
        add(ModItems.VANADIUM_CHAINMAIL_LEGGINGS.get(), "Vanadium Chainmail Leggings");
        add(ModItems.VANADIUM_CHAINMAIL_BOOTS.get(), "Vanadium Chainmail Boots");

        add(ModItems.VANADIUM_HELMET.get(), "Vanadium Helmet");
        add(ModItems.VANADIUM_CHESTPLATE.get(), "Vanadium Chestplate");
        add(ModItems.VANADIUM_LEGGINGS.get(), "Vanadium Leggings");
        add(ModItems.VANADIUM_BOOTS.get(), "Vanadium Boots");

        add(ModItems.MITHRIL_CHAINMAIL_HELMET.get(), "Mithril Chainmail Helmet");
        add(ModItems.MITHRIL_CHAINMAIL_CHESTPLATE.get(), "Mithril Chainmail Chestplate");
        add(ModItems.MITHRIL_CHAINMAIL_LEGGINGS.get(), "Mithril Chainmail Leggings");
        add(ModItems.MITHRIL_CHAINMAIL_BOOTS.get(), "Mithril Chainmail Boots");

        add(ModItems.MITHRIL_HELMET.get(), "Mithril Helmet");
        add(ModItems.MITHRIL_CHESTPLATE.get(), "Mithril Chestplate");
        add(ModItems.MITHRIL_LEGGINGS.get(), "Mithril Leggings");
        add(ModItems.MITHRIL_BOOTS.get(), "Mithril Boots");

        add(ModItems.ADAMANTINE_CHAINMAIL_HELMET.get(), "Adamantine Chainmail Helmet");
        add(ModItems.ADAMANTINE_CHAINMAIL_CHESTPLATE.get(), "Adamantine Chainmail Chestplate");
        add(ModItems.ADAMANTINE_CHAINMAIL_LEGGINGS.get(), "Adamantine Chainmail Leggings");
        add(ModItems.ADAMANTINE_CHAINMAIL_BOOTS.get(), "Adamantine Chainmail Boots");

        add(ModItems.ADAMANTINE_HELMET.get(), "Adamantine Helmet");
        add(ModItems.ADAMANTINE_CHESTPLATE.get(), "Adamantine Chestplate");
        add(ModItems.ADAMANTINE_LEGGINGS.get(), "Adamantine Leggings");
        add(ModItems.ADAMANTINE_BOOTS.get(), "Adamantine Boots");
    }
}
