

package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.gui.Bag.BagGuiScreen;
import com.armedendmion.minetopiamod.gui.BrownCabinet.BrownCabinetGuiScreen;
import com.armedendmion.minetopiamod.gui.OilCanGUIScreen;
import com.armedendmion.minetopiamod.gui.atm.AtmdepositScreen;
import com.armedendmion.minetopiamod.gui.atm.AtmguiScreen;
import com.armedendmion.minetopiamod.gui.atm.AtmwithdrawScreen;
import com.armedendmion.minetopiamod.gui.bin.BinGuiScreen;
import com.armedendmion.minetopiamod.gui.container.ContainerguiScreen;
import com.armedendmion.minetopiamod.gui.garbagecan.GarbageGuiScreen;
import com.armedendmion.minetopiamod.gui.safe.SAFEINVENTORYScreen;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiScreen;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiSetPasswordScreen;
import com.armedendmion.minetopiamod.gui.vendingmachine.VendingGuiScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ModMenu.VENDINGGUI.get(), VendingGuiScreen::new);
			MenuScreens.register(ModMenu.SAFE_GUI.get(), SafeGuiScreen::new);
			MenuScreens.register(ModMenu.SAFE_GUI_SET_PASSWORD.get(), SafeGuiSetPasswordScreen::new);
			MenuScreens.register(ModMenu.SAFEINVENTORY.get(), SAFEINVENTORYScreen::new);
			MenuScreens.register(ModMenu.BIN_GUI.get(), BinGuiScreen::new);
			MenuScreens.register(ModMenu.GARBAGE_GUI.get(), GarbageGuiScreen::new);
			MenuScreens.register(ModMenu.CONTAINER_GUI.get(), ContainerguiScreen::new);
			MenuScreens.register(ModMenu.BROWN_CABINET_GUI.get(), BrownCabinetGuiScreen::new);
			MenuScreens.register(ModMenu.BAG_GUI.get(), BagGuiScreen::new);
			MenuScreens.register(ModMenu.ATMGUI.get(), AtmguiScreen::new);
			MenuScreens.register(ModMenu.ATMDEPOSIT.get(), AtmdepositScreen::new);
			MenuScreens.register(ModMenu.ATMWITHDRAW.get(), AtmwithdrawScreen::new);
			MenuScreens.register(ModMenu.OILCAN.get(), OilCanGUIScreen::new);
		});
	}
}
