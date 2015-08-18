package com.cfyifei.gui.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGuo extends ModelBase {
    ModelRenderer Shape1;
    ModelRenderer Shape11;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape33;
    ModelRenderer Shape43;
    ModelRenderer Shape45;
    ModelRenderer Shape48;
    ModelRenderer Shape456;
    ModelRenderer Shape47;
    ModelRenderer Shape46;
  
  public ModelGuo() {
    textureWidth = 100;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 13);
      Shape1.addBox(0F, 0F, 0F, 14, 6, 1);
      Shape1.setRotationPoint(-7F, 17F, 6F);
      Shape1.setTextureSize(100, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 13);
      Shape11.addBox(0F, 0F, 0F, 14, 6, 1);
      Shape11.setRotationPoint(-7F, 17F, -7F);
      Shape11.setTextureSize(100, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape22 = new ModelRenderer(this, 48, 0);
      Shape22.addBox(0F, 0F, 0F, 1, 6, 14);
      Shape22.setRotationPoint(-7F, 17F, -7F);
      Shape22.setTextureSize(100, 32);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 48, 0);
      Shape23.addBox(0F, 0F, 0F, 1, 6, 14);
      Shape23.setRotationPoint(6F, 17F, -7F);
      Shape23.setTextureSize(100, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
      Shape33 = new ModelRenderer(this, 0, 0);
      Shape33.addBox(0F, 0F, 0F, 12, 1, 12);
      Shape33.setRotationPoint(-6F, 23F, -6F);
      Shape33.setTextureSize(100, 32);
      Shape33.mirror = true;
      setRotation(Shape33, 0F, 0F, 0F);
      Shape43 = new ModelRenderer(this, 0, 24);
      Shape43.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape43.setRotationPoint(7F, 17F, -3F);
      Shape43.setTextureSize(100, 32);
      Shape43.mirror = true;
      setRotation(Shape43, 0F, 0F, 0F);
      Shape45 = new ModelRenderer(this, 0, 24);
      Shape45.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape45.setRotationPoint(7F, 17F, 2F);
      Shape45.setTextureSize(100, 32);
      Shape45.mirror = true;
      setRotation(Shape45, 0F, 0F, 0F);
      Shape48 = new ModelRenderer(this, 0, 20);
      Shape48.addBox(0F, 0F, 0F, 1, 0, 4);
      Shape48.setRotationPoint(8F, 17F, -2F);
      Shape48.setTextureSize(100, 32);
      Shape48.mirror = true;
      setRotation(Shape48, 0F, 0F, 0F);
      Shape456 = new ModelRenderer(this, 0, 0);
      Shape456.addBox(0F, 24F, 0F, 1, 1, 1);
      Shape456.setRotationPoint(-8F, -7F, 2F);
      Shape456.setTextureSize(100, 32);
      Shape456.mirror = true;
      setRotation(Shape456, 0F, 0F, 0F);
      Shape47 = new ModelRenderer(this, 0, 20);
      Shape47.addBox(0F, 0F, 0F, 1, 0, 4);
      Shape47.setRotationPoint(-9F, 17F, -2F);
      Shape47.setTextureSize(100, 32);
      Shape47.mirror = true;
      setRotation(Shape47, 0F, 0F, 0F);
      Shape46 = new ModelRenderer(this, 0, 24);
      Shape46.addBox(0F, 0F, 0F, 1, 1, 1);
      Shape46.setRotationPoint(-8F, 17F, -3F);
      Shape46.setTextureSize(100, 32);
      Shape46.mirror = true;
      setRotation(Shape46, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape11.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
    Shape33.render(f5);
    Shape43.render(f5);
    Shape45.render(f5);
    Shape48.render(f5);
    Shape456.render(f5);
    Shape47.render(f5);
    Shape46.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity e) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

  public void renderHatch() {
	render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
	}
}
