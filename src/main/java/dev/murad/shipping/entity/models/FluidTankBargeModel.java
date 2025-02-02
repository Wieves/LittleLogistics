package dev.murad.shipping.entity.models;// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import dev.murad.shipping.entity.custom.barge.FluidTankBargeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FluidTankBargeModel extends EntityModel<FluidTankBargeEntity> {
	private final ModelRenderer bb_main;

	public FluidTankBargeModel() {
		texWidth = 128;
		texHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 23.0F, 0.0F);
		bb_main.texOffs(0, 0).addBox(-6.0F, -27.0F, -7.0F, 12.0F, 5.0F, 14.0F, 0.0F, false);
		bb_main.texOffs(38, 5).addBox(-8.0F, -29.0F, -7.0F, 2.0F, 4.0F, 14.0F, 0.0F, false);
		bb_main.texOffs(28, 43).addBox(-6.0F, -29.0F, -9.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(26, 25).addBox(6.0F, -29.0F, -7.0F, 2.0F, 4.0F, 14.0F, 0.0F, false);
		bb_main.texOffs(0, 41).addBox(-6.0F, -29.0F, 7.0F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(16, 49).addBox(-6.0F, -28.0F, -5.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-6.0F, -38.0F, -6.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(2.0F, -38.0F, -6.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(38, 0).addBox(-2.0F, -38.0F, -4.0F, 4.0F, 10.0F, 0.0F, 0.0F, false);
		bb_main.texOffs(38, 0).addBox(-2.0F, -38.0F, 5.0F, 4.0F, 10.0F, 0.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(2.0F, -38.0F, 4.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(4.0F, -38.0F, 2.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(38, -4).addBox(5.0F, -38.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(38, -4).addBox(-5.0F, -38.0F, -2.0F, 0.0F, 10.0F, 4.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(4.0F, -38.0F, -4.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-6.0F, -38.0F, -4.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-6.0F, -38.0F, 2.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-6.0F, -38.0F, 4.0F, 4.0F, 10.0F, 2.0F, 0.0F, false);
		bb_main.texOffs(16, 49).addBox(-6.0F, -39.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.texOffs(72, 0).addBox(-4.0F, -40.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(FluidTankBargeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}