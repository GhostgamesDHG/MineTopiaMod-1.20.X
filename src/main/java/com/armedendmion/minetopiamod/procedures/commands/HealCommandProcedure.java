package com.armedendmion.minetopiamod.procedures.commands;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class HealCommandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7c\u00A7lYou have been healed!"), true);
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(20);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(20);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.HEART, x, y, z, 10, 1, 1, 1, 0.5);
	}
}
