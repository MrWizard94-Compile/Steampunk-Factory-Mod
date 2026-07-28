package com.steampunkfactory.blockentity;

import com.steampunkfactory.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PropellerBlockEntity extends BlockEntity {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
        DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, "steampunk_factory");

    public static final RegistryObject<BlockEntityType<PropellerBlockEntity>> PROPELLER_BE = BLOCK_ENTITIES.register("propeller",
        () -> BlockEntityType.Builder.of(PropellerBlockEntity::new, ModBlocks.PROPELLER_ASSEMBLY.get()).build(null));

    public float rotation = 0;
    public float rotationSpeed = 12.0f; // degrees per tick

    public PropellerBlockEntity(BlockPos pos, BlockState state) {
        super(PROPELLER_BE.get(), pos, state);
    }

    public static void tick(net.minecraft.world.level.Level level, BlockPos pos, BlockState state, PropellerBlockEntity blockEntity) {
        if (level.isClientSide) {
            // Smooth continuous rotation
            blockEntity.rotation += blockEntity.rotationSpeed;
            if (blockEntity.rotation >= 360) {
                blockEntity.rotation -= 360;
            }
        }
    }

    public float getRotation(float partialTick) {
        return rotation + (partialTick * rotationSpeed);
    }
}