package com.cfyifei.gui.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCaiban extends ModelBase {
	
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
	public ModelCaiban() {
		textureWidth = 64;
		textureHeight = 32;
    
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 14, 1, 14);
		Shape1.setRotationPoint(-7F, 23F, -7F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 15);
		Shape2.addBox(0F, 0F, 0F, 4, 1, 2);
		Shape2.setRotationPoint(-5F, 22.5F, -5F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 18);
		Shape3.addBox(0F, 0F, 0F, 6, 0, 4);
		Shape3.setRotationPoint(-1F, 22.5F, -5F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
	}
  
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    	Shape1.render(f5);
    	Shape2.render(f5);
    	Shape3.render(f5);
	}
  
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5 ,Entity e) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

  public void renderHatch() {
        render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
    }
}
