package com.steampunkfactory;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(SteampunkFactoryMod.MODID)
public class SteampunkFactoryMod {
    public static final String MODID = "steampunk_factory";
    private static final Logger LOGGER = LogUtils.getLogger();

    public SteampunkFactoryMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        com.steampunkfactory.blockentity.BoilerBlockEntity.BLOCK_ENTITIES.register(modEventBus);
        com.steampunkfactory.blockentity.PropellerBlockEntity.BLOCK_ENTITIES.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}