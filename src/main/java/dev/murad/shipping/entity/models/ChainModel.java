package dev.murad.shipping.entity.models;// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import dev.murad.shipping.entity.custom.barge.AbstractBargeEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ChainModel extends EntityModel<AbstractBargeEntity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone2;

	public ChainModel() {
		texWidth = 16;
		texHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(-13.0F, 24.0F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);


		bone2 = new ModelRenderer(this);
		bone2.setPos(-1.0F, 0.0F, 1.0F);
		cube_r1.addChild(bone2);
		bone2.texOffs(0, 2).addBox(1.0F, -25.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(0, 0).addBox(0.0F, -25.0F, -13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.texOffs(3, 8).addBox(0.0F, -26.0F, -13.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		bone2.texOffs(4, 4).addBox(0.0F, -24.0F, -13.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(AbstractBargeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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