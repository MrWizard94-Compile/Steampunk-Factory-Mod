package com.steampunkfactory;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, SteampunkFactoryMod.MODID);

    // Block Items for all blocks
    public static final RegistryObject<Item> RIVETED_FACTORY_WALL_ITEM = ITEMS.register("riveted_factory_wall",
        () -> new BlockItem(ModBlocks.RIVETED_FACTORY_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_FACTORY_WALL_ITEM = ITEMS.register("rusty_factory_wall",
        () -> new BlockItem(ModBlocks.RUSTY_FACTORY_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> HEAVY_GEARBOX_HOUSING_ITEM = ITEMS.register("heavy_gearbox_housing",
        () -> new BlockItem(ModBlocks.HEAVY_GEARBOX_HOUSING.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_HEAVY_GEARBOX_HOUSING_ITEM = ITEMS.register("rusty_heavy_gearbox_housing",
        () -> new BlockItem(ModBlocks.RUSTY_HEAVY_GEARBOX_HOUSING.get(), new Item.Properties()));

    public static final RegistryObject<Item> PIPE_MANIFOLD_ITEM = ITEMS.register("pipe_manifold",
        () -> new BlockItem(ModBlocks.PIPE_MANIFOLD.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_PIPE_MANIFOLD_ITEM = ITEMS.register("rusty_pipe_manifold",
        () -> new BlockItem(ModBlocks.RUSTY_PIPE_MANIFOLD.get(), new Item.Properties()));

    public static final RegistryObject<Item> INDUSTRIAL_METAL_FLOOR_ITEM = ITEMS.register("industrial_metal_floor",
        () -> new BlockItem(ModBlocks.INDUSTRIAL_METAL_FLOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_INDUSTRIAL_METAL_FLOOR_ITEM = ITEMS.register("rusty_industrial_metal_floor",
        () -> new BlockItem(ModBlocks.RUSTY_INDUSTRIAL_METAL_FLOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRASS_CONTROL_PANEL_ITEM = ITEMS.register("brass_control_panel",
        () -> new BlockItem(ModBlocks.BRASS_CONTROL_PANEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_BRASS_CONTROL_PANEL_ITEM = ITEMS.register("rusty_brass_control_panel",
        () -> new BlockItem(ModBlocks.RUSTY_BRASS_CONTROL_PANEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> PISTON_ASSEMBLY_ITEM = ITEMS.register("piston_assembly",
        () -> new BlockItem(ModBlocks.PISTON_ASSEMBLY.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEAM_VENT_ITEM = ITEMS.register("steam_vent",
        () -> new BlockItem(ModBlocks.STEAM_VENT.get(), new Item.Properties()));

    public static final RegistryObject<Item> HEAVY_MACHINERY_BLOCK_ITEM = ITEMS.register("heavy_machinery_block",
        () -> new BlockItem(ModBlocks.HEAVY_MACHINERY_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> CONTROL_LEVER_BLOCK_ITEM = ITEMS.register("control_lever_block",
        () -> new BlockItem(ModBlocks.CONTROL_LEVER_BLOCK.get(), new Item.Properties()));

    // Airship Block Items
    public static final RegistryObject<Item> AIRSHIP_HULL_ITEM = ITEMS.register("airship_hull",
        () -> new BlockItem(ModBlocks.AIRSHIP_HULL.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_DECK_ITEM = ITEMS.register("airship_deck",
        () -> new BlockItem(ModBlocks.AIRSHIP_DECK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BALLOON_FABRIC_ITEM = ITEMS.register("balloon_fabric",
        () -> new BlockItem(ModBlocks.BALLOON_FABRIC.get(), new Item.Properties()));

    public static final RegistryObject<Item> PROPELLER_ASSEMBLY_ITEM = ITEMS.register("propeller_assembly",
        () -> new BlockItem(ModBlocks.PROPELLER_ASSEMBLY.get(), new Item.Properties()));

    public static final RegistryObject<Item> GONDOLA_WALL_ITEM = ITEMS.register("gondola_wall",
        () -> new BlockItem(ModBlocks.GONDOLA_WALL.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_BALLOON_TOP_ITEM = ITEMS.register("airship_balloon_top",
        () -> new BlockItem(ModBlocks.AIRSHIP_BALLOON_TOP.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_INTERIOR_WOOD_ITEM = ITEMS.register("airship_interior_wood",
        () -> new BlockItem(ModBlocks.AIRSHIP_INTERIOR_WOOD.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRASS_TRIM_DETAIL_ITEM = ITEMS.register("brass_trim_detail",
        () -> new BlockItem(ModBlocks.BRASS_TRIM_DETAIL.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_WINDOW_ITEM = ITEMS.register("airship_window",
        () -> new BlockItem(ModBlocks.AIRSHIP_WINDOW.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_CARGO_CRATE_ITEM = ITEMS.register("airship_cargo_crate",
        () -> new BlockItem(ModBlocks.AIRSHIP_CARGO_CRATE.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_STEAM_ENGINE_SIDE_ITEM = ITEMS.register("airship_steam_engine_side",
        () -> new BlockItem(ModBlocks.AIRSHIP_STEAM_ENGINE_SIDE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BALLOON_DETAIL_ITEM = ITEMS.register("balloon_detail",
        () -> new BlockItem(ModBlocks.BALLOON_DETAIL.get(), new Item.Properties()));

    public static final RegistryObject<Item> GONDOLA_ROOF_ITEM = ITEMS.register("gondola_roof",
        () -> new BlockItem(ModBlocks.GONDOLA_ROOF.get(), new Item.Properties()));

    // New Factory Block Items
    public static final RegistryObject<Item> BOILER_BLOCK_ITEM = ITEMS.register("boiler_block",
        () -> new BlockItem(ModBlocks.BOILER_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_BOILER_BLOCK_ITEM = ITEMS.register("rusty_boiler_block",
        () -> new BlockItem(ModBlocks.RUSTY_BOILER_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRASS_PLATING_ITEM = ITEMS.register("brass_plating",
        () -> new BlockItem(ModBlocks.BRASS_PLATING.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_BRASS_PLATING_ITEM = ITEMS.register("rusty_brass_plating",
        () -> new BlockItem(ModBlocks.RUSTY_BRASS_PLATING.get(), new Item.Properties()));

    public static final RegistryObject<Item> MECHANICAL_PRESS_ITEM = ITEMS.register("mechanical_press",
        () -> new BlockItem(ModBlocks.MECHANICAL_PRESS.get(), new Item.Properties()));

    public static final RegistryObject<Item> GONDOLA_FLOOR_ITEM = ITEMS.register("gondola_floor",
        () -> new BlockItem(ModBlocks.GONDOLA_FLOOR.get(), new Item.Properties()));

    // More Factory Block Items
    public static final RegistryObject<Item> CONVEYOR_BELT_ITEM = ITEMS.register("conveyor_belt",
        () -> new BlockItem(ModBlocks.CONVEYOR_BELT.get(), new Item.Properties()));

    public static final RegistryObject<Item> STEAM_PIPE_ITEM = ITEMS.register("steam_pipe",
        () -> new BlockItem(ModBlocks.STEAM_PIPE.get(), new Item.Properties()));

    public static final RegistryObject<Item> RUSTY_STEAM_PIPE_ITEM = ITEMS.register("rusty_steam_pipe",
        () -> new BlockItem(ModBlocks.RUSTY_STEAM_PIPE.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRASS_GEARBOX_ITEM = ITEMS.register("brass_gearbox",
        () -> new BlockItem(ModBlocks.BRASS_GEARBOX.get(), new Item.Properties()));

    // More Airship Block Items
    public static final RegistryObject<Item> BALLOON_SEGMENT_ITEM = ITEMS.register("balloon_segment",
        () -> new BlockItem(ModBlocks.BALLOON_SEGMENT.get(), new Item.Properties()));

    public static final RegistryObject<Item> GONDOLA_DOOR_ITEM = ITEMS.register("gondola_door",
        () -> new BlockItem(ModBlocks.GONDOLA_DOOR.get(), new Item.Properties()));

    public static final RegistryObject<Item> AIRSHIP_LAMP_ITEM = ITEMS.register("airship_lamp",
        () -> new BlockItem(ModBlocks.AIRSHIP_LAMP.get(), new Item.Properties()));

    public static final RegistryObject<Item> BRASS_RIVETED_PLATING_ITEM = ITEMS.register("brass_riveted_plating",
        () -> new BlockItem(ModBlocks.BRASS_RIVETED_PLATING.get(), new Item.Properties()));

    public static final RegistryObject<Item> MAGITECH_RUNIC_BLOCK_ITEM = ITEMS.register("magitech_runic_block",
        () -> new BlockItem(ModBlocks.MAGITECH_RUNIC_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> MAGITECH_GLOWING_CRYSTAL_ITEM = ITEMS.register("magitech_glowing_crystal",
        () -> new BlockItem(ModBlocks.MAGITECH_GLOWING_CRYSTAL.get(), new Item.Properties()));

    // Standalone Items (examples)
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MECHANICS_WRENCH = ITEMS.register("mechanics_wrench",
        () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> PRESSURE_GAUGE = ITEMS.register("pressure_gauge",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BRASS_STEAM_VALVE = ITEMS.register("brass_steam_valve",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}