package com.armedendmion.minetopiamod.Tabs;
import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.items.ModItems;
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
                            pOutput.accept(ModItems.MONEY11.get());
                            pOutput.accept(ModItems.MONEY12.get());
                            pOutput.accept(ModItems.MONEY13.get());
                            pOutput.accept(ModItems.MONEY14.get());
                            pOutput.accept(ModItems.MONEY15.get());
                            pOutput.accept(ModItems.MONEY16.get());
                            pOutput.accept(ModItems.DEBIT_CARD.get());
                            pOutput.accept(ModItems.BLUE_CRYSTAL.get());
                            pOutput.accept(ModItems.COPPER_INGOT.get());
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
                            pOutput.accept(ModItems.STONE_KEY.get());
                            pOutput.accept(ModItems.MINETOPIABAG.get());
                            pOutput.accept(ModItems.PEPPERSPRAY.get());
                            pOutput.accept(ModItems.WATCH.get());
                            pOutput.accept(ModItems.LUCKYSHARD.get());
                            pOutput.accept(ModItems.BRONZE_PRISONCOIN.get());
                            pOutput.accept(ModItems.SILVER_PRISONCOIN.get());
                            pOutput.accept(ModItems.GRAYCOIN.get());
                            pOutput.accept(ModItems.MTCASINO_BLAUW.get());
                            pOutput.accept(ModItems.MTCASINO_GOLD.get());
                            pOutput.accept(ModItems.MTCASINO_GROEN.get());
                            pOutput.accept(ModItems.MTCASINO_ORANJE.get());
                            pOutput.accept(ModItems.MTCASINO_ROOD.get());
                            pOutput.accept(ModItems.MTCASINO_SILVER.get());
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
                            pOutput.accept(ModItems.BITCOIN.get());
                            pOutput.accept(ModItems.DASHCOIN.get());
                            pOutput.accept(ModItems.ETHEREUM.get());
                            pOutput.accept(ModItems.LITECOIN.get());
                            pOutput.accept(ModItems.EASTER_BASKET.get());
                            pOutput.accept(ModItems.GUITAR.get());
                            pOutput.accept(ModItems.WHEELCOIN.get());
                            pOutput.accept(ModItems.SANTA_CLAUS_STAFF.get());
                            pOutput.accept(ModItems.STEEL_INGOT.get());

                        })
                        .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_FOOD = CREATIVE_MODE_TABS.register("minetopia_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AIR))
                    .title(Component.translatable("creativetab.minetopia_food"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(Items.DIAMOND_BLOCK); //puts a diamond in the tab

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_BLOCKS = CREATIVE_MODE_TABS.register("minetopia_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.AIR))
                    .title(Component.translatable("creativetab.minetopia_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(Items.DIAMOND_BLOCK); //puts a diamond in the tab

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

                        pOutput.accept(Items.DIAMOND_BLOCK); //puts a diamond in the tab

                    })
                    .build());





    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }
    }
