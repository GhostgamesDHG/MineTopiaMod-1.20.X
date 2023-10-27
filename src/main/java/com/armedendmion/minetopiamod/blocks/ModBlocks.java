package com.armedendmion.minetopiamod.blocks;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, MineTopiaMod.MOD_ID);

 //   public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
 //           () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));

    //ORES
    public static final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = registerBlock("blue_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BLUE_CRYSTAL_ORE = registerBlock("blue_crystal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> PCB_ORE = registerBlock("pcb_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));


    //KEUKENTEGELS
    public static final RegistryObject<Block> BLUE_KITCHEN_TILES = registerBlock("blue_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_BLUE)));
    public static final RegistryObject<Block> BLACK_KITCHEN_TILES = registerBlock("black_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLACK)));
    public static final RegistryObject<Block> DARK_BLUE_KITCHEN_TILES = registerBlock("dark_blue_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BLUE)));
    public static final RegistryObject<Block> BROWN_KITCHEN_TILES = registerBlock("brown_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_BROWN)));
    public static final RegistryObject<Block> CYAN_KITCHEN_TILES = registerBlock("cyan_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_CYAN)));
    public static final RegistryObject<Block> GREEN_KITCHEN_TILES = registerBlock("green_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_GREEN)));
    public static final RegistryObject<Block> GRAY_KITCHEN_TILES = registerBlock("gray_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_GRAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_KITCHEN_TILES = registerBlock("light_gray_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> LIGHT_GREEN_KITCHEN_TILES = registerBlock("light_green_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> MAGENTA_KITCHEN_TILES = registerBlock("magenta_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> ORANGE_KITCHEN_TILES = registerBlock("orange_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> PINK_KITCHEN_TILES = registerBlock("pink_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> PURPLE_KITCHEN_TILES = registerBlock("purple_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> RED_KITCHEN_TILES = registerBlock("red_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> YELLOW_KITCHEN_TILES = registerBlock("yellow_kitchen_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.COLOR_YELLOW)));

    //ALL THE OTHER BLOCKS
    public static final RegistryObject<Block> ATM = registerBlock("atm",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEACON).mapColor(MapColor.COLOR_GRAY)));
 //   public static final RegistryObject<Block> PORTABLE_ATM = registerBlock("portable_atm", PortableATM::new);
 //   public static final RegistryObject<Block> LAMP = registerBlock("lamp", lamp::new);
 //   public static final RegistryObject<Block> COMPUTER = registerBlock("computer", Computer::new);
 //   public static final RegistryObject<Block> HONDEN_BEDJE = registerBlock("honden_bedje", Honden_Bedje::new);
 //   public static final RegistryObject<Block> OVEN = registerBlock("oven", () -> new Oven(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.5F).setLightLevel(getLightValueLit())));
 //   public static final RegistryObject<Block> OIL_CAN = registerBlock("oil_can", Oil_Can::new);
 //   public static final RegistryObject<Block> PARKING_SIGN = registerBlock("parking_sign", Parking_Sign::new);
 //   public static final RegistryObject<Block> PUMPKIN = registerBlock("pumpkin", Pumpkin::new);
 //   public static final RegistryObject<Block> ROADBLOCK = registerBlock("roadblock", Roadblock::new);
 //   public static final RegistryObject<Block> SCHOENTJE = registerBlock("schoentje", Schoentje::new);
 //   public static final RegistryObject<Block> TRAFFIC_CONE = registerBlock("traffic_cone", Traffic_Cone::new);
 //   public static final RegistryObject<Block> LANTAARN = registerBlock("lantaarn", lantaarn::new);
 //   public static final RegistryObject<Block> BOOMBOX = registerBlock("boombox", boombox::new);
 //   public static final RegistryObject<Block> MICROFOON = registerBlock("microfoon", microfoon::new);
 //   public static final RegistryObject<Block> GOPRO = registerBlock("gopro", gopro::new);
 //   public static final RegistryObject<Block> FILMCAMERA = registerBlock("filmcamera", filmcamera::new);
 //   public static final RegistryObject<Block> WALKIETALKIE = registerBlock("walkietalkie", walkietalkie::new);
 //   public static final RegistryObject<Block> KRANS = registerBlock("krans", krans::new);
 //   public static final RegistryObject<Block> KERST_SLINGERS = registerBlock("kerst_slingers", kerst_slingers::new);
 //   public static final RegistryObject<Block> NOTEBOOK = registerBlock("notebook", Notebook::new);
  //  public static final RegistryObject<Block> MONITOR = registerBlock("monitor", Monitor::new);
 //   public static final RegistryObject<Block> CADEAU = registerBlock("cadeau", Cadeau::new);
 //   public static final RegistryObject<Block> FLASHLIGHT = registerBlock("flashlight", Flashlight::new);
 //   public static final RegistryObject<Block> ANTENNE = registerBlock("antenne", Antenne::new);
 //   public static final RegistryObject<Block> DIAMOND_TROPHIE_1J = registerBlock("diamond_trophie_1j", trophies_1j::new);
 //   public static final RegistryObject<Block> GOLDEN_TROPHIE_1J = registerBlock("golden_trophie_1j", trophies_1j::new);
 //   public static final RegistryObject<Block> BRONZE_TROPHIE_1J = registerBlock("bronze_trophie_1j", trophies_1j::new);
 //   public static final RegistryObject<Block> SILVER_TROPHIE_1J = registerBlock("silver_trophie_1j", trophies_1j::new);
 //   public static final RegistryObject<Block> WALL_LIGHT = registerBlock("wall_light", wall_light::new);
 //   public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks", keukentegels::new);
 //   public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks", keukentegels::new);
 //   public static final RegistryObject<Block> RICH_QUARTZ_BLOCK = registerBlock("rich_quartz_block", keukentegels::new);
 //   public static final RegistryObject<Block> SITTING_SKELETON = registerBlock("sitting_skeleton", sitting_skeleton::new);
 //   public static final RegistryObject<Block> MONSTERBOOK = registerBlock("monsterbook", Monsterbook::new);
 //   public static final RegistryObject<Block> CLEAVER = registerBlock("cleaver", Cleaver::new);
 //   public static final RegistryObject<Block> OWL = registerBlock("owl", Owl::new);
 //   public static final RegistryObject<Block> RAT = registerBlock("rat", Rat::new);
 //   public static final RegistryObject<Block> GLOBE = registerBlock("globe", Globe::new);
 //   public static final RegistryObject<Block> ZOMBIE_ARM = registerBlock("zombie_arm", Zombie_arm::new);
 //   public static final RegistryObject<Block> MINI_SPIDER = registerBlock("mini_spider", Mini_Spider::new);
 //   public static final RegistryObject<Block> DARTBORD = registerBlock("dartbord", Dartbord::new);
 //   public static final RegistryObject<Block> FIRE_PIT = registerBlock("fire_pit", Firepit::new);
 //   public static final RegistryObject<Block> SMALL_TREE = registerBlock("small_tree", Smalltree::new);
 //   public static final RegistryObject<Block> TABLE_PLANT = registerBlock("table_plant", Tableplant::new);
 //   public static final RegistryObject<Block> FRYING_PAN = registerBlock("frying_pan", Frying_pan::new);
 //   public static final RegistryObject<Block> POPCORN_MACHINE = registerBlock("popcorn_machine", PopcornMachine::new);
 //   public static final RegistryObject<Block> BIN = registerBlock("bin", Bin::new);
  //  public static final RegistryObject<Block> COOLBOX = registerBlock("coolbox", coolbox::new);
 //   public static final RegistryObject<Block> MODERN_PLANT = registerBlock("modern_plant", modern_plant::new);
 //   public static final RegistryObject<Block> MODERN_PANCAKE_PLANT = registerBlock("modern_pancake_plant", modern_pancake_plant::new);
  //  public static final RegistryObject<Block> GHOST = registerBlock("ghost", ghost::new);
 //   public static final RegistryObject<Block> GRAVE = registerBlock("grave", Grave::new);
 //   public static final RegistryObject<Block> PUMPKIN_CABINET = registerBlock("pumpkin_cabinet", Pumpkin_cabinet::new);
 //   public static final RegistryObject<Block> PUMPKINS = registerBlock("pumpkins", pumpkins::new);
 //   public static final RegistryObject<Block> SCARECROW = registerBlock("scarecrow", Scarecrow::new);
 //   public static final RegistryObject<Block> TABLE_LAMP = registerBlock("table_lamp", Table_lamp::new);
 //   public static final RegistryObject<Block> TOMB = registerBlock("tomb", Tomb::new);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
}

}
