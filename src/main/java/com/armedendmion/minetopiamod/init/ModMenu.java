
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.gui.safe.SAFEINVENTORYMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiSetPasswordMenu;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ModMenu {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MineTopiaMod.MOD_ID);
//	public static final RegistryObject<MenuType<CabinetSelectMenu>> CABINET_SELECT = REGISTRY.register("cabinet_select", () -> IForgeMenuType.create(CabinetSelectMenu::new));
//	public static final RegistryObject<MenuType<VendingSelectMenu>> VENDING_SELECT = REGISTRY.register("vending_select", () -> IForgeMenuType.create(VendingSelectMenu::new));
	public static final RegistryObject<MenuType<SafeGuiMenu>> SAFE_GUI = REGISTRY.register("safe_gui", () -> IForgeMenuType.create(SafeGuiMenu::new));
	public static final RegistryObject<MenuType<SafeGuiSetPasswordMenu>> SAFE_GUI_SET_PASSWORD = REGISTRY.register("safe_gui_set_password", () -> IForgeMenuType.create(SafeGuiSetPasswordMenu::new));
	public static final RegistryObject<MenuType<SAFEINVENTORYMenu>> SAFEINVENTORY = REGISTRY.register("safeinventory", () -> IForgeMenuType.create(SAFEINVENTORYMenu::new));
}
