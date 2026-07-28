package com.steampunkfactory.client;

import com.steampunkfactory.SteampunkFactoryMod;
import com.steampunkfactory.blockentity.BoilerBlockEntity;
import com.steampunkfactory.blockentity.PropellerBlockEntity;
import com.steampunkfactory.client.renderer.BoilerBlockEntityRenderer;
import com.steampunkfactory.client.renderer.PropellerBlockEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SteampunkFactoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(BoilerBlockEntity.BOILER_BE.get(), BoilerBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(PropellerBlockEntity.PROPELLER_BE.get(), PropellerBlockEntityRenderer::new);
    }
}