package com.steampunkfactory.blockentity;

import com.steampunkfactory.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoilerBlockEntity extends BlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "steampunk_factory");

    public static final RegistryObject<BlockEntityType<BoilerBlockEntity>> BOILER_BE = BLOCK_ENTITIES.register("boiler",
        () -> BlockEntityType.Builder.of(BoilerBlockEntity::new, ModBlocks.BOILER_BLOCK.get()).build(null));

    private int heatLevel = 0;
    private int ticksSinceLastIncrease = 0;

    public BoilerBlockEntity(BlockPos pos, BlockState state) {
        super(BOILER_BE.get(), pos, state);
    }

    public static void tick(Level level, BlockPos pos, BlockState state, BoilerBlockEntity blockEntity) {
        if (level.isClientSide) {
            // Client-side: spawn steam particles when hot
            if (blockEntity.heatLevel >= 6 && level.random.nextFloat() < 0.4f) {
                double x = pos.getX() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;
                double y = pos.getY() + 1.0;
                double z = pos.getZ() + 0.5 + (level.random.nextDouble() - 0.5) * 0.6;
                level.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 0.0, 0.05, 0.0);
            }
            return;
        }

        // Server-side heat logic
        blockEntity.ticksSinceLastIncrease++;

        if (blockEntity.ticksSinceLastIncrease >= 30) {
            if (blockEntity.heatLevel < 10) {
                blockEntity.heatLevel++;
                blockEntity.setChanged();
            }
            blockEntity.ticksSinceLastIncrease = 0;
        }
    }

    public int getHeatLevel() {
        return heatLevel;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putInt("HeatLevel", heatLevel);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        heatLevel = tag.getInt("HeatLevel");
    }
}