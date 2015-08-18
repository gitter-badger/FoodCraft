package com.cfyifei.gui.blocks;

import java.util.Random;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.gui.tileentitys.TileEntityGuo;







import com.cfyifei.gui.tileentitys.TileEntityPDG;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGuo extends BlockContainer{
	private final Random Random = new Random();
	public BlockGuo(Material Material) {
		super(Material.rock);
		this.setHardness(3.0f);
		this.setBlockBounds(0F, 0F, 0F, 1F, 0.4F, 1F);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGuo();
	}
		
	@Override
	public int getRenderType() {
		return -1;
	}
	        
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(ModGui.Guo);
	}
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World w, int x, int y, int z) {
		return Item.getItemFromBlock(ModGui.Guo);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack stack = playerIn.inventory.mainInventory[playerIn.inventory.currentItem];
		playerIn.openGui(FoodCraft.instance, GuiIDs.GUI_Guo, worldIn,pos.getX(), pos.getY(), pos.getZ());
		return true;
	}
	
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {   
		TileEntity tileentity = worldIn.getTileEntity(pos);
		if (tileentity instanceof TileEntityGuo) {
			InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityGuo)tileentity);
			worldIn.updateComparatorOutputLevel(pos, this);
		}
		super.breakBlock(worldIn, pos, state);
	}
	
	public static boolean update(World world,int x,int y,int z) {
		return world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.fire;
	}
	
	public static int getFrequencyOfUse(ItemStack item) {
		if (item.getTagCompound() == null) item.setTagCompound(new NBTTagCompound());
		return item.getTagCompound().getInteger("frequencyOfUse");
	}
	 
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		if (stack.getTagCompound() != null) {
			int xh = getFrequencyOfUse(stack);
			TileEntityGuo tep = (TileEntityGuo)worldIn.getTileEntity(pos);
			tep.frequencyOfUse = xh;
		}
	}
}