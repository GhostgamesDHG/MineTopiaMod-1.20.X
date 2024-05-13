package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class BalanceTransferProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance >= 1) {
			{
				double _setval = ((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "transferplayer");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance + DoubleArgumentType.getDouble(arguments, "tamounth");
				(new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "transferplayer");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()).getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.balance = _setval;
					capability.syncPlayerVariables((new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "transferplayer");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()));
				});
			}
			{
				double _setval = (entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance - DoubleArgumentType.getDouble(arguments, "tamounth");
				entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.balance = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("You have no money"), false);
		}
	}
}
