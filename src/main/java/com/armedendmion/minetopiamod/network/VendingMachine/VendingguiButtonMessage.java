
package com.armedendmion.minetopiamod.network.VendingMachine;

import com.armedendmion.minetopiamod.MineTopiaMod;
import com.armedendmion.minetopiamod.gui.vendingmachine.VendingguiMenu;
import com.armedendmion.minetopiamod.procedures.VendingMachine.*;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;

import java.util.HashMap;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class VendingguiButtonMessage {
	private final int buttonID, x, y, z;

	public VendingguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public VendingguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(VendingguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(VendingguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = VendingguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			AProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			ChocolateProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			ChickenBucketProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			PizzaProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			FriesProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			SandwichProcedure.execute(world, entity);
		}
		if (buttonID == 6) {

			WaterbottleProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			MilkshakeProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MineTopiaMod.addNetworkMessage(VendingguiButtonMessage.class, VendingguiButtonMessage::buffer, VendingguiButtonMessage::new, VendingguiButtonMessage::handler);
	}
}
