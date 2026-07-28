package com.steampunkfactory;

import com.steampunkfactory.block.BoilerBlock;
import com.steampunkfactory.block.PropellerBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, SteampunkFactoryMod.MODID);

    // ==================== FACTORY BLOCKS ====================

    public static final RegistryObject<Block> RIVETED_FACTORY_WALL = BLOCKS.register("riveted_factory_wall",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_FACTORY_WALL = BLOCKS.register("rusty_factory_wall",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> HEAVY_GEARBOX_HOUSING = BLOCKS.register("heavy_gearbox_housing",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(4.0f, 8.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_HEAVY_GEARBOX_HOUSING = BLOCKS.register("rusty_heavy_gearbox_housing",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(3.5f, 7.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PIPE_MANIFOLD = BLOCKS.register("pipe_manifold",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_PIPE_MANIFOLD = BLOCKS.register("rusty_pipe_manifold",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> INDUSTRIAL_METAL_FLOOR = BLOCKS.register("industrial_metal_floor",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_INDUSTRIAL_METAL_FLOOR = BLOCKS.register("rusty_industrial_metal_floor",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRASS_CONTROL_PANEL = BLOCKS.register("brass_control_panel",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_BRASS_CONTROL_PANEL = BLOCKS.register("rusty_brass_control_panel",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.0f, 4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> PISTON_ASSEMBLY = BLOCKS.register("piston_assembly",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.5f, 7.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> STEAM_VENT = BLOCKS.register("steam_vent",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> HEAVY_MACHINERY_BLOCK = BLOCKS.register("heavy_machinery_block",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(4.0f, 8.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> CONTROL_LEVER_BLOCK = BLOCKS.register("control_lever_block",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    // ==================== NEW FACTORY BLOCKS ====================

    public static final RegistryObject<Block> BOILER_BLOCK = BLOCKS.register("boiler_block",
        () -> new BoilerBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(4.5f, 9.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_BOILER_BLOCK = BLOCKS.register("rusty_boiler_block",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(4.0f, 8.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRASS_PLATING = BLOCKS.register("brass_plating",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_BRASS_PLATING = BLOCKS.register("rusty_brass_plating",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.0f, 4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> MECHANICAL_PRESS = BLOCKS.register("mechanical_press",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.5f, 7.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> CONVEYOR_BELT = BLOCKS.register("conveyor_belt",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> STEAM_PIPE = BLOCKS.register("steam_pipe",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> RUSTY_STEAM_PIPE = BLOCKS.register("rusty_steam_pipe",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BROWN)
            .strength(2.0f, 4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRASS_GEARBOX = BLOCKS.register("brass_gearbox",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    // ==================== AIRSHIP BLOCKS ====================

    public static final RegistryObject<Block> AIRSHIP_HULL = BLOCKS.register("airship_hull",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.5f, 5.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> AIRSHIP_DECK = BLOCKS.register("airship_deck",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GONDOLA_FLOOR = BLOCKS.register("gondola_floor",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BALLOON_FABRIC = BLOCKS.register("balloon_fabric",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOL)
            .strength(1.0f, 2.0f)
            .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> PROPELLER_ASSEMBLY = BLOCKS.register("propeller_assembly",
        () -> new PropellerBlock(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.0f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> GONDOLA_WALL = BLOCKS.register("gondola_wall",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> AIRSHIP_BALLOON_TOP = BLOCKS.register("airship_balloon_top",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOL)
            .strength(1.0f, 2.0f)
            .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> AIRSHIP_INTERIOR_WOOD = BLOCKS.register("airship_interior_wood",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BRASS_TRIM_DETAIL = BLOCKS.register("brass_trim_detail",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> AIRSHIP_WINDOW = BLOCKS.register("airship_window",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_LIGHT_BLUE)
            .strength(2.0f, 4.0f)
            .sound(SoundType.GLASS)));

    public static final RegistryObject<Block> AIRSHIP_CARGO_CRATE = BLOCKS.register("airship_cargo_crate",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> AIRSHIP_STEAM_ENGINE_SIDE = BLOCKS.register("airship_steam_engine_side",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.METAL)
            .strength(3.5f, 7.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BALLOON_DETAIL = BLOCKS.register("balloon_detail",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOL)
            .strength(1.0f, 2.0f)
            .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GONDOLA_ROOF = BLOCKS.register("gondola_roof",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BALLOON_SEGMENT = BLOCKS.register("balloon_segment",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOL)
            .strength(1.0f, 2.0f)
            .sound(SoundType.WOOL)));

    public static final RegistryObject<Block> GONDOLA_DOOR = BLOCKS.register("gondola_door",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.WOOD)
            .strength(2.0f, 4.0f)
            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> AIRSHIP_LAMP = BLOCKS.register("airship_lamp",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(1.5f, 3.0f)
            .lightLevel(state -> 15)
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BRASS_RIVETED_PLATING = BLOCKS.register("brass_riveted_plating",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_YELLOW)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)));

    public static final RegistryObject<Block> MAGITECH_RUNIC_BLOCK = BLOCKS.register("magitech_runic_block",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(3.5f, 7.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)
            .lightLevel(state -> 4)));

    public static final RegistryObject<Block> MAGITECH_GLOWING_CRYSTAL = BLOCKS.register("magitech_glowing_crystal",
        () -> new Block(BlockBehaviour.Properties.of()
            .mapColor(MapColor.COLOR_BLUE)
            .strength(2.5f, 5.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.METAL)
            .lightLevel(state -> 12)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}