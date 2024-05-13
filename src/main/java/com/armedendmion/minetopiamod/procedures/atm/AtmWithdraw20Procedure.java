package com.armedendmion.minetopiamod.procedures.atm;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import com.armedendmion.minetopiamod.init.ModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;

public class AtmWithdraw20Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance >= 20) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModItems.MONEY5.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				double _setval = (entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance - 20;
				entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.balance = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
