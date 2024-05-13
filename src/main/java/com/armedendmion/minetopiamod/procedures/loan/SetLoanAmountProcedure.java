package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class SetLoanAmountProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if (DoubleArgumentType.getDouble(arguments, "loan_amount") >= 50) {
			GmmModVariables.MapVariables.get(world).LoanAmount = DoubleArgumentType.getDouble(arguments, "loan_amount");
			GmmModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A76The loan amount is set to: " + new java.text.DecimalFormat("\u00A76##.## Euro").format(DoubleArgumentType.getDouble(arguments, "loan_amount")))), false);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cThe minimum is 50 euro."), false);
			GmmModVariables.MapVariables.get(world).LoanAmount = 50;
			GmmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
