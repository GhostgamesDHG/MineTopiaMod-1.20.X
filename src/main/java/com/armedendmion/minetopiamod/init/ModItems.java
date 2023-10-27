package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.items.MoneyTooltip;
import net.minecraft.world.item.Item;
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


    public static final RegistryObject<Item> BLUE_CRYSTAL = ITEMS.register("blue_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_BALLOON = ITEMS.register("pink_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_BALLOON = ITEMS.register("red_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHRISTMAS_BALLOON = ITEMS.register("christmas_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_BALLOON = ITEMS.register("orange_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_BALLOON = ITEMS.register("green_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_BALLOON = ITEMS.register("yellow_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_BALLOON = ITEMS.register("blue_balloon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPORTS_WATCH = ITEMS.register("sports_watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HINKING_BRANCH = ITEMS.register("hinking_branch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RING = ITEMS.register("ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_WHITE_UMBRELLA = ITEMS.register("blue_white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_UMBRELLA = ITEMS.register("rainbow_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_WHITE_UMBRELLA = ITEMS.register("red_white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINETOPIABAG = ITEMS.register("minetopiabag", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEPPERSPRAY = ITEMS.register("pepperspray", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATCH = ITEMS.register("watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PRISONCOIN = ITEMS.register("bronze_prisoncoin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PRISONCOIN = ITEMS.register("silver_prisoncoin", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> MTCASINO_BLAUW = ITEMS.register("mtcasino_blauw", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MTCASINO_GOLD = ITEMS.register("mtcasino_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MTCASINO_GROEN = ITEMS.register("mtcasino_groen", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MTCASINO_ORANJE = ITEMS.register("mtcasino_oranje", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MTCASINO_ROOD = ITEMS.register("mtcasino_rood", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MTCASINO_SILVER = ITEMS.register("mtcasino_silver", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> LEGEND_50 = ITEMS.register("legend_50", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEGEND_1 = ITEMS.register("legend_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_10 = ITEMS.register("epic_10", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_5 = ITEMS.register("epic_5", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_1 = ITEMS.register("epic_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_50 = ITEMS.register("common_50", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_10 = ITEMS.register("common_10", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COMMON_1 = ITEMS.register("common_1", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MODERN_WALKING_STICK = ITEMS.register("modern_walking_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POCKET_UMBRELLA = ITEMS.register("pocket_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND = ITEMS.register("magicwand", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_BLUE = ITEMS.register("magicwand_blue", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_GREEN = ITEMS.register("magicwand_green", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_RED = ITEMS.register("magicwand_red", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGICWAND_YELLOW = ITEMS.register("magicwand_yellow", () -> new Item(new Item.Properties()));
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
    public static final RegistryObject<Item> BLACK_UMBRELLA = ITEMS.register("black_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_UMBRELLA = ITEMS.register("blue_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_UMBRELLA = ITEMS.register("cyan_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_UMBRELLA = ITEMS.register("lime_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_UMBRELLA = ITEMS.register("green_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_UMBRELLA = ITEMS.register("purple_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_UMBRELLA = ITEMS.register("red_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_UMBRELLA = ITEMS.register("white_umbrella", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_UMBRELLA = ITEMS.register("yellow_umbrella", () -> new Item(new Item.Properties()));
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
    public static final RegistryObject<Item> APPLE_WATCH = ITEMS.register("apple_watch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIRPODS = ITEMS.register("airpods", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRACELET = ITEMS.register("bracelet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRACELET2 = ITEMS.register("bracelet2", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TABLET = ITEMS.register("tablet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_FLY_SWATTER = ITEMS.register("black_fly_swatter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_FLY_SWATTER = ITEMS.register("golden_fly_swatter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PCB_DUST = ITEMS.register("pcb_dust", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PCB = ITEMS.register("pcb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EASTER_BASKET = ITEMS.register("easter_basket", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUITAR = ITEMS.register("guitar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SANTA_CLAUS_STAFF = ITEMS.register("santa_claus_staff", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));

    //FOOD

    public static final RegistryObject<Item> BANANA = ITEMS.register("banana", () -> new Item(new Item.Properties().food(ModFood.BANANA)));

    //HALLOWEEEN
    //  public static final RegistryObject<Item> DEMON_RED_HORNS = ITEMS.register("demon_red_horns", ItemHalloween::new);
    //  public static final RegistryObject<Item> DEMON_RED_TAIL = ITEMS.register("demon_red_tail", ItemHalloween::new);
    //   public static final RegistryObject<Item> POMPOENLANTAARN = ITEMS.register("pompoenlantaarn", ItemHalloween::new);

public static void register(IEventBus eventbus) {
    ITEMS.register(eventbus);
    }
}
