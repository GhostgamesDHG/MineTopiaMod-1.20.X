package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class LoanstatusProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (GmmModVariables.MapVariables.get(world).Stoptimer == 0) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A76The loan system is active. "), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A76The current time is: "), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								(new java.text.DecimalFormat("\u00A76##.## minutes and ").format(GmmModVariables.MapVariables.get(world).timeMin) + "" + new java.text.DecimalFormat("\u00A76##.## seconds").format(GmmModVariables.MapVariables.get(world).timeSec))),
						false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cThe loan system is not active"), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cThe current time is: "), false);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(
						Component.literal(
								(new java.text.DecimalFormat("\u00A7c##.## minutes and ").format(GmmModVariables.MapVariables.get(world).timeMin) + "" + new java.text.DecimalFormat("\u00A7c##.## seconds").format(GmmModVariables.MapVariables.get(world).timeSec))),
						false);
		}
	}
}
