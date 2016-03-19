package com.cfyifei.plant.blocks;

import com.cfyifei.FoodCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;


public class BlockFruit extends Block {
    private String name;
    private Item fruit;
    private IIcon Icon;
    private IIcon Icon2;

    public BlockFruit(String name, Item fruit) {
        super(Material.leaves);
        this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
        this.name = name;
        this.fruit = fruit;
        this.setCreativeTab(FoodCraft.FcTabJiqi);
    }

    public int quantityDropped(Random p_149745_1_) {
        if (this == Plant.FCleaves) {
            int i1 = p_149745_1_.nextInt(10);
            if (i1 < 7 && i1 >= 0) {
                return 0;
            } else {
                return 1;
            }
        }
        return p_149745_1_.nextInt(2) + 1;

    }

    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        if (p_149691_1_ == 0) {
            return this.Icon2;
        }
        if (p_149691_1_ == 1) {
            return this.Icon2;

        }
        return Icon;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.Icon = reg.registerIcon("foodcraft:" + name);
        this.Icon2 = reg.registerIcon("foodcraft:FCleaves");
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return fruit;
    }
}
