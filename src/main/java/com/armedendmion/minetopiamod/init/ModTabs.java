package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineTopiaMod.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> MINETOPIA_ITEMS_TAB = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINETOPIA_BLOCKS_TAB = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINETOPIA_DOLLS_TAB = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINETOPIA_HATS_TAB = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINETOPIA_FOOD_TAB = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MINETOPIA_TOOLS_TAB = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MINETOPIA_ITEMS = MODE_TABS.register("minetopia_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IPHONE_7_BLACK.get()))
                    .title(Component.translatable("creativetab.minetopia_items"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_ITEMS_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_BLOCKS = MODE_TABS.register("minetopia_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ATM.get()))
                    .title(Component.translatable("creativetab.minetopia_blocks"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_BLOCKS_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_DOLLS = MODE_TABS.register("minetopia_dolls",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PAPEGAAIPOPPETJE.get()))
                    .title(Component.translatable("creativetab.minetopia_dolls"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_DOLLS_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_HATS = MODE_TABS.register("minetopia_hats",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BEERHEAD.get()))
                    .title(Component.translatable("creativetab.minetopia_hats"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_HATS_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_FOOD = MODE_TABS.register("minetopia_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOTDOG.get()))
                    .title(Component.translatable("creativetab.minetopia_food"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_FOOD_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static final RegistryObject<CreativeModeTab> MINETOPIA_TOOLS = MODE_TABS.register("minetopia_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE_PICKAXE.get()))
                    .title(Component.translatable("creativetab.minetopia_tools"))
                    .displayItems((displayParameters, output) ->
                            MINETOPIA_TOOLS_TAB.forEach(itemLike -> output.accept(itemLike.get()))
                    )
                    .build());

    public static <T extends Item> RegistryObject<T> addToItemsTab(RegistryObject<T> itemLike) {
        MINETOPIA_ITEMS_TAB.add(itemLike);
        return itemLike;
    }

    public static <T extends Block> RegistryObject<T> addToBlocksTab(RegistryObject<T> blockLike) {
        MINETOPIA_BLOCKS_TAB.add(blockLike);
        return blockLike;
    }

    public static <T extends Item> RegistryObject<T> addToFoodTab(RegistryObject<T> itemLike) {
        MINETOPIA_FOOD_TAB.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToToolsTab(RegistryObject<T> itemLike) {
        MINETOPIA_TOOLS_TAB.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToHatsTab(RegistryObject<T> itemLike) {
        MINETOPIA_HATS_TAB.add(itemLike);
        return itemLike;
    }

    public static <T extends Item> RegistryObject<T> addToDollsTab(RegistryObject<T> itemLike) {
        MINETOPIA_DOLLS_TAB.add(itemLike);
        return itemLike;
    }


    public static void register(IEventBus eventBus) {
        MODE_TABS.register(eventBus);
    }
}
