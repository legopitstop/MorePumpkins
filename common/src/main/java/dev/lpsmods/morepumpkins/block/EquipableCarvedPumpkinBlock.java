package dev.lpsmods.morepumpkins.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Author: legopitstop
 */
public class EquipableCarvedPumpkinBlock extends CarvedPumpkinBlock {
    public static final MapCodec<EquipableCarvedPumpkinBlock> CODEC = simpleCodec(EquipableCarvedPumpkinBlock::new);

    public MapCodec<EquipableCarvedPumpkinBlock> codec() {
        return CODEC;
    }

    public EquipableCarvedPumpkinBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }
}
