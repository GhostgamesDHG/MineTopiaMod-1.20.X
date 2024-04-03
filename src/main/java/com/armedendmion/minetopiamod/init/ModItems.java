package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.items.MoneyTooltip;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MineTopiaMod.MOD_ID);

    public static final RegistryObject<Item> IPHONE_7_BLACK = ITEMS.register("iphone_7_black", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IPHONE_7_PINK = ITEMS.register("iphone_7_pink", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IPHONE_7_YELLOW = ITEMS.register("iphone_7_yellow", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IPHONE_7_GREEN = ITEMS.register("iphone_7_green", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IPHONE_7_BLUE = ITEMS.register("iphone_7_blue", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IPHONE_7_RED = ITEMS.register("iphone_7_red", () -> new Item(new Item.Properties().stacksTo(1)));

    //MONEY
    public static final RegistryObject<Item> MONEY1 = ITEMS.register("0.10euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY2 = ITEMS.register("1euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY3 = ITEMS.register("5euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY4 = ITEMS.register("10euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY5 = ITEMS.register("20euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY6 = ITEMS.register("50euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY7 = ITEMS.register("100euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY8 = ITEMS.register("200euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY9 = ITEMS.register("500euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> MONEY10 = ITEMS.register("1000euro", () -> new MoneyTooltip(new Item.Properties()));
    public static final RegistryObject<Item> DEBIT_CARD = ITEMS.register("debit_card", () -> new Item(new Item.Properties()));

    //CASINO COINS
    public static final RegistryObject<Item> CASINO_COIN_BLUE = ITEMS.register("casino_coin_blue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASINO_COIN_GOLD = ITEMS.register("casino_coin_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASINO_COIN_GREEN = ITEMS.register("casino_coin_green", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASINO_COIN_ORANGE = ITEMS.register("casino_coin_orange", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASINO_COIN_RED = ITEMS.register("casino_coin_red", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CASINO_COIN_SILVER = ITEMS.register("casino_coin_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHEELCOIN = ITEMS.register("wheelcoin", () -> new Item(new Item.Properties()));

    //ALL THE OTHER ITEMS
    public static final RegistryObject<Item> BLUE_CRYSTAL = ITEMS.register("blue_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_BALLOON = ITEMS.register("pink_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_BALLOON = ITEMS.register("red_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_BALLOON = ITEMS.register("orange_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_BALLOON = ITEMS.register("green_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_BALLOON = ITEMS.register("yellow_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_BALLOON = ITEMS.register("blue_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPORTS_WATCH = ITEMS.register("sports_watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RING = ITEMS.register("ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_WHITE_UMBRELLA = ITEMS.register("blue_white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_UMBRELLA = ITEMS.register("rainbow_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_WHITE_UMBRELLA = ITEMS.register("red_white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINETOPIABAG = ITEMS.register("minetopiabag", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEPPERSPRAY = ITEMS.register("pepperspray", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATCH = ITEMS.register("watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PRISONCOIN = ITEMS.register("bronze_prisoncoin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PRISONCOIN = ITEMS.register("silver_prisoncoin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEGEND_50 = ITEMS.register("legend_50", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEGEND_1 = ITEMS.register("legend_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_10 = ITEMS.register("epic_10", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_5 = ITEMS.register("epic_5", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_1 = ITEMS.register("epic_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_50 = ITEMS.register("common_50", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_10 = ITEMS.register("common_10", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_1 = ITEMS.register("common_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MODERN_WALKING_STICK = ITEMS.register("modern_walking_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND = ITEMS.register("magicwand", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_BLUE = ITEMS.register("magicwand_blue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_GREEN = ITEMS.register("magicwand_green", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_RED = ITEMS.register("magicwand_red", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_YELLOW = ITEMS.register("magicwand_yellow", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN1 = ITEMS.register("racecoin1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN10 = ITEMS.register("racecoin10", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN50 = ITEMS.register("racecoin50", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN100 = ITEMS.register("racecoin100", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN500 = ITEMS.register("racecoin500", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN1000 = ITEMS.register("racecoin1000", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN2500 = ITEMS.register("racecoin2500", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RACECOIN5000 = ITEMS.register("racecoin5000", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROLEX_GOLD = ITEMS.register("rolex_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROLEX_DIAMOND = ITEMS.register("rolex_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROLEX_SILVER = ITEMS.register("rolex_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PCB_DUST = ITEMS.register("pcb_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PCB = ITEMS.register("pcb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> APPLE_WATCH = ITEMS.register("apple_watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIRPODS = ITEMS.register("airpods", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRACELET = ITEMS.register("bracelet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRACELET2 = ITEMS.register("bracelet2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET = ITEMS.register("tablet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_BRONZE = ITEMS.register("key_dice_bronze", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_DIAMOND = ITEMS.register("key_dice_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_EMERALD = ITEMS.register("key_dice_emerald", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_GOLD = ITEMS.register("key_dice_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_MYSTIC = ITEMS.register("key_dice_mystic", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_REDSTONE = ITEMS.register("key_dice_redstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_DICE_SILVER = ITEMS.register("key_dice_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_BRONZE = ITEMS.register("key_hammer_bronze", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_DIAMOND = ITEMS.register("key_hammer_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_EMERALD = ITEMS.register("key_hammer_emerald", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_GOLD = ITEMS.register("key_hammer_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_MYSTIC = ITEMS.register("key_hammer_mystic", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_REDSTONE = ITEMS.register("key_hammer_redstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEY_HAMMER_SILVER = ITEMS.register("key_hammer_silver", () -> new Item(new Item.Properties()));

//NEED RECIPE
    public static final RegistryObject<Item> POCKET_UMBRELLA = ITEMS.register("pocket_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHRISTMAS_BALLOON = ITEMS.register("christmas_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HINKING_BRANCH = ITEMS.register("hinking_branch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_UMBRELLA = ITEMS.register("black_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_UMBRELLA = ITEMS.register("blue_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_UMBRELLA = ITEMS.register("cyan_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_UMBRELLA = ITEMS.register("lime_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_UMBRELLA = ITEMS.register("green_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_UMBRELLA = ITEMS.register("purple_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_UMBRELLA = ITEMS.register("red_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_UMBRELLA = ITEMS.register("white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_UMBRELLA = ITEMS.register("yellow_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_FLY_SWATTER = ITEMS.register("black_fly_swatter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_FLY_SWATTER = ITEMS.register("golden_fly_swatter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EASTER_BASKET = ITEMS.register("easter_basket", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUITAR = ITEMS.register("guitar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SANTA_CLAUS_STAFF = ITEMS.register("santa_claus_staff", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUMPKINLANTERN = ITEMS.register("pumpkinlantern", () -> new Item(new Item.Properties()));

    //FOOD
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties().food(ModFood.BANANA)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFood.STRAWBERRY)));
    public static final RegistryObject<Item> HAMBURGER = ITEMS.register("hamburger", () -> new Item(new Item.Properties().food(ModFood.HAMBURGER)));
    public static final RegistryObject<Item> SANDWICH = ITEMS.register("sandwich", () -> new Item(new Item.Properties().food(ModFood.SANDWICH)));
    public static final RegistryObject<Item> PINEAPPLE = ITEMS.register("pineapple", () -> new Item(new Item.Properties().food(ModFood.PINEAPPLE)));
    public static final RegistryObject<Item> BACON = ITEMS.register("bacon", () -> new Item(new Item.Properties().food(ModFood.BACON)));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(new Item.Properties().food(ModFood.COOKED_BACON)));
    public static final RegistryObject<Item> CHICKEN = ITEMS.register("chicken", () -> new Item(new Item.Properties().food(ModFood.CHICKEN)));
    public static final RegistryObject<Item> COOKED_CHICKEN = ITEMS.register("cooked_chicken", () -> new Item(new Item.Properties().food(ModFood.COOKED_CHICKEN)));
    public static final RegistryObject<Item> HOTDOG = ITEMS.register("hotdog", () -> new Item(new Item.Properties().food(ModFood.HOTDOG)));
    public static final RegistryObject<Item> ICECREAM = ITEMS.register("icecream", () -> new Item(new Item.Properties().food(ModFood.ICE_CREAM)));
    public static final RegistryObject<Item> CODFISH = ITEMS.register("codfish", () -> new Item(new Item.Properties().food(ModFood.CODFISH)));
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new Item(new Item.Properties().food(ModFood.FRIES)));
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().food(ModFood.PIZZA)));
    public static final RegistryObject<Item> CHICKEN_BUCKET = ITEMS.register("chicken_bucket", () -> new Item(new Item.Properties().food(ModFood.CHICKEN_BUCKET)));
    public static final RegistryObject<Item> FRUIT_SKEWER = ITEMS.register("fruit_skewer", () -> new Item(new Item.Properties().food(ModFood.FRUIT_SKEWER)));
    public static final RegistryObject<Item> SUSHI = ITEMS.register("sushi", () -> new Item(new Item.Properties().food(ModFood.SUSHI)));
    public static final RegistryObject<Item> SUSHI_PACKAGE = ITEMS.register("sushi_package", () -> new Item(new Item.Properties().food(ModFood.SUSHI_PACKAGE)));
    public static final RegistryObject<Item> MUFFIN = ITEMS.register("muffin", () -> new Item(new Item.Properties().food(ModFood.MUFFIN)));
    public static final RegistryObject<Item> VANILLA_MUFFIN = ITEMS.register("vanilla_muffin", () -> new Item(new Item.Properties().food(ModFood.VANILLA_MUFFIN)));
    public static final RegistryObject<Item> CHOCOLATE_MUFFIN = ITEMS.register("chocolate_muffin", () -> new Item(new Item.Properties().food(ModFood.CHOCOLATE_MUFFIN)));
    public static final RegistryObject<Item> JELLYBEANS = ITEMS.register("jellybeans", () -> new Item(new Item.Properties().food(ModFood.JELLYBEANS)));
    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane", () -> new Item(new Item.Properties().food(ModFood.CANDY_CANE)));
    public static final RegistryObject<Item> DOUBLE_SUSHI_PACKAGE = ITEMS.register("double_sushi_package", () -> new Item(new Item.Properties().food(ModFood.DOUBLE_SUSHI_PACKAGE)));
    public static final RegistryObject<Item> CUPCAKES = ITEMS.register("cupcakes", () -> new Item(new Item.Properties().food(ModFood.CUPCAKE)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFood.CHEESE)));
    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes", () -> new Item(new Item.Properties().food(ModFood.GRAPES)));
    public static final RegistryObject<Item> RED_GRAPES = ITEMS.register("red_grapes", () -> new Item(new Item.Properties().food(ModFood.RED_GRAPES)));
    public static final RegistryObject<Item> HOP = ITEMS.register("hop", () -> new Item(new Item.Properties().food(ModFood.HOP)));
    public static final RegistryObject<Item> CHIPS_NATURAL = ITEMS.register("chips_natural", () -> new Item(new Item.Properties().food(ModFood.CHIPS_NATURAL)));
    public static final RegistryObject<Item> DONUT_BLUEBERRIES = ITEMS.register("donut_blueberries", () -> new Item(new Item.Properties().food(ModFood.DONUT_BLUEBERRIES)));
    public static final RegistryObject<Item> DONUT_CHOCOLATE = ITEMS.register("donut_chocolate", () -> new Item(new Item.Properties().food(ModFood.DONUT_CHOCOLATE)));
    public static final RegistryObject<Item> DONUT_HALLOWEEN = ITEMS.register("donut_halloween", () -> new Item(new Item.Properties().food(ModFood.DONUT_HALLOWEEN)));
    public static final RegistryObject<Item> DONUT_STRAWBERRY = ITEMS.register("donut_strawberry", () -> new Item(new Item.Properties().food(ModFood.DONUT_STRAWBERRY)));
    public static final RegistryObject<Item> DONUT_CHRISTMAS = ITEMS.register("donut_christmas", () -> new Item(new Item.Properties().food(ModFood.DONUT_CHRISTMAS)));
    public static final RegistryObject<Item> DONUT_WHITE = ITEMS.register("donut_white", () -> new Item(new Item.Properties().food(ModFood.DONUT_WHITE)));
    public static final RegistryObject<Item> STRAWBERRY_ICECREAM = ITEMS.register("strawberry_icecream", () -> new Item(new Item.Properties().food(ModFood.STRAWBERRY_ICECREAM)));
    public static final RegistryObject<Item> CHOCOLATE_LETTER = ITEMS.register("chocolate_letter", () -> new Item(new Item.Properties().food(ModFood.CHOCOLATE_LETTER)));
    public static final RegistryObject<Item> CHOCOLATE_BAR = ITEMS.register("chocolate_bar", () -> new Item(new Item.Properties().food(ModFood.CHOCOLATE_BAR)));
    public static final RegistryObject<Item> APFELSTRUDEL = ITEMS.register("apfelstrudel", () -> new Item(new Item.Properties().food(ModFood.APFELSTRUDEL)));
    public static final RegistryObject<Item> BITTERBALLEN = ITEMS.register("bitterballen", () -> new Item(new Item.Properties().food(ModFood.BITTERBALLEN)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new Item(new Item.Properties().food(ModFood.CORN)));
    public static final RegistryObject<Item> LETTUCE = ITEMS.register("lettuce", () -> new Item(new Item.Properties().food(ModFood.LETTUCE)));
    public static final RegistryObject<Item> PAPRIKA = ITEMS.register("paprika", () -> new Item(new Item.Properties().food(ModFood.PAPRIKA)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new Item(new Item.Properties().food(ModFood.PEPPER)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().food(ModFood.TOMATO)));
    public static final RegistryObject<Item> WHITE_GRAPES = ITEMS.register("white_grapes", () -> new Item(new Item.Properties().food(ModFood.WHITE_GRAPES)));
    public static final RegistryObject<Item> WEED = ITEMS.register("weed", () -> new Item(new Item.Properties().food(ModFood.WEED)));
    public static final RegistryObject<Item> PURPLE_WEED = ITEMS.register("purple_weed", () -> new Item(new Item.Properties().food(ModFood.PURPLE_WEED)));
    public static final RegistryObject<Item> DRAGONFLESH = ITEMS.register("dragonflesh", () -> new Item(new Item.Properties().food(ModFood.DRAGONFLESH)));
    public static final RegistryObject<Item> UNICORNFLESH = ITEMS.register("unicornflesh", () -> new Item(new Item.Properties().food(ModFood.UNICORNFLESH)));
    public static final RegistryObject<Item> COCAINE = ITEMS.register("cocaine", () -> new Item(new Item.Properties().food(ModFood.COCAINE)));

//HATS
    public static final RegistryObject<Item> DEMON_RED_HORNS = ITEMS.register("demon_red_horns", () -> new Item(new Item.Properties()));

    //SEEDS
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds", () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> GRAPES_SEEDS = ITEMS.register("grapes_seeds", () -> new ItemNameBlockItem(ModBlocks.GRAPES_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_GRAPES_SEEDS = ITEMS.register("white_grapes_seeds", () -> new ItemNameBlockItem(ModBlocks.WHITE_GRAPES_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> RED_GRAPES_SEEDS = ITEMS.register("red_grapes_seeds", () -> new ItemNameBlockItem(ModBlocks.RED_GRAPES_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOP_SEEDS = ITEMS.register("hop_seeds", () -> new ItemNameBlockItem(ModBlocks.HOP_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LETTUCE_SEEDS = ITEMS.register("lettuce_seeds", () -> new ItemNameBlockItem(ModBlocks.LETTUCE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PAPRIKA_SEEDS = ITEMS.register("paprika_seeds", () -> new ItemNameBlockItem(ModBlocks.PAPRIKA_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_SEEDS = ITEMS.register("pepper_seeds", () -> new ItemNameBlockItem(ModBlocks.PEPPER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINEAPPLE_SEEDS = ITEMS.register("pineapple_seeds", () -> new ItemNameBlockItem(ModBlocks.PINEAPPLE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> WEED_SEEDS = ITEMS.register("weed_seeds", () -> new ItemNameBlockItem(ModBlocks.WEED_CROP.get(), new Item.Properties()));

//TOOLS
    public static final RegistryObject<Item> BLUE_CRYSTAL_SWORD = ITEMS.register("blue_crystal_sword", () -> new SwordItem(ModToolTiers.BLUE_CRYSTAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_AXE = ITEMS.register("blue_crystal_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_PICKAXE = ITEMS.register("blue_crystal_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 2, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_HOE = ITEMS.register("blue_crystal_hoe", () -> new HoeItem(ModToolTiers.BLUE_CRYSTAL, 0, 2, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_CRYSTAL_SHOVEL = ITEMS.register("blue_crystal_shovel", () -> new ShovelItem(ModToolTiers.BLUE_CRYSTAL, 0, 2, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_BLUE = ITEMS.register("sword_blue", () -> new SwordItem(ModToolTiers.BLUE_CRYSTAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_GREEN = ITEMS.register("sword_green", () -> new SwordItem(ModToolTiers.BLUE_CRYSTAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_GOLD = ITEMS.register("sword_gold", () -> new SwordItem(ModToolTiers.BLUE_CRYSTAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_PINK = ITEMS.register("sword_pink", () -> new SwordItem(ModToolTiers.BLUE_CRYSTAL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> CHRISTMAS_AXE = ITEMS.register("christmas_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> MAGMA_AXE = ITEMS.register("magma_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(ModToolTiers.BLUE_CRYSTAL, 6, 2, new Item.Properties()));
    public static final RegistryObject<Item> CLASSIC_KNIFE = ITEMS.register("classic_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_KNIFE = ITEMS.register("white_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> RED_KNIFE = ITEMS.register("red_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> PINK_KNIFE = ITEMS.register("pink_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_KNIFE = ITEMS.register("purple_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_KNIFE = ITEMS.register("rainbow_knife", () -> new SwordItem(ModToolTiers.MES, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK = ITEMS.register("wapenstok", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK_DIAMOND = ITEMS.register("wapenstok_diamond", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK_GOLD = ITEMS.register("wapenstok_gold", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK_EMERALD = ITEMS.register("wapenstok_emerald", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK_IRON = ITEMS.register("wapenstok_iron", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> WAPENSTOK_REDSTONE = ITEMS.register("wapenstok_redstone", () -> new SwordItem(ModToolTiers.WAPENSTOK, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> TASER = ITEMS.register("taser", () -> new SwordItem(ModToolTiers.TASER, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT = ITEMS.register("bat", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_DIAMOND = ITEMS.register("bat_diamond", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_GOLD = ITEMS.register("bat_gold", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_EMERALD = ITEMS.register("bat_emerald", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_IRON = ITEMS.register("bat_iron", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_REDSTONE = ITEMS.register("bat_redstone", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> BAT_GRAY = ITEMS.register("bat_gray", () -> new SwordItem(ModToolTiers.BAT, 0, 10, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSABER_BLUE = ITEMS.register("lightsaber_blue", () -> new SwordItem(ModToolTiers.LIGHTSABER, 1, 10, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSABER_GREEN = ITEMS.register("lightsaber_green", () -> new SwordItem(ModToolTiers.LIGHTSABER, 1, 10, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSABER_PURPLE = ITEMS.register("lightsaber_purple", () -> new SwordItem(ModToolTiers.LIGHTSABER, 1, 10, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSABER_RED = ITEMS.register("lightsaber_red", () -> new SwordItem(ModToolTiers.LIGHTSABER, 1, 10, new Item.Properties()));
    public static final RegistryObject<Item> LIGHTSABER_YELLOW = ITEMS.register("lightsaber_yellow", () -> new SwordItem(ModToolTiers.LIGHTSABER, 1, 10, new Item.Properties()));
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", () -> new SwordItem(ModToolTiers.SCYTHE, 4, 3, new Item.Properties()));
    public static final RegistryObject<Item> CACTUS_PICKAXE = ITEMS.register("cactus_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> DARK_PRISMARINE_PICKAXE = ITEMS.register("dark_prismarine_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> LAVA_PICKAXE = ITEMS.register("lava_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> MONDRIAAN_PICKAXE = ITEMS.register("mondriaan_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> MORGANITE_PICKAXE = ITEMS.register("morganite_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> NETHERPORTAL_PICKAXE = ITEMS.register("netherportal_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> WATER_PICKAXE = ITEMS.register("water_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> MAGMA_PICKAXE = ITEMS.register("magma_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModToolTiers.BLUE_CRYSTAL, 0, 1, new Item.Properties()));


public static void register(IEventBus eventbus) {
    ITEMS.register(eventbus);
    }
}
