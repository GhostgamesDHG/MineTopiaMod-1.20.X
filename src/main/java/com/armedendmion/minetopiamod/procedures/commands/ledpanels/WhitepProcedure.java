package com.armedendmion.minetopiamod.procedures.commands.ledpanels;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.level.LevelAccessor;

public class WhitepProcedure {
	public static void execute(LevelAccessor world) {
		GmmModVariables.MapVariables.get(world).ledstate = 3;
		GmmModVariables.MapVariables.get(world).syncData(world);
	}
}
