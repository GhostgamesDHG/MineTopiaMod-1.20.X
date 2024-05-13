package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class SetLoanTimerAmountProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "timer_amount") >= 1) {
			GmmModVariables.MapVariables.get(world).LoanTimerAmount = DoubleArgumentType.getDouble(arguments, "timer_amount");
			GmmModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76The timer is set to: " + new java.text.DecimalFormat("\u00A76##.## minutes").format(DoubleArgumentType.getDouble(arguments, "timer_amount")))), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cThe minimum is 1 minute."), false);
			GmmModVariables.MapVariables.get(world).LoanTimerAmount = 1;
			GmmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
