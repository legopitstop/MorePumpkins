package dev.lpsmods.morepumpkins.data;

import dev.lpsmods.morepumpkins.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/**
 * Author: legopitstop
 */
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider lookupProvider, RecipeOutput output) {
        super(lookupProvider, output);
    }

    @Override
    public void buildRecipes() {
        // Jack O'Lantern Recipes
//        Item soulJackOLantern = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "soul_jack_o_lantern")).get().value();
//
//        for (ResourceLocation variant : Constants.VARIANTS) {
//            Item carvedPumpkin = BuiltInRegistries.ITEM.get(variant.withSuffix("_carved_pumpkin")).get().value();
//            Item jack = BuiltInRegistries.ITEM.get(variant.withSuffix("_jack_o_lantern")).get().value();
//            Item soulJack = BuiltInRegistries.ITEM.get(variant.withSuffix("_soul_jack_o_lantern")).get().value();
//            ShapedRecipeBuilder.shaped(this.registries, RecipeCategory.BUILDING_BLOCKS, jack).pattern("A").pattern("B")
//                    .define('A', carvedPumpkin)
//                    .define('B', Blocks.TORCH)
//                    .unlockedBy(RecipeProvider.getHasName(carvedPumpkin),
//                            RecipeProvider.has(carvedPumpkin))
//                    .unlockedBy(RecipeProvider.getHasName(jack),
//                            RecipeProvider.has(jack))
//                    .save(this);
//            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, soulJack).pattern("A").pattern("B")
//                    .define('A', carvedPumpkin)
//                    .define('B', Blocks.SOUL_TORCH)
//                    .unlockedBy(RecipeProvider.getHasName(carvedPumpkin),
//                            RecipeProvider.has(carvedPumpkin))
//                    .unlockedBy(RecipeProvider.getHasName(soulJack),
//                            RecipeProvider.has(soulJack))
//                    .save(this);
//
//            // Stonecutter
//            Item carved = BuiltInRegistries.ITEM.get(variant.withSuffix("_pumpkin"));
//            // vanilla -> custom
//            RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, carved, Items.CARVED_PUMPKIN);
//            RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, jack, Items.JACK_O_LANTERN);
//            RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, soulJack, soulJackOLantern);
//            // custom -> vanilla
////            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.CARVED_PUMPKIN, carved);
////            FabricRecipeProvider.offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.JACK_O_LANTERN, jack);
//            RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, soulJackOLantern, soulJack);
//
//        }
//        // Stonecutter - Convert variants
//        for (ResourceLocation variant1 : Constants.VARIANTS) {
//            for (ResourceLocation variant2 : Constants.VARIANTS) {
//                if (!Objects.equals(variant1, variant2)) { // Ignore duplicate input=outputs
//                    Item jackOutput = BuiltInRegistries.ITEM.get(variant1.withSuffix("_jack_o_lantern"));
//                    Item jackInput = BuiltInRegistries.ITEM.get(variant2.withSuffix("_jack_o_lantern"));
//                    RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, jackOutput, jackInput);
//
//                    Item soulJackOutput = BuiltInRegistries.ITEM.get(variant1.withSuffix("_soul_jack_o_lantern"));
//                    Item soulJackInput = BuiltInRegistries.ITEM.get(variant2.withSuffix("_soul_jack_o_lantern"));
//                    RecipeProvider.stonecutterResultFromBase(exporter, RecipeCategory.BUILDING_BLOCKS, soulJackOutput, soulJackInput);
//                }
//            }
//        }
    }
}
