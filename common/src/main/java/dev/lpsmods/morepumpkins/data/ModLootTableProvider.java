package dev.lpsmods.morepumpkins.data;

import dev.lpsmods.morepumpkins.Constants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Optional;
import java.util.function.BiConsumer;


/**
 * Author: legopitstop
 */
public class ModLootTableProvider implements LootTableSubProvider {

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> biConsumer) {
        for (ResourceLocation variant : Constants.VARIANTS) {
            Optional<Holder.Reference<Block>> carvedPumpkin = BuiltInRegistries.BLOCK.get(variant.withSuffix("_carved_pumpkin"));
            Optional<Holder.Reference<Block>> jackOLantern = BuiltInRegistries.BLOCK.get(variant.withSuffix("_jack_o_lantern"));
            Optional<Holder.Reference<Block>> soulJackOLantern = BuiltInRegistries.BLOCK.get(variant.withSuffix("_soul_jack_o_lantern"));
//            createSingleItemTable(carvedPumpkin);
//            createSingleItemTable(jackOLantern);
//            createSingleItemTable(soulJackOLantern);
        }
    }
}
