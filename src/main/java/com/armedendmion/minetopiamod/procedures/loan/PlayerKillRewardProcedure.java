package com.armedendmion.minetopiamod.procedures.loan;

import com.armedendmion.minetopiamod.init.GmmModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerKillRewardProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player && sourceentity instanceof Player) {
			if ((entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance >= 1) {
				{
					double _setval = (sourceentity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance
							+ (entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance * 0.1;
					sourceentity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				{
					double _setval = (entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GmmModVariables.PlayerVariables())).balance * 0.9;
					entity.getCapability(GmmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.balance = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

