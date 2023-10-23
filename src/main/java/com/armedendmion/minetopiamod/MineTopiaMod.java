package com.armedendmion.minetopiamod;

import com.armedendmion.minetopiamod.Tabs.ModCreativeModeTabs;
import com.armedendmion.minetopiamod.blocks.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(MineTopiaMod.MOD_ID)
public class MineTopiaMod
{
    public static final String MOD_ID = "gmm";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MineTopiaMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModeTabs.register(bus);
    //    ModBlocks.BLOCKS.register(bus);
    //    ModSoundEvents.register(bus);
    //    ModItems.ITEMS.register(bus);
    //    BlockItems.ITEMS.register(bus);
    //    ModFood.ITEMS.register(bus);
    //    ModHats.ITEMS.register(bus);
    //    ModArmor.ITEMS.register(bus);
    //    ModDolls.ITEMS.register(bus);
    //    ModTools.ITEMS.register(bus);
    //    ModPaintings.PAINTING_TYPES.register(bus);
        bus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
