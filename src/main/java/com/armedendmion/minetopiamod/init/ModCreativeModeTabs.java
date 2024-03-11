package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineTopiaMod.MOD_ID);

        public static final RegistryObject<CreativeModeTab> MINETOPIA_ITEMS = CREATIVE_MODE_TABS.register("minetopia_items",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IPHONE_7_BLACK.get()))
                        .title(Component.translatable("creativetab.minetopia_items"))
                        .displayItems((pParameters, pOutput) -> {

                            pOutput.accept(ModItems.IPHONE_7_BLACK.get());
                            pOutput.accept(ModItems.IPHONE_7_BLUE.get());
                            pOutput.accept(ModItems.IPHONE_7_GREEN.get());
                            pOutput.accept(ModItems.IPHONE_7_PINK.get());
                            pOutput.accept(ModItems.IPHONE_7_RED.get());
                            pOutput.accept(ModItems.IPHONE_7_YELLOW.get());
                            pOutput.accept(ModItems.MONEY1.get());
                            pOutput.accept(ModItems.MONEY2.get());
                            pOutput.accept(ModItems.MONEY3.get());
                            pOutput.accept(ModItems.MONEY4.get());
                            pOutput.accept(ModItems.MONEY5.get());
                            pOutput.accept(ModItems.MONEY6.get());
                            pOutput.accept(ModItems.MONEY7.get());
                            pOutput.accept(ModItems.MONEY8.get());
                            pOutput.accept(ModItems.MONEY9.get());
                            pOutput.accept(ModItems.MONEY10.get());
                            pOutput.accept(ModItems.DEBIT_CARD.get());
                            pOutput.accept(ModItems.BLUE_CRYSTAL.get());
                            pOutput.accept(ModItems.PINK_BALLOON.get());
                            pOutput.accept(ModItems.RED_BALLOON.get());
                            pOutput.accept(ModItems.CHRISTMAS_BALLOON.get());
                            pOutput.accept(ModItems.ORANGE_BALLOON.get());
                            pOutput.accept(ModItems.GREEN_BALLOON.get());
                            pOutput.accept(ModItems.YELLOW_BALLOON.get());
                            pOutput.accept(ModItems.BLUE_BALLOON.get());
                            pOutput.accept(ModItems.SPORTS_WATCH.get());
                            pOutput.accept(ModItems.HINKING_BRANCH.get());
                            pOutput.accept(ModItems.RING.get());
                            pOutput.accept(ModItems.BLUE_WHITE_UMBRELLA.get());
                            pOutput.accept(ModItems.RAINBOW_UMBRELLA.get());
                            pOutput.accept(ModItems.RED_WHITE_UMBRELLA.get());
                            pOutput.accept(ModItems.MINETOPIABAG.get());
                            pOutput.accept(ModItems.PEPPERSPRAY.get());
                            pOutput.accept(ModItems.WATCH.get());
                            pOutput.accept(ModItems.BRONZE_PRISONCOIN.get());
                            pOutput.accept(ModItems.SILVER_PRISONCOIN.get());
                            pOutput.accept(ModItems.CASINO_COIN_BLUE.get());
                            pOutput.accept(ModItems.CASINO_COIN_GOLD.get());
                            pOutput.accept(ModItems.CASINO_COIN_GREEN.get());
                            pOutput.accept(ModItems.CASINO_COIN_ORANGE.get());
                            pOutput.accept(ModItems.CASINO_COIN_RED.get());
                            pOutput.accept(ModItems.CASINO_COIN_SILVER.get());
                            pOutput.accept(ModItems.WHEELCOIN.get());
                            pOutput.accept(ModItems.LEGEND_50.get());
                            pOutput.accept(ModItems.LEGEND_1.get());
                            pOutput.accept(ModItems.EPIC_1.get());
                            pOutput.accept(ModItems.EPIC_5.get());
                            pOutput.accept(ModItems.EPIC_10.get());
                            pOutput.accept(ModItems.COMMON_1.get());
                            pOutput.accept(ModItems.COMMON_10.get());
                            pOutput.accept(ModItems.COMMON_50.get());
                            pOutput.accept(ModItems.MODERN_WALKING_STICK.get());
                            pOutput.accept(ModItems.POCKET_UMBRELLA.get());
                            pOutput.accept(ModItems.MAGICWAND.get());
                            pOutput.accept(ModItems.MAGICWAND_YELLOW.get());
                            pOutput.accept(ModItems.MAGICWAND_BLUE.get());
                            pOutput.accept(ModItems.MAGICWAND_RED.get());
                            pOutput.accept(ModItems.MAGICWAND_GREEN.get());
                            pOutput.accept(ModItems.KEY_DICE_BRONZE.get());
                            pOutput.accept(ModItems.KEY_DICE_DIAMOND.get());
                            pOutput.accept(ModItems.KEY_DICE_EMERALD.get());
                            pOutput.accept(ModItems.KEY_DICE_GOLD.get());
                            pOutput.accept(ModItems.KEY_DICE_MYSTIC.get());
                            pOutput.accept(ModItems.KEY_DICE_REDSTONE.get());
                            pOutput.accept(ModItems.KEY_DICE_SILVER.get());
                            pOutput.accept(ModItems.KEY_HAMMER_BRONZE.get());
                            pOutput.accept(ModItems.KEY_HAMMER_DIAMOND.get());
                            pOutput.accept(ModItems.KEY_HAMMER_EMERALD.get());
                            pOutput.accept(ModItems.KEY_HAMMER_MYSTIC.get());
                            pOutput.accept(ModItems.KEY_HAMMER_GOLD.get());
                            pOutput.accept(ModItems.KEY_HAMMER_REDSTONE.get());
                            pOutput.accept(ModItems.KEY_HAMMER_SILVER.get());
                            pOutput.accept(ModItems.BLACK_UMBRELLA.get());
                            pOutput.accept(ModItems.BLUE_UMBRELLA.get());
                            pOutput.accept(ModItems.CYAN_UMBRELLA.get());
                            pOutput.accept(ModItems.LIME_UMBRELLA.get());
                            pOutput.accept(ModItems.GREEN_UMBRELLA.get());
                            pOutput.accept(ModItems.PURPLE_UMBRELLA.get());
                            pOutput.accept(ModItems.RED_UMBRELLA.get());
                            pOutput.accept(ModItems.WHITE_UMBRELLA.get());
                            pOutput.accept(ModItems.YELLOW_UMBRELLA.get());
                            pOutput.accept(ModItems.RACECOIN1.get());
                            pOutput.accept(ModItems.RACECOIN10.get());
                            pOutput.accept(ModItems.RACECOIN50.get());
                            pOutput.accept(ModItems.RACECOIN100.get());
                            pOutput.accept(ModItems.RACECOIN500.get());
                            pOutput.accept(ModItems.RACECOIN1000.get());
                            pOutput.accept(ModItems.RACECOIN2500.get());
                            pOutput.accept(ModItems.RACECOIN5000.get());
                            pOutput.accept(ModItems.ROLEX_GOLD.get());
                            pOutput.accept(ModItems.ROLEX_DIAMOND.get());
                            pOutput.accept(ModItems.ROLEX_SILVER.get());
                            pOutput.accept(ModItems.APPLE_WATCH.get());
                            pOutput.accept(ModItems.AIRPODS.get());
                            pOutput.accept(ModItems.BRACELET.get());
                            pOutput.accept(ModItems.BRACELET2.get());
                            pOutput.accept(ModItems.TABLET.get());
                            pOutput.accept(ModItems.BLACK_FLY_SWATTER.get());
                            pOutput.accept(ModItems.GOLDEN_FLY_SWATTER.get());
                            pOutput.accept(ModItems.PCB_DUST.get());
                            pOutput.accept(ModItems.PCB.get());
                            pOutput.accept(ModItems.EASTER_BASKET.get());
                            pOutput.accept(ModItems.GUITAR.get());
                            pOutput.accept(ModItems.SANTA_CLAUS_STAFF.get());
                            pOutput.accept(ModItems.STEEL_INGOT.get());
                            pOutput.accept(ModItems.PUMPKINLANTERN.get());

                        })
                        .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_FOOD = CREATIVE_MODE_TABS.register("minetopia_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOTDOG.get()))
                    .title(Component.translatable("creativetab.minetopia_food"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.BANANA.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.HAMBURGER.get());
                        pOutput.accept(ModItems.SANDWICH.get());
                        pOutput.accept(ModItems.PINEAPPLE.get());
                        pOutput.accept(ModItems.BACON.get());
                        pOutput.accept(ModItems.COOKED_BACON.get());
                        pOutput.accept(ModItems.CHICKEN.get());
                        pOutput.accept(ModItems.COOKED_CHICKEN.get());
                        pOutput.accept(ModItems.HOTDOG.get());
                        pOutput.accept(ModItems.ICECREAM.get());
                        pOutput.accept(ModItems.CODFISH.get());
                        pOutput.accept(ModItems.FRIES.get());
                        pOutput.accept(ModItems.PIZZA.get());
                        pOutput.accept(ModItems.CHICKEN_BUCKET.get());
                        pOutput.accept(ModItems.FRUIT_SKEWER.get());
                        pOutput.accept(ModItems.SUSHI.get());
                        pOutput.accept(ModItems.SUSHI_PACKAGE.get());
                        pOutput.accept(ModItems.MUFFIN.get());
                        pOutput.accept(ModItems.VANILLA_MUFFIN.get());
                        pOutput.accept(ModItems.CHOCOLATE_MUFFIN.get());
                        pOutput.accept(ModItems.JELLYBEANS.get());
                        pOutput.accept(ModItems.CANDY_CANE.get());
                        pOutput.accept(ModItems.DOUBLE_SUSHI_PACKAGE.get());
                        pOutput.accept(ModItems.CUPCAKES.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.GRAPES.get());
                        pOutput.accept(ModItems.RED_GRAPES.get());
                        pOutput.accept(ModItems.HOP.get());
                        pOutput.accept(ModItems.CHIPS_NATURAL.get());
                        pOutput.accept(ModItems.DONUT_BLUEBERRIES.get());
                        pOutput.accept(ModItems.DONUT_CHOCOLATE.get());
                        pOutput.accept(ModItems.DONUT_CHRISTMAS.get());
                        pOutput.accept(ModItems.DONUT_HALLOWEEN.get());
                        pOutput.accept(ModItems.DONUT_STRAWBERRY.get());
                        pOutput.accept(ModItems.DONUT_WHITE.get());
                        pOutput.accept(ModItems.STRAWBERRY_ICECREAM.get());
                        pOutput.accept(ModItems.CHOCOLATE_LETTER.get());
                        pOutput.accept(ModItems.CHOCOLATE_BAR.get());
                        pOutput.accept(ModItems.APFELSTRUDEL.get());
                        pOutput.accept(ModItems.BITTERBALLEN.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_BLOCKS = CREATIVE_MODE_TABS.register("minetopia_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ATM.get()))
                    .title(Component.translatable("creativetab.minetopia_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ORANGE_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.BLACK_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.BLUE_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.RED_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.YELLOW_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.GREEN_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.MAGENTA_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.PURPLE_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.PINK_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.LIGHT_GREEN_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.GRAY_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.CYAN_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.BROWN_KITCHEN_TILES.get());
                        pOutput.accept(ModBlocks.ATM.get());
                        pOutput.accept(ModBlocks.BLUE_CRYSTAL_BLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_CRYSTAL_ORE.get());
                        pOutput.accept(ModBlocks.PCB_ORE.get());
                        pOutput.accept(ModBlocks.PORTABLE_ATM.get());
                        pOutput.accept(ModBlocks.LAMP.get());
                        pOutput.accept(ModBlocks.COMPUTER.get());
                        pOutput.accept(ModBlocks.DOG_COT.get());
                        pOutput.accept(ModBlocks.OIL_CAN.get());
                        pOutput.accept(ModBlocks.PARKING_SIGN.get());
                        pOutput.accept(ModBlocks.PUMPKIN.get());
                        pOutput.accept(ModBlocks.ROADBLOCK.get());
                        pOutput.accept(ModBlocks.SCHOENTJE.get());
                        pOutput.accept(ModBlocks.TRAFFIC_CONE.get());
                        pOutput.accept(ModBlocks.LANTERN.get());
                        pOutput.accept(ModBlocks.BOOMBOX.get());
                        pOutput.accept(ModBlocks.CAMERA.get());
                        pOutput.accept(ModBlocks.OWL.get());
                        pOutput.accept(ModBlocks.WREATH.get());
                        pOutput.accept(ModBlocks.CHRISTMAS_GARLANDS.get());
                        pOutput.accept(ModBlocks.BLACK_BRICKS.get());
                        pOutput.accept(ModBlocks.WHITE_BRICKS.get());
                        pOutput.accept(ModBlocks.SAFE.get());
                        pOutput.accept(ModBlocks.VENDINGMACHINE.get());
                        pOutput.accept(ModBlocks.FIRE_PIT.get());
                        pOutput.accept(ModBlocks.MONITOR.get());
                        pOutput.accept(ModBlocks.ANTENNA.get());
                        pOutput.accept(ModBlocks.GLOBE.get());
                        pOutput.accept(ModBlocks.NOTEBOOK.get());
                        pOutput.accept(ModBlocks.DARTBORD.get());
                        pOutput.accept(ModBlocks.WALL_LIGHT.get());
                        pOutput.accept(ModBlocks.BIN.get());
                        pOutput.accept(ModBlocks.GARBAGE_CAN.get());
                        pOutput.accept(ModBlocks.WASTE_CONTAINER.get());
                        pOutput.accept(ModBlocks.SMALL_TREE.get());
                        pOutput.accept(ModBlocks.TABLE_PLANT.get());
                        pOutput.accept(ModBlocks.COOLBOX.get());
                        pOutput.accept(ModBlocks.MODERN_PLANT.get());
                        pOutput.accept(ModBlocks.MODERN_PANCAKE_PLANT.get());
                        pOutput.accept(ModBlocks.TABLE_LAMP.get());
                        pOutput.accept(ModBlocks.BROWN_CABINET.get());
                        pOutput.accept(ModBlocks.WHITE_BAG.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_TOOLS = CREATIVE_MODE_TABS.register("minetopia_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AIR))
                    .title(Component.translatable("creativetab.minetopia_tools"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(Items.DIAMOND_BLOCK); //puts a diamond in the tab

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_DOLLS = CREATIVE_MODE_TABS.register("minetopia_dolls",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AIR))
                    .title(Component.translatable("creativetab.minetopia_dolls"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(Items.DIAMOND_BLOCK); //puts a diamond in the tab

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_HATS = CREATIVE_MODE_TABS.register("minetopia_hats",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AIR))
                    .title(Component.translatable("creativetab.minetopia_hats"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.DEMON_RED_HORNS.get());

                    })
                    .build());





    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
    }
