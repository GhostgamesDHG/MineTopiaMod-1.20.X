

package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.gui.safe.SAFEINVENTORYScreen;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiScreen;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiSetPasswordScreen;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
		//	MenuScreens.register(GmmModMenus.VENDING_SELECT.get(), VendingSelectScreen::new);
			MenuScreens.register(ModMenu.SAFE_GUI.get(), SafeGuiScreen::new);
			MenuScreens.register(ModMenu.SAFE_GUI_SET_PASSWORD.get(), SafeGuiSetPasswordScreen::new);
			MenuScreens.register(ModMenu.SAFEINVENTORY.get(), SAFEINVENTORYScreen::new);
		});
	}
}
