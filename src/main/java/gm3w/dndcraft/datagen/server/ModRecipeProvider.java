package gm3w.dndcraft.datagen.server;

import gm3w.dndcraft.block.ModBlocks;
import gm3w.dndcraft.item.ModItems;
import com.google.common.collect.ImmutableList;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    protected static final ImmutableList<ItemLike> SILVER_SMELTABLES = ImmutableList.of(ModItems.RAW_SILVER.get(), ModItems.SILVER_ORE.get(), ModItems.DEEPSLATE_SILVER_ORE.get());
    protected static final ImmutableList<ItemLike> TITANIUM_SMELTABLES = ImmutableList.of(ModItems.RAW_TITANIUM.get(), ModItems.TITANIUM_ORE.get(), ModItems.DEEPSLATE_TITANIUM_ORE.get());
    protected static final ImmutableList<ItemLike> MITHRIL_SMELTABLES = ImmutableList.of(ModItems.RAW_MITHRIL.get(), ModItems.MITHRIL_ORE.get());
    protected static final ImmutableList<ItemLike> ADAMANT_SMELTABLES = ImmutableList.of(ModItems.RAW_ADAMANT.get(), ModItems.ADAMANT_ORE.get());

    public ModRecipeProvider(DataGenerator gen) { super(gen); }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        oreSmelting(pFinishedRecipeConsumer, SILVER_SMELTABLES, ModItems.SILVER_INGOT.get(), 0.7F, 200, "silver_ingot");
        oreSmelting(pFinishedRecipeConsumer, TITANIUM_SMELTABLES, ModItems.TITANIUM_INGOT.get(), 1.0F, 200, "titanium_ingot");
        oreSmelting(pFinishedRecipeConsumer, MITHRIL_SMELTABLES, ModItems.MITHRIL_INGOT.get(), 1.2F, 200, "mithril_ingot");
        oreSmelting(pFinishedRecipeConsumer, ADAMANT_SMELTABLES, ModItems.ADAMANTINE_INGOT.get(), 1.5F, 200, "adamantine_ingot");
        oreBlasting(pFinishedRecipeConsumer, SILVER_SMELTABLES, ModItems.SILVER_INGOT.get(), 0.7F, 100, "silver_ingot");
        oreBlasting(pFinishedRecipeConsumer, TITANIUM_SMELTABLES, ModItems.TITANIUM_INGOT.get(), 1.0F, 100, "titanium_ingot");
        oreBlasting(pFinishedRecipeConsumer, MITHRIL_SMELTABLES, ModItems.MITHRIL_INGOT.get(), 1.2F, 100, "mithril_ingot");
        oreBlasting(pFinishedRecipeConsumer, ADAMANT_SMELTABLES, ModItems.ADAMANTINE_INGOT.get(), 1.5F, 100, "adamantine_ingot");

        ShapedRecipeBuilder.shaped(ModItems.BONE_AXE.get()).define('#', Items.STICK).define('X', Items.BONE).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_bone_ingot", has(Items.BONE)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.BONE_HOE.get()).define('#', Items.STICK).define('X', Items.BONE).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_bone_ingot", has(Items.BONE)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.BONE_PICKAXE.get()).define('#', Items.STICK).define('X', Items.BONE).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_bone_ingot", has(Items.BONE)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.BONE_SHOVEL.get()).define('#', Items.STICK).define('X', Items.BONE).pattern("X").pattern("#").pattern("#").unlockedBy("has_bone_ingot", has(Items.BONE)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.BONE_SWORD.get()).define('#', Items.STICK).define('X', Items.BONE).pattern("X").pattern("X").pattern("#").unlockedBy("has_bone_ingot", has(Items.BONE)).save(pFinishedRecipeConsumer);

        nineBlockStorageRecipes(pFinishedRecipeConsumer, Items.COPPER_INGOT, Blocks.COPPER_BLOCK);
        nineBlockStorageRecipesWithCustomPacking(pFinishedRecipeConsumer, ModItems.COPPER_NUGGET.get(), Items.COPPER_INGOT, "copper_ingot_from_nuggets", "copper_ingot");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.COPPER_AXE.get(), ModItems.COPPER_HOE.get(), ModItems.COPPER_PICKAXE.get(), ModItems.COPPER_SHOVEL.get(), ModItems.COPPER_SWORD.get()), ModItems.COPPER_NUGGET.get(), 0.1F, 200);
        ShapedRecipeBuilder.shaped(ModItems.COPPER_AXE.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.COPPER_HOE.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.COPPER_PICKAXE.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.COPPER_SHOVEL.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT).pattern("X").pattern("#").pattern("#").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.COPPER_SWORD.get()).define('#', Items.STICK).define('X', Items.COPPER_INGOT).pattern("X").pattern("X").pattern("#").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pFinishedRecipeConsumer);

        nineBlockStorageRecipes(pFinishedRecipeConsumer, ModItems.SILVER_INGOT.get(), ModBlocks.SILVER_BLOCK.get());
        nineBlockStorageRecipesWithCustomPacking(pFinishedRecipeConsumer, ModItems.SILVER_NUGGET.get(), ModItems.SILVER_INGOT.get(), "silver_ingot_from_nuggets", "silver_ingot");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.SILVER_AXE.get(), ModItems.SILVER_HOE.get(), ModItems.SILVER_PICKAXE.get(), ModItems.SILVER_SHOVEL.get(), ModItems.SILVER_SWORD.get()), ModItems.SILVER_NUGGET.get(), 0.1F, 200);
        ShapedRecipeBuilder.shaped(ModItems.SILVER_AXE.get()).define('#', Items.STICK).define('X', ModItems.SILVER_INGOT.get()).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.SILVER_HOE.get()).define('#', Items.STICK).define('X', ModItems.SILVER_INGOT.get()).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.SILVER_PICKAXE.get()).define('#', Items.STICK).define('X', ModItems.SILVER_INGOT.get()).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.SILVER_SHOVEL.get()).define('#', Items.STICK).define('X', ModItems.SILVER_INGOT.get()).pattern("X").pattern("#").pattern("#").unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.SILVER_SWORD.get()).define('#', Items.STICK).define('X', ModItems.SILVER_INGOT.get()).pattern("X").pattern("X").pattern("#").unlockedBy("has_silver_ingot", has(ModItems.SILVER_INGOT.get())).save(pFinishedRecipeConsumer);

        nineBlockStorageRecipes(pFinishedRecipeConsumer, ModItems.TITANIUM_INGOT.get(), ModBlocks.TITANIUM_BLOCK.get());
        nineBlockStorageRecipesWithCustomPacking(pFinishedRecipeConsumer, ModItems.TITANIUM_NUGGET.get(), ModItems.TITANIUM_INGOT.get(), "titanium_ingot_from_nuggets", "titanium_ingot");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.TITANIUM_AXE.get(), ModItems.TITANIUM_HOE.get(), ModItems.TITANIUM_PICKAXE.get(), ModItems.TITANIUM_SHOVEL.get(), ModItems.TITANIUM_SWORD.get()), ModItems.TITANIUM_NUGGET.get(), 0.1F, 200);
        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_AXE.get()).define('#', Items.STICK).define('X', ModItems.TITANIUM_INGOT.get()).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_titanium_ingot", has(ModItems.TITANIUM_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_HOE.get()).define('#', Items.STICK).define('X', ModItems.TITANIUM_INGOT.get()).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_titanium_ingot", has(ModItems.TITANIUM_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_PICKAXE.get()).define('#', Items.STICK).define('X', ModItems.TITANIUM_INGOT.get()).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_titanium_ingot", has(ModItems.TITANIUM_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_SHOVEL.get()).define('#', Items.STICK).define('X', ModItems.TITANIUM_INGOT.get()).pattern("X").pattern("#").pattern("#").unlockedBy("has_titanium_ingot", has(ModItems.TITANIUM_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANIUM_SWORD.get()).define('#', Items.STICK).define('X', ModItems.TITANIUM_INGOT.get()).pattern("X").pattern("X").pattern("#").unlockedBy("has_titanium_ingot", has(ModItems.TITANIUM_INGOT.get())).save(pFinishedRecipeConsumer);

        nineBlockStorageRecipes(pFinishedRecipeConsumer, ModItems.MITHRIL_INGOT.get(), ModBlocks.MITHRIL_BLOCK.get());
        nineBlockStorageRecipesWithCustomPacking(pFinishedRecipeConsumer, ModItems.MITHRIL_NUGGET.get(), ModItems.MITHRIL_INGOT.get(), "mithril_ingot_from_nuggets", "mithril_ingot");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.MITHRIL_AXE.get(), ModItems.MITHRIL_HOE.get(), ModItems.MITHRIL_PICKAXE.get(), ModItems.MITHRIL_SHOVEL.get(), ModItems.MITHRIL_SWORD.get()), ModItems.MITHRIL_NUGGET.get(), 0.1F, 200);
        ShapedRecipeBuilder.shaped(ModItems.MITHRIL_AXE.get()).define('#', Items.STICK).define('X', ModItems.MITHRIL_INGOT.get()).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.MITHRIL_HOE.get()).define('#', Items.STICK).define('X', ModItems.MITHRIL_INGOT.get()).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.MITHRIL_PICKAXE.get()).define('#', Items.STICK).define('X', ModItems.MITHRIL_INGOT.get()).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.MITHRIL_SHOVEL.get()).define('#', Items.STICK).define('X', ModItems.MITHRIL_INGOT.get()).pattern("X").pattern("#").pattern("#").unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.MITHRIL_SWORD.get()).define('#', Items.STICK).define('X', ModItems.MITHRIL_INGOT.get()).pattern("X").pattern("X").pattern("#").unlockedBy("has_mithril_ingot", has(ModItems.MITHRIL_INGOT.get())).save(pFinishedRecipeConsumer);

        nineBlockStorageRecipes(pFinishedRecipeConsumer, ModItems.ADAMANTINE_INGOT.get(), ModBlocks.ADAMANTINE_BLOCK.get());
        nineBlockStorageRecipesWithCustomPacking(pFinishedRecipeConsumer, ModItems.ADAMANTINE_NUGGET.get(), ModItems.ADAMANTINE_INGOT.get(), "adamantine_ingot_from_nuggets", "adamantine_ingot");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.ADAMANTINE_AXE.get(), ModItems.ADAMANTINE_HOE.get(), ModItems.ADAMANTINE_PICKAXE.get(), ModItems.ADAMANTINE_SHOVEL.get(), ModItems.ADAMANTINE_SWORD.get()), ModItems.ADAMANTINE_NUGGET.get(), 0.1F, 200);
        ShapedRecipeBuilder.shaped(ModItems.ADAMANTINE_AXE.get()).define('#', Items.STICK).define('X', ModItems.ADAMANTINE_INGOT.get()).pattern("XX").pattern("X#").pattern(" #").unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.ADAMANTINE_HOE.get()).define('#', Items.STICK).define('X', ModItems.ADAMANTINE_INGOT.get()).pattern("XX").pattern(" #").pattern(" #").unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.ADAMANTINE_PICKAXE.get()).define('#', Items.STICK).define('X', ModItems.ADAMANTINE_INGOT.get()).pattern("XXX").pattern(" # ").pattern(" # ").unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.ADAMANTINE_SHOVEL.get()).define('#', Items.STICK).define('X', ModItems.ADAMANTINE_INGOT.get()).pattern("X").pattern("#").pattern("#").unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get())).save(pFinishedRecipeConsumer);
        ShapedRecipeBuilder.shaped(ModItems.ADAMANTINE_SWORD.get()).define('#', Items.STICK).define('X', ModItems.ADAMANTINE_INGOT.get()).pattern("X").pattern("X").pattern("#").unlockedBy("has_adamantine_ingot", has(ModItems.ADAMANTINE_INGOT.get())).save(pFinishedRecipeConsumer);

    }
}
