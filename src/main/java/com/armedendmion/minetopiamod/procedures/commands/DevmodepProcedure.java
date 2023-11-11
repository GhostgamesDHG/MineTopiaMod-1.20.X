package com.armedendmion.minetopiamod.procedures.commands;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class DevmodepProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (GmmModVariables.MapVariables.get(world).DevMode == false) {
			GmmModVariables.MapVariables.get(world).DevMode = true;
			GmmModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("DevMode on!"), true);
		} else if (GmmModVariables.MapVariables.get(world).DevMode == true) {
			GmmModVariables.MapVariables.get(world).DevMode = false;
			GmmModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("DevMode off!"), true);
		}
	}
}
