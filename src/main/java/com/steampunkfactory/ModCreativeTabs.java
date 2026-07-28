package com.steampunkfactory;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SteampunkFactoryMod.MODID);

    public static final RegistryObject<CreativeModeTab> STEAMPUNK_FACTORY_TAB = CREATIVE_TABS.register("steampunk_factory_tab",
        () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.steampunk_factory"))
            .icon(() -> new ItemStack(ModBlocks.HEAVY_GEARBOX_HOUSING.get()))
            .displayItems((parameters, output) -> {
                // Add all block items
                output.accept(ModItems.RIVETED_FACTORY_WALL_ITEM.get());
                output.accept(ModItems.RUSTY_FACTORY_WALL_ITEM.get());
                output.accept(ModItems.HEAVY_GEARBOX_HOUSING_ITEM.get());
                output.accept(ModItems.RUSTY_HEAVY_GEARBOX_HOUSING_ITEM.get());
                output.accept(ModItems.PIPE_MANIFOLD_ITEM.get());
                output.accept(ModItems.RUSTY_PIPE_MANIFOLD_ITEM.get());
                output.accept(ModItems.INDUSTRIAL_METAL_FLOOR_ITEM.get());
                output.accept(ModItems.RUSTY_INDUSTRIAL_METAL_FLOOR_ITEM.get());
                output.accept(ModItems.BRASS_CONTROL_PANEL_ITEM.get());
                output.accept(ModItems.RUSTY_BRASS_CONTROL_PANEL_ITEM.get());
                output.accept(ModItems.PISTON_ASSEMBLY_ITEM.get());
                output.accept(ModItems.STEAM_VENT_ITEM.get());
                output.accept(ModItems.HEAVY_MACHINERY_BLOCK_ITEM.get());
                output.accept(ModItems.CONTROL_LEVER_BLOCK_ITEM.get());

                output.accept(ModItems.AIRSHIP_HULL_ITEM.get());
                output.accept(ModItems.AIRSHIP_DECK_ITEM.get());
                output.accept(ModItems.BALLOON_FABRIC_ITEM.get());
                output.accept(ModItems.PROPELLER_ASSEMBLY_ITEM.get());
                output.accept(ModItems.GONDOLA_WALL_ITEM.get());
                output.accept(ModItems.AIRSHIP_BALLOON_TOP_ITEM.get());
                output.accept(ModItems.AIRSHIP_INTERIOR_WOOD_ITEM.get());
                output.accept(ModItems.BRASS_TRIM_DETAIL_ITEM.get());
                output.accept(ModItems.AIRSHIP_WINDOW_ITEM.get());
                output.accept(ModItems.AIRSHIP_CARGO_CRATE_ITEM.get());
                output.accept(ModItems.AIRSHIP_STEAM_ENGINE_SIDE_ITEM.get());
                output.accept(ModItems.BALLOON_DETAIL_ITEM.get());
                output.accept(ModItems.GONDOLA_ROOF_ITEM.get());
                output.accept(ModItems.BOILER_BLOCK_ITEM.get());
                output.accept(ModItems.RUSTY_BOILER_BLOCK_ITEM.get());
                output.accept(ModItems.BRASS_PLATING_ITEM.get());
                output.accept(ModItems.RUSTY_BRASS_PLATING_ITEM.get());
                output.accept(ModItems.MECHANICAL_PRESS_ITEM.get());
                output.accept(ModItems.GONDOLA_FLOOR_ITEM.get());
                output.accept(ModItems.CONVEYOR_BELT_ITEM.get());
                output.accept(ModItems.STEAM_PIPE_ITEM.get());
                output.accept(ModItems.RUSTY_STEAM_PIPE_ITEM.get());
                output.accept(ModItems.BRASS_GEARBOX_ITEM.get());
                output.accept(ModItems.BALLOON_SEGMENT_ITEM.get());
                output.accept(ModItems.GONDOLA_DOOR_ITEM.get());
                output.accept(ModItems.AIRSHIP_LAMP_ITEM.get());
                output.accept(ModItems.BRASS_RIVETED_PLATING_ITEM.get());
                output.accept(ModItems.MAGITECH_RUNIC_BLOCK_ITEM.get());
                output.accept(ModItems.MAGITECH_GLOWING_CRYSTAL_ITEM.get());

                // Add standalone items
                output.accept(ModItems.BRASS_GEAR.get());
                output.accept(ModItems.MECHANICS_WRENCH.get());
                output.accept(ModItems.PRESSURE_GAUGE.get());
                output.accept(ModItems.BRASS_STEAM_VALVE.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}