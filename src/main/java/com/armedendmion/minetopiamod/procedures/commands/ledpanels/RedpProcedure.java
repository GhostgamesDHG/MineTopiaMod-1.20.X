package com.armedendmion.minetopiamod.procedures.commands.ledpanels;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.level.LevelAccessor;

public class RedpProcedure {
	public static void execute(LevelAccessor world) {
		GmmModVariables.MapVariables.get(world).ledstate = 1;
		GmmModVariables.MapVariables.get(world).syncData(world);
	}
}
