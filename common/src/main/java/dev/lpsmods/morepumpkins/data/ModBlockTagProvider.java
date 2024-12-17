package dev.lpsmods.morepumpkins.data;

import dev.lpsmods.morepumpkins.Constants;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

/**
 * Author: legopitstop
 */
public class ModBlockTagProvider extends TagsProvider<Block> {
    private static final TagKey<Block> CARVED_PUMPKINS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "carved_pumpkins"));
    private static final TagKey<Block> JACK_O_LANTERNS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "jack_o_lanterns"));
    private static final TagKey<Block> SOUL_JACK_O_LANTERNS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "soul_jack_o_lanterns"));

    protected ModBlockTagProvider(PackOutput pOutput, ResourceKey<? extends Registry<Block>> pRegistryKey, CompletableFuture<HolderLookup.Provider> pLookupProvider) {
        super(pOutput, pRegistryKey, pLookupProvider);
    }


    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
//        TagBuilder carvedPumpkins = TagsPgetOrCreateTagBuilder(CARVED_PUMPKINS);
//        TagBuilder jackOLanterns = getOrCreateTagBuilder(JACK_O_LANTERNS);
//        TagBuilder soulJackOLanterns = getOrCreateTagBuilder(SOUL_JACK_O_LANTERNS);

//        for (ResourceLocation variant : Constants.VARIANTS) {
//            carvedPumpkins.add(TagEntry.element(variant.withSuffix("_carved_pumpkin")));
//            jackOLanterns.add(TagEntry.element(variant.withSuffix("_jack_o_lantern")));
//            soulJackOLanterns.add(TagEntry.element(variant.withSuffix("_soul_jack_o_lantern")));
//        }
    }
}
