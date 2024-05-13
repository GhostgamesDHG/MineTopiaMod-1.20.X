package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

public class BalancestatusProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(
					Component.literal((new java.text.DecimalFormat("\u00A76Balance: ##.##").format((entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance) + " \u00A76Euro")), false);
	}
}
