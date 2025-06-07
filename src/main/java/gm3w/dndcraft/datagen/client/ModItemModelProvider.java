package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DnDcraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleBlockItem(ModItems.SILVER_ORE);
        simpleBlockItem(ModItems.DEEPSLATE_SILVER_ORE);
        simpleBlockItem(ModItems.TITANIUM_ORE);
        simpleBlockItem(ModItems.VANADIUM_ORE);
        simpleBlockItem(ModItems.MITHRIL_ORE);
        simpleBlockItem(ModItems.ADAMANT_ORE);

        simpleBlockItem(ModItems.SILVER_BLOCK);
        simpleBlockItem(ModItems.TITANIUM_BLOCK);
        simpleBlockItem(ModItems.VANADIUM_BLOCK);
        simpleBlockItem(ModItems.MITHRIL_BLOCK);
        simpleBlockItem(ModItems.ADAMANTINE_BLOCK);

        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_TITANIUM);
        simpleItem(ModItems.RAW_VANADIUM);
        simpleItem(ModItems.RAW_MITHRIL);
        simpleItem(ModItems.RAW_ADAMANT);

        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.TITANIUM_NUGGET);
        simpleItem(ModItems.VANADIUM_NUGGET);
        simpleItem(ModItems.MITHRIL_NUGGET);
        simpleItem(ModItems.ADAMANTINE_NUGGET);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.VANADIUM_INGOT);
        simpleItem(ModItems.MITHRIL_INGOT);
        simpleItem(ModItems.ADAMANTINE_INGOT);

        simpleItem(ModItems.COPPER_CHAINMAIL_PLATE);
        simpleItem(ModItems.GOLD_CHAINMAIL_PLATE);
        simpleItem(ModItems.IRON_CHAINMAIL_PLATE);
        simpleItem(ModItems.SILVER_CHAINMAIL_PLATE);
        simpleItem(ModItems.TITANIUM_CHAINMAIL_PLATE);
        simpleItem(ModItems.VANADIUM_CHAINMAIL_PLATE);
        simpleItem(ModItems.MITHRIL_CHAINMAIL_PLATE);
        simpleItem(ModItems.ADAMANTINE_CHAINMAIL_PLATE);

//        simpleItem(ModItems.DINOSAUR_HIDE);
//        simpleItem(ModItems.DRAGON_HIDE);

        // Tools

        handheldItem(ModItems.BONE_SWORD);
        handheldItem(ModItems.BONE_SHOVEL);
        handheldItem(ModItems.BONE_PICKAXE);
        handheldItem(ModItems.BONE_AXE);
        handheldItem(ModItems.BONE_HOE);

        handheldItem(ModItems.COPPER_SWORD);
        handheldItem(ModItems.COPPER_SHOVEL);
        handheldItem(ModItems.COPPER_PICKAXE);
        handheldItem(ModItems.COPPER_AXE);
        handheldItem(ModItems.COPPER_HOE);

        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_HOE);

        handheldItem(ModItems.TITANIUM_SWORD);
        handheldItem(ModItems.TITANIUM_SHOVEL);
        handheldItem(ModItems.TITANIUM_PICKAXE);
        handheldItem(ModItems.TITANIUM_AXE);
        handheldItem(ModItems.TITANIUM_HOE);

        handheldItem(ModItems.VANADIUM_SWORD);
        handheldItem(ModItems.VANADIUM_SHOVEL);
        handheldItem(ModItems.VANADIUM_PICKAXE);
        handheldItem(ModItems.VANADIUM_AXE);
        handheldItem(ModItems.VANADIUM_HOE);

        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_HOE);

        handheldItem(ModItems.ADAMANTINE_SWORD);
        handheldItem(ModItems.ADAMANTINE_SHOVEL);
        handheldItem(ModItems.ADAMANTINE_PICKAXE);
        handheldItem(ModItems.ADAMANTINE_AXE);
        handheldItem(ModItems.ADAMANTINE_HOE);

        simpleItem(ModItems.WOODEN_HELMET);
        simpleItem(ModItems.WOODEN_CHESTPLATE);
        simpleItem(ModItems.WOODEN_LEGGINGS);
        simpleItem(ModItems.WOODEN_BOOTS);
        simpleItem(ModItems.COPPER_CHAINMAIL_HELMET);
        simpleItem(ModItems.COPPER_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.COPPER_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.COPPER_CHAINMAIL_BOOTS);
        simpleItem(ModItems.GOLD_CHAINMAIL_HELMET);
        simpleItem(ModItems.GOLD_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.GOLD_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.GOLD_CHAINMAIL_BOOTS);
        simpleItem(ModItems.COPPER_HELMET);
        simpleItem(ModItems.COPPER_CHESTPLATE);
        simpleItem(ModItems.COPPER_LEGGINGS);
        simpleItem(ModItems.COPPER_BOOTS);
        simpleItem(ModItems.SILVER_CHAINMAIL_HELMET);
        simpleItem(ModItems.SILVER_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.SILVER_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.SILVER_CHAINMAIL_BOOTS);
        simpleItem(ModItems.SILVER_HELMET);
        simpleItem(ModItems.SILVER_CHESTPLATE);
        simpleItem(ModItems.SILVER_LEGGINGS);
        simpleItem(ModItems.SILVER_BOOTS);
//        simpleItem(ModItems.DINO_HELMET);
//        simpleItem(ModItems.DINO_CHESTPLATE);
//        simpleItem(ModItems.DINO_LEGGINGS);
//        simpleItem(ModItems.DINO_BOOTS);
        simpleItem(ModItems.TITANIUM_CHAINMAIL_HELMET);
        simpleItem(ModItems.TITANIUM_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.TITANIUM_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.TITANIUM_CHAINMAIL_BOOTS);
        simpleItem(ModItems.TITANIUM_HELMET);
        simpleItem(ModItems.TITANIUM_CHESTPLATE);
        simpleItem(ModItems.TITANIUM_LEGGINGS);
        simpleItem(ModItems.TITANIUM_BOOTS);
//        simpleItem(ModItems.DWARVEN_HELMET);
//        simpleItem(ModItems.DWARVEN_CHESTPLATE);
//        simpleItem(ModItems.DWARVEN_LEGGINGS);
//        simpleItem(ModItems.DWARVEN_BOOTS);
        simpleItem(ModItems.VANADIUM_CHAINMAIL_HELMET);
        simpleItem(ModItems.VANADIUM_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.VANADIUM_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.VANADIUM_CHAINMAIL_BOOTS);
        simpleItem(ModItems.VANADIUM_HELMET);
        simpleItem(ModItems.VANADIUM_CHESTPLATE);
        simpleItem(ModItems.VANADIUM_LEGGINGS);
        simpleItem(ModItems.VANADIUM_BOOTS);
//        simpleItem(ModItems.DRAGON_HELMET);
//        simpleItem(ModItems.DRAGON_CHESTPLATE);
//        simpleItem(ModItems.DRAGON_LEGGINGS);
//        simpleItem(ModItems.DRAGON_BOOTS);
        simpleItem(ModItems.MITHRIL_CHAINMAIL_HELMET);
        simpleItem(ModItems.MITHRIL_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.MITHRIL_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.MITHRIL_CHAINMAIL_BOOTS);
        simpleItem(ModItems.MITHRIL_HELMET);
        simpleItem(ModItems.MITHRIL_CHESTPLATE);
        simpleItem(ModItems.MITHRIL_LEGGINGS);
        simpleItem(ModItems.MITHRIL_BOOTS);
//        simpleItem(ModItems.AZER_HELMET);
//        simpleItem(ModItems.AZER_CHESTPLATE);
//        simpleItem(ModItems.AZER_LEGGINGS);
//        simpleItem(ModItems.AZER_BOOTS);
        simpleItem(ModItems.ADAMANTINE_CHAINMAIL_HELMET);
        simpleItem(ModItems.ADAMANTINE_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.ADAMANTINE_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.ADAMANTINE_CHAINMAIL_BOOTS);
        simpleItem(ModItems.ADAMANTINE_HELMET);
        simpleItem(ModItems.ADAMANTINE_CHESTPLATE);
        simpleItem(ModItems.ADAMANTINE_LEGGINGS);
        simpleItem(ModItems.ADAMANTINE_BOOTS);
    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), mcLoc("item/generated")).texture("layer0", modLoc( "item/" + item.getId().getPath()));
    }

    public ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), mcLoc("item/handheld")).texture("layer0", modLoc( "item/" + item.getId().getPath()));
    }

    public ItemModelBuilder simpleBlockItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), modLoc("block/" + item.getId().getPath()));
    }
}
