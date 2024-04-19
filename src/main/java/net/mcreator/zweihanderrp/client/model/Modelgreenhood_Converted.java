package net.mcreator.zweihanderrp.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgreenhood_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("zweihanderrp", "modelgreenhood_converted"), "main");
	public final ModelPart bb_main;

	public Modelgreenhood_Converted(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 19).addBox(-4.5F, -6.0F, -4.0F, 0.5F, 4.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(8, 32).addBox(-4.5F, -7.0F, -3.5F, 0.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(-4.5F, -8.0F, -0.5F, 0.5F, 8.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(24, 32).addBox(-4.5F, -8.0F, 2.0F, 0.5F, 8.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, -8.5F, -4.0F, 2.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(-1.7F, -8.5F, -2.0F, 3.5F, 0.5F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-1.0F, -8.5F, 2.0F, 2.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -4.0F, 4.5F, 2.0F, 5.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 21)
						.addBox(1.0F, -5.0F, 4.5F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 18).addBox(-2.0F, -5.0F, 4.5F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(0.0F, 1.0F, 4.5F, 1.0F, 1.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(32, 21).addBox(-4.5F, -7.0F, 2.5F, 0.5F, 6.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(32, 21)
						.addBox(4.0F, -7.0F, 2.5F, 0.5F, 6.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 32).addBox(4.0F, -8.0F, 2.0F, 0.5F, 8.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(29, 29)
						.addBox(4.0F, -8.0F, -0.5F, 0.5F, 8.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(8, 32).addBox(4.0F, -7.0F, -3.5F, 0.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(4.0F, -6.0F, -4.0F, 0.5F, 4.0F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Helmet_r1 = bb_main.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -6.0F, -1.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bb_main.xRot = headPitch / (180F / (float) Math.PI);
	}
}
