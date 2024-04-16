package net.mcreator.zweihanderrp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class AnvilGUIOpenTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		KricaResultProcedure.execute(world, x, y, z);
		ForgedKricaProcedure.execute(world, x, y, z, entity);
	}
}
