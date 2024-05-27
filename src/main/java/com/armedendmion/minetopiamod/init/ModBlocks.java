package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.blocks.*;
import com.armedendmion.minetopiamod.blocks.crops.*;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MineTopiaMod.MOD_ID);

    //ORES
    public static final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = ModTabs.addToBlocksTab(registerBlock("blue_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));

    public static final RegistryObject<DropExperienceBlock> BLUE_CRYSTAL_ORE = ModTabs.addToBlocksTab(registerBlock("blue_crystal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), UniformInt.of(4,7))));

    public static final RegistryObject<DropExperienceBlock> PCB_ORE = ModTabs.addToBlocksTab(registerBlock("pcb_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), UniformInt.of(4,7))));

    //KEUKENTEGELS
    public static final RegistryObject<Block> BLUE_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("blue_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> BLACK_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("black_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLACK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> DARK_BLUE_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("dark_blue_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLUE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> BROWN_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("brown_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> CYAN_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("cyan_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_CYAN).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> GREEN_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("green_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_GREEN).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> GRAY_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("gray_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_GRAY).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> LIGHT_GRAY_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("light_gray_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> LIGHT_GREEN_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("light_green_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GREEN).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> MAGENTA_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("magenta_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_MAGENTA).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> ORANGE_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("orange_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_ORANGE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> PINK_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("pink_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_PINK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> PURPLE_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("purple_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_PURPLE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> RED_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("red_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_RED).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> YELLOW_KITCHEN_TILES = ModTabs.addToBlocksTab(registerBlock("yellow_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_YELLOW).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));

    //ALL THE OTHER BLOCKS
    public static final RegistryObject<Block> ATM = ModTabs.addToBlocksTab(registerBlock("atm", atm::new));
    public static final RegistryObject<Block> WASHING_MACHINE = ModTabs.addToBlocksTab(registerBlock("washing_machine", Washingmachine::new));
    public static final RegistryObject<Block> PORTABLE_ATM = ModTabs.addToBlocksTab(registerBlock("portable_atm", PortableATM::new));
    public static final RegistryObject<Block> LAMP = ModTabs.addToBlocksTab(registerBlock("lamp", Lamp::new));
    public static final RegistryObject<Block> COMPUTER = ModTabs.addToBlocksTab(registerBlock("computer", Computer::new));
    public static final RegistryObject<Block> DOG_COT = ModTabs.addToBlocksTab(registerBlock("dog_cot", DogCot::new));
    public static final RegistryObject<Block> OIL_CAN = ModTabs.addToBlocksTab(registerBlock("oil_can", OilCan::new));
    public static final RegistryObject<Block> PARKING_SIGN = ModTabs.addToBlocksTab(registerBlock("parking_sign", ParkingSign::new));
    public static final RegistryObject<Block> PUMPKIN = ModTabs.addToBlocksTab(registerBlock("pumpkin", Pumpkin::new));
    public static final RegistryObject<Block> ROADBLOCK = ModTabs.addToBlocksTab(registerBlock("roadblock", RoadBlock::new));
    public static final RegistryObject<Block> SCHOENTJE = ModTabs.addToBlocksTab(registerBlock("schoentje", Schoentje::new));
    public static final RegistryObject<Block> TRAFFIC_CONE = ModTabs.addToBlocksTab(registerBlock("traffic_cone", TrafficCone::new));
    public static final RegistryObject<Block> LANTERN = ModTabs.addToBlocksTab(registerBlock("lantern", Lantaarn::new));
    public static final RegistryObject<Block> BOOMBOX = ModTabs.addToBlocksTab(registerBlock("boombox", Boombox::new));
    public static final RegistryObject<Block> CAMERA = ModTabs.addToBlocksTab(registerBlock("camera", Camera::new));
    public static final RegistryObject<Block> OWL = ModTabs.addToBlocksTab(registerBlock("owl", Owl::new));
    public static final RegistryObject<Block> WREATH = ModTabs.addToBlocksTab(registerBlock("wreath", Wreath::new));
    public static final RegistryObject<Block> CHRISTMAS_GARLANDS = ModTabs.addToBlocksTab(registerBlock("christmas_garlands", ChristmasGarlands::new));
    public static final RegistryObject<Block> WHITE_BRICKS = ModTabs.addToBlocksTab(registerBlock("white_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.TERRACOTTA_WHITE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> BLACK_BRICKS = ModTabs.addToBlocksTab(registerBlock("black_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLACK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> MYSTERIOUS_BLOCK = ModTabs.addToBlocksTab(registerBlock("mysterious_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLACK).lightLevel(value -> 15).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> SAFE = ModTabs.addToBlocksTab(registerBlock("safe", SafeBlock::new));
    public static final RegistryObject<Block> VENDINGMACHINE = ModTabs.addToBlocksTab(registerBlock("vendingmachine", VendingMachine::new));
    public static final RegistryObject<Block> VENDING_MACHINE_TOP = registerBlock("vending_machine_top", VendingMachineTopBlock::new);
    public static final RegistryObject<Block> FIRE_PIT = ModTabs.addToBlocksTab(registerBlock("fire_pit", Firepit::new));
    public static final RegistryObject<Block> FIRE_PIT_LIT = registerBlock("fire_pit_lit", FirepitLit::new);
    public static final RegistryObject<Block> MONITOR = ModTabs.addToBlocksTab(registerBlock("monitor", Monitor::new));
    public static final RegistryObject<Block> ANTENNA = ModTabs.addToBlocksTab(registerBlock("antenna", Antenna::new));
    public static final RegistryObject<Block> GLOBE = ModTabs.addToBlocksTab(registerBlock("globe", Globe::new));
    public static final RegistryObject<Block> NOTEBOOK = ModTabs.addToBlocksTab(registerBlock("notebook", Notebook::new));
    public static final RegistryObject<Block> DARTBORD = ModTabs.addToBlocksTab(registerBlock("dartbord", Dartbord::new));
    public static final RegistryObject<Block> WALL_LIGHT = ModTabs.addToBlocksTab(registerBlock("wall_light", WallLight::new));
    public static final RegistryObject<Block> SMALL_TREE = ModTabs.addToBlocksTab(registerBlock("small_tree", Smalltree::new));
    public static final RegistryObject<Block> TABLE_PLANT = ModTabs.addToBlocksTab(registerBlock("table_plant", Tableplant::new));
    public static final RegistryObject<Block> BIN = ModTabs.addToBlocksTab(registerBlock("bin", Bin::new));
    public static final RegistryObject<Block> GARBAGE_CAN = ModTabs.addToBlocksTab(registerBlock("garbage_can", GarbageCan::new));
    public static final RegistryObject<Block> WASTE_CONTAINER = ModTabs.addToBlocksTab(registerBlock("waste_container", Container::new));
    public static final RegistryObject<Block> COOLBOX = ModTabs.addToBlocksTab(registerBlock("coolbox", coolbox::new));
    public static final RegistryObject<Block> MODERN_PLANT = ModTabs.addToBlocksTab(registerBlock("modern_plant", modern_plant::new));
    public static final RegistryObject<Block> MODERN_PANCAKE_PLANT = ModTabs.addToBlocksTab(registerBlock("modern_pancake_plant", modern_pancake_plant::new));
    public static final RegistryObject<Block> TABLE_LAMP = ModTabs.addToBlocksTab(registerBlock("table_lamp", table_lamp::new));
        public static final RegistryObject<Block> DARK_OAK_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("dark_oak_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> OAK_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("oak_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> BIRCH_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("birch_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> SPRUCE_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("spruce_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> ACACIA_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("acacia_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> JUNGLE_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("jungle_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> MANGROVE_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("mangrove_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> BAMBOO_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("bamboo_kitchen_cabinet", KitchenCabinet::new));
        public static final RegistryObject<Block> CHERRY_KITCHEN_CABINET = ModTabs.addToBlocksTab(registerBlock("cherry_kitchen_cabinet", KitchenCabinet::new));
    public static final RegistryObject<Block> FRYING_PAN = ModTabs.addToBlocksTab(registerBlock("frying_pan", FryingPan::new));

    //BAG
    public static final RegistryObject<Block> YELLOW_BAG = registerBlock("yellow_bag", Bag::new);
    public static final RegistryObject<Block> GREEN_BAG = registerBlock("green_bag", Bag::new);
    public static final RegistryObject<Block> WHITE_BAG = ModTabs.addToBlocksTab(registerBlock("white_bag", Bag::new));
    public static final RegistryObject<Block> ORANGE_BAG = registerBlock("orange_bag", Bag::new);
    public static final RegistryObject<Block> MAGENTA_BAG = registerBlock("magenta_bag", Bag::new);
    public static final RegistryObject<Block> LIGHT_BLUE_BAG = registerBlock("light_blue_bag", Bag::new);
    public static final RegistryObject<Block> LIME_BAG = registerBlock("lime_bag", Bag::new);
    public static final RegistryObject<Block> PINK_BAG = registerBlock("pink_bag", Bag::new);
    public static final RegistryObject<Block> GRAY_BAG = registerBlock("gray_bag", Bag::new);
    public static final RegistryObject<Block> LIGHT_GRAY_BAG = registerBlock("light_gray_bag", Bag::new);
    public static final RegistryObject<Block> CYAN_BAG = registerBlock("cyan_bag", Bag::new);
    public static final RegistryObject<Block> PURPLE_BAG = registerBlock("purple_bag", Bag::new);
    public static final RegistryObject<Block> BLUE_BAG = registerBlock("blue_bag", Bag::new);
    public static final RegistryObject<Block> BROWN_BAG = registerBlock("brown_bag", Bag::new);
    public static final RegistryObject<Block> RED_BAG = registerBlock("red_bag", Bag::new);
    public static final RegistryObject<Block> BLACK_BAG = registerBlock("black_bag", Bag::new);

    //LED PANELS
    public static final RegistryObject<Block> LED_PANEL = ModTabs.addToBlocksTab(registerBlock("led_panel", LedPanel::new));                                            //0            @
                                    //0            @
    public static final RegistryObject<Block> POLE = ModTabs.addToBlocksTab(registerBlock("pole", LedpanelPole::new));
    public static final RegistryObject<Block> LED_PANEL_RED = registerBlock("led_panel_red", LedPanel::new);                              //1            @
    public static final RegistryObject<Block> LED_PANEL_GREEN = registerBlock("led_panel_green", LedPanel::new);                      //2            @
    public static final RegistryObject<Block> LED_PANEL_WHITE = registerBlock("led_panel_white", LedPanel::new);                       //3            @
    public static final RegistryObject<Block> LED_PANEL_BLUE = registerBlock("led_panel_blue", LedPanel::new);                           //4             @
    public static final RegistryObject<Block> LED_PANEL_YELLOW = registerBlock("led_panel_yellow", LedPanel::new);                   //5            @
    public static final RegistryObject<Block> LED_PANEL_VSC = registerBlock("led_panel_vsc", LedPanel::new);                              //6            @
    public static final RegistryObject<Block> LED_PANEL_SC = registerBlock("led_panel_sc", LedPanel::new);                                  //7            @
    public static final RegistryObject<Block> LED_PANEL_RAIN = registerBlock("led_panel_rain", LedPanel::new);                          //8              @
    public static final RegistryObject<Block> LED_PANEL_CHEQUERED = registerBlock("led_panel_chequered", LedPanel::new);    //9              @
    public static final RegistryObject<Block> LED_PANEL_DOUBLE_YELLOW = registerBlock("led_panel_double_yellow", LedPanel::new); //10       @
    public static final RegistryObject<Block> LED_PANEL_FCY = registerBlock("led_panel_fcy", LedPanel::new);                             //11 Full course yellow

    public static final RegistryObject<Block> CONTROLLER = registerBlock("controller", Pumpkin::new);

    //HALLOWEEN
    public static final RegistryObject<Block> SITTING_SKELETON = ModTabs.addToBlocksTab(registerBlock("sitting_skeleton", Sitting_skeleton::new));
    public static final RegistryObject<Block> MONSTERBOOK = ModTabs.addToBlocksTab(registerBlock("monsterbook", Monsterbook::new));
    public static final RegistryObject<Block> CLEAVER = ModTabs.addToBlocksTab(registerBlock("cleaver", Cleaver::new));
    public static final RegistryObject<Block> RAT = ModTabs.addToBlocksTab(registerBlock("rat", Rat::new));
    public static final RegistryObject<Block> ZOMBIE_ARM = ModTabs.addToBlocksTab(registerBlock("zombie_arm", Zombie_arm::new));
    public static final RegistryObject<Block> MINI_SPIDER = ModTabs.addToBlocksTab(registerBlock("mini_spider", Mini_spider::new));
    public static final RegistryObject<Block> GHOST = ModTabs.addToBlocksTab(registerBlock("ghost", ghost::new));
    public static final RegistryObject<Block> GRAVE = ModTabs.addToBlocksTab(registerBlock("grave", Grave::new));
    public static final RegistryObject<Block> PUMPKIN_CABINET = ModTabs.addToBlocksTab(registerBlock("pumpkin_cabinet", Pumpkin_cabinet::new));
    public static final RegistryObject<Block> PUMPKINS = ModTabs.addToBlocksTab(registerBlock("pumpkins", pumpkins::new));
    public static final RegistryObject<Block> SCARECROW = ModTabs.addToBlocksTab(registerBlock("scarecrow", Scarecrow::new));
    public static final RegistryObject<Block> TOMB = ModTabs.addToBlocksTab(registerBlock("tomb", Tomb::new));

//STILL ON THE TO-DO LIST
    //   public static final RegistryObject<Block> CADEAU = registerBlock("cadeau", Cadeau::new);
    //public static final RegistryObject<Block> OVEN = ModTabs.addToBlocksTab(registerBlock("oven", () -> new Oven(BlockBehaviour.Properties.copy(Blocks.FURNACE).noOcclusion().noCollission().lightLevel(value -> 15))));
    //   public static final RegistryObject<Block> FLASHLIGHT = registerBlock("flashlight", Flashlight::new);
    //   public static final RegistryObject<Block> MICROFOON = registerBlock("microfoon", microfoon::new);
    //   public static final RegistryObject<Block> GOPRO = registerBlock("gopro", gopro::new);
    //   public static final RegistryObject<Block> WALKIETALKIE = registerBlock("walkietalkie", walkietalkie::new);
    //   public static final RegistryObject<Block> FRYING_PAN = registerBlock("frying_pan", Frying_pan::new);
    //   public static final RegistryObject<Block> POPCORN_MACHINE = registerBlock("popcorn_machine", PopcornMachine::new);

    //CROPS
    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop", () -> new CornBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> GRAPES_CROP = BLOCKS.register("grapes_crop", () -> new GrapesBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WHITE_GRAPES_CROP = BLOCKS.register("white_grapes_crop", () -> new WhiteGrapesBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> RED_GRAPES_CROP = BLOCKS.register("red_grapes_crop", () -> new RedGrapesBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> HOP_CROP = BLOCKS.register("hop_crop", () -> new HopBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> LETTUCE_CROP = BLOCKS.register("lettuce_crop", () -> new LettuceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PAPRIKA_CROP = BLOCKS.register("paprika_crop", () -> new PaprikaBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PEPPER_CROP = BLOCKS.register("pepper_crop", () -> new PepperBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PINEAPPLE_CROP = BLOCKS.register("pineapple_crop", () -> new PineAppleBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop", () -> new StrawberryBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop", () -> new TomatoBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WEED_CROP = BLOCKS.register("weed_crop", () -> new WeedBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    //DOORS,STAIRS,SLABS
    public static final RegistryObject<Block> WHITE_BRICK_STAIRS = ModTabs.addToBlocksTab(registerBlock("white_brick_stairs", () -> new StairBlock(() -> ModBlocks.WHITE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> WHITE_BRICK_SLAB = ModTabs.addToBlocksTab(registerBlock("white_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> BLACK_BRICK_STAIRS = ModTabs.addToBlocksTab(registerBlock("black_brick_stairs", () -> new StairBlock(() -> ModBlocks.BLACK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));
    public static final RegistryObject<Block> BLACK_BRICK_SLAB = ModTabs.addToBlocksTab(registerBlock("black_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F))));

    public static final RegistryObject<Block> BUNKER_DOOR = ModTabs.addToBlocksTab(registerBlock("bunker_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), BlockSetType.IRON)));
    public static final RegistryObject<Block> WOODEN_DOOR = ModTabs.addToBlocksTab(registerBlock("wooden_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), BlockSetType.BAMBOO)));
    public static final RegistryObject<Block> RICH_QUARTZ_DOOR = ModTabs.addToBlocksTab(registerBlock("rich_quartz_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), BlockSetType.STONE)));
    public static final RegistryObject<Block> STEEL_DOOR = ModTabs.addToBlocksTab(registerBlock("steel_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), BlockSetType.IRON)));
    public static final RegistryObject<Block>  QUARTZ_DOOR = ModTabs.addToBlocksTab(registerBlock("quartz_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK).noOcclusion().requiresCorrectToolForDrops().strength(1.5F, 6.0F), BlockSetType.STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
        return (p_50763_) -> {
            return p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
        };
    }

public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}

}
