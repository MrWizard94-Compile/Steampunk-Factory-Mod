package com.steampunkfactory.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.steampunkfactory.blockentity.PropellerBlockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

public class PropellerBlockEntityRenderer implements BlockEntityRenderer<PropellerBlockEntity> {

    public PropellerBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(PropellerBlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {

        poseStack.pushPose();

        // Center the block for rotation
        poseStack.translate(0.5D, 0.5D, 0.5D);

        // Rotate around Y axis (vertical spinning propeller)
        float rotation = blockEntity.getRotation(partialTick);
        poseStack.mulPose(Axis.YP.rotationDegrees(rotation));

        poseStack.translate(-0.5D, -0.5D, -0.5D);

        // The actual block model will be rendered by Minecraft after this.
        // For better visuals in the future, we could render a custom model here instead.

        poseStack.popPose();
    }
}