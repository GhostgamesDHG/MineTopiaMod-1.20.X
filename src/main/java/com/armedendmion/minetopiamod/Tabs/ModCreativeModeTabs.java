package com.armedendmion.minetopiamod.Tabs;
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
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.ACACIA_FENCE))
                        .title(Component.translatable("creativetab.minetopia_items"))
                        .displayItems((pParameters, pOutput) -> {

                            pOutput.accept(Items.DIAMOND); //puts a diamond in the tab

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
