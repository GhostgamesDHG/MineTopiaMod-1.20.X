
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.armedendmion.minetopiamod.init;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.gui.bin.BinGuiMenu;
import com.armedendmion.minetopiamod.gui.container.ContainerguiMenu;
import com.armedendmion.minetopiamod.gui.garbagecan.GarbageGuiMenu;
import com.armedendmion.minetopiamod.gui.safe.SAFEINVENTORYMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiMenu;
import com.armedendmion.minetopiamod.gui.safe.SafeGuiSetPasswordMenu;
import com.armedendmion.minetopiamod.gui.vendingmachine.VendingguiMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenu {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MineTopiaMod.MOD_ID);
//	public static final RegistryObject<MenuType<CabinetSelectMenu>> CABINET_SELECT = REGISTRY.register("cabinet_select", () -> IForgeMenuType.create(CabinetSelectMenu::new));
public static final RegistryObject<MenuType<VendingguiMenu>> VENDINGGUI = REGISTRY.register("vendinggui", () -> IForgeMenuType.create(VendingguiMenu::new));
	public static final RegistryObject<MenuType<SafeGuiMenu>> SAFE_GUI = REGISTRY.register("safe_gui", () -> IForgeMenuType.create(SafeGuiMenu::new));
	public static final RegistryObject<MenuType<SafeGuiSetPasswordMenu>> SAFE_GUI_SET_PASSWORD = REGISTRY.register("safe_gui_set_password", () -> IForgeMenuType.create(SafeGuiSetPasswordMenu::new));
	public static final RegistryObject<MenuType<SAFEINVENTORYMenu>> SAFEINVENTORY = REGISTRY.register("safeinventory", () -> IForgeMenuType.create(SAFEINVENTORYMenu::new));
	public static final RegistryObject<MenuType<BinGuiMenu>> BIN_GUI = REGISTRY.register("bin_gui", () -> IForgeMenuType.create(BinGuiMenu::new));
	public static final RegistryObject<MenuType<GarbageGuiMenu>> GARBAGE_GUI = REGISTRY.register("garbage_gui", () -> IForgeMenuType.create(GarbageGuiMenu::new));
	public static final RegistryObject<MenuType<ContainerguiMenu>> CONTAINER_GUI = REGISTRY.register("container_gui", () -> IForgeMenuType.create(ContainerguiMenu::new));
}
