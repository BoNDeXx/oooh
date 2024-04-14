package net.mcreator.zweihanderrp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class Testslotchange1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Testrecipe1Procedure.execute(world, x, y, z, entity);
	}
}
