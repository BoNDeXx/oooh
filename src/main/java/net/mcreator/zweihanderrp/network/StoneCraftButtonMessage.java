
package net.mcreator.zweihanderrp.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.zweihanderrp.world.inventory.StoneCraftMenu;
import net.mcreator.zweihanderrp.procedures.Stonecraft5arrowhedusProcedure;
import net.mcreator.zweihanderrp.procedures.Stonecraft4PixcaleProcedure;
import net.mcreator.zweihanderrp.procedures.Stonecraft3HoeProcedure;
import net.mcreator.zweihanderrp.procedures.Stonecraft2ShoveclickProcedure;
import net.mcreator.zweihanderrp.procedures.Stonecraft1clickProcedure;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StoneCraftButtonMessage {
	private final int buttonID, x, y, z;

	public StoneCraftButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public StoneCraftButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(StoneCraftButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(StoneCraftButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = StoneCraftMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Stonecraft4PixcaleProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			Stonecraft3HoeProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			Stonecraft1clickProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			Stonecraft2ShoveclickProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			Stonecraft5arrowhedusProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ZweihanderrpMod.addNetworkMessage(StoneCraftButtonMessage.class, StoneCraftButtonMessage::buffer, StoneCraftButtonMessage::new, StoneCraftButtonMessage::handler);
	}
}
