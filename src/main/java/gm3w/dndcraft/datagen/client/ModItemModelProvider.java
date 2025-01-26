package gm3w.dndcraft.datagen.client;

import gm3w.dndcraft.DnDcraft;
import gm3w.dndcraft.registration.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
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
        simpleBlockItem(ModItems.DEEPSLATE_TITANIUM_ORE);
        simpleBlockItem(ModItems.MITHRIL_ORE);
        simpleBlockItem(ModItems.ADAMANT_ORE);

        simpleBlockItem(ModItems.SILVER_BLOCK);
        simpleBlockItem(ModItems.TITANIUM_BLOCK);
        simpleBlockItem(ModItems.MITHRIL_BLOCK);
        simpleBlockItem(ModItems.ADAMANTINE_BLOCK);

        simpleItem(ModItems.RAW_SILVER);
        simpleItem(ModItems.RAW_TITANIUM);
        simpleItem(ModItems.RAW_MITHRIL);
        simpleItem(ModItems.RAW_ADAMANT);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.TITANIUM_INGOT);
        simpleItem(ModItems.MITHRIL_INGOT);
        simpleItem(ModItems.ADAMANTINE_INGOT);

        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.TITANIUM_NUGGET);
        simpleItem(ModItems.MITHRIL_NUGGET);
        simpleItem(ModItems.ADAMANTINE_NUGGET);

        // Tools

        handheldItem(ModItems.BONE_PICKAXE);


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
