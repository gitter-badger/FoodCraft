package com.cfyifei.item;




import com.cfyifei.FoodCraft;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.plant.items.*;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;



public class ModItem{

	static public Item ItemCong,ItemZongye,ItemXifan,ItemDangeng,ItemTiepian,ItemCaidao,ItemDami,Itemfan,ItemMianfen,ItemHuashen,
	ItemDouzi,ItemHuashenyou,ItemDoujiang,ItemDianluban,ItemJianjidan,ItemLaobing,ItemMianpi,ItemJiaozixian,ItemJiaozi,ItemJianjiao,
	ItemQiaokeli,ItemQiaokelifen,ItemShucai,ItemFanqie,ItemLajiao,ItemMianfensi,ItemQiezi,ItemPutao,ItemYan,Itemwater,ItemDoufu,
	ItemJiangyou,ItemNuomi, ItemDoufugan,ItemBaifan,ItemFanqiechaojidanfan,ItemDisanxian,ItemCu,ItemYuxiangrousi,ItemGongbaojiding,
    ItemJitui,ItemTudoupian,ItemTudousi,ItemChaotudousifan,ItemChaotudoupian,ItemDuojiaoyutou,ItemDouban,ItemMapodoufufan,
	ItemDianfen,ItemHongshaoroufan,ItemHuiguoroufan,ItemMogudunjitang,ItemZongzi,ItemNuomifen,ItemTangyuan,
	ItemHuashentangyuanxian,ItemNuomituan,ItemMahua,ItemNiangao,ItemChunjuan,ItemJikuai,ItemShutiao,ItemAeljichi,ItemJimihua,
	ItemAeljichifan,ItemYuanweijikuai,ItemZhadoufu,ItemZhaniangao,ItemShupian,ItemZhamianbao,ItemZhachunjuan,ItemZhamahua,
	ItemZhajitui,ItemDajirou,ItemZhongjirou,ItemXiaojirou,ItemJichi,ItemDoufusi,ItemLuobosi,ItemHongjiu,ItemBaijiu,ItemPingguojiu,
	ItemPutaojiu,ItemJinputaojiu, ItemJinpingguojiu,ItemJinputao,ItemQiaokelishui,ItemQiaokelinai,ItemHuluobozhi,ItemPutaozhi,
	ItemPingguozhi,ItemShucaizhi,ItemJinputaozhi,ItemJinpingguozhi,ItemDounai,ItemKele,ItemXuebi,ItemXiguazhi,ItemQiaokelinaiice,
	ItemPutaozhiice,ItemPingguozhiice,ItemJinputaozhiice,ItemJinpingguozhiice,ItemXiguazhiice,ItemCha,ItemNaicha,ItemKafei,
	ItemBaiqiuji,ItemCongyouji,ItemKoushuiji,ItemLaziji,ItemQingzhenyu,ItemMalayu,ItemSuancaiyu,ItemKelejichifan,ItemGalikuai,
	ItemGalijiroufan,ItemShuizhuniurou,ItemMian,ItemGuoqiaomixian,ItemYifen,ItemYifenpork,ItemYifenbeef,ItemYifenchicken,
	ItemPidanshourouzhou,ItemYuebing,ItemMantou,ItemSuancaibing,ItemYoutiao,ItemLatiao,ItemHetaosu,ItemAici,ItemCiba,ItemChangfen,
	ItemXiangchang,ItemRegou,ItemLachang,ItemLarou,ItemZhaxiangchang,ItemRibendoufu,ItemLabazhou,ItemLaweixunliao,ItemNainao,
	ItemPisa,ItemHanbaobao,ItemJinghuashuitong,ItemSCBlock,ItemSCPlant,ItemSCMW1,ItemSCMW2,ItemSCKFC,ItemSCCn,ItemSCYz,
	ItemSCJ,ItemSCShui1,ItemSCShui2,ItemSCFan1,ItemSCFan2,ItemSCFan3,ItemSCTh,ItemAnbizhishi,ItemAnlanzhishi,ItemZongjiqianguzhishi,
ItemAnlanTools,ItemAnbiTools,ItemZongjiTools,ItemZongjiTools2,ItemZongjiTools3,ItemZongjiTools4,ItemNull,
ItemYouyurou,ItemShuyouyurou,ItemYouyusi,ItemShucaizhong,ItemLajiaozhong,ItemFanqiezhong,ItemPutaozhong,ItemQiezizhong,ItemBailuobo,
ItemQingjiao,ItemQingjiaozhong,ItemHongdou,ItemLvdou,ItemHongshu,ItemKaohongshu,ItemDoujiao,ItemWrench,ItemHuanggua,ItemHuangguazhong,
ItemYumizhong,ItemYumi,ItemBailuobosi,ItemBailuobozhi,ItemFanqiezhi,ItemYumizhi,ItemHuangguazhi,ItemDousha,ItemKaoyumi,ItemBaoyumihua,
ItemLi,ItemLizhi,ItemTaozi,ItemJuzi,ItemPipa,ItemMangguo,ItemNingmeng,ItemYouzi,ItemShizi,ItemMugua,ItemShanzha,ItemLongyan,ItemShiliu,
ItemCaomei,ItemHongzao,ItemYezi,ItemYingtao,ItemXiangjiao,ItemJinkela,ItemLizizhi,ItemLizhizhi,ItemTaozizhi,ItemJuzizhi,ItemPipazhi,
ItemMangguozhi,ItemNingmengzhi,ItemYouzizhi,ItemShizizhi,ItemMuguazhi,ItemShanzhazhi,ItemShiliuzhi,ItemHongzaozhi,ItemCaomeizhi,
ItemYezizhi,ItemYingtaozhi,ItemXiangjiaozhi,ItemYenai,ItemLizhizhiice,ItemTaozizhiice,ItemJuzizhiice,ItemMangguozhiice,
ItemNingmengzhiice,ItemMuguazhiice,ItemCaomeizhiice,ItemYezizhiice,ItemXiangjiaozhiice,ItemLizijiu,ItemLizhijiu,
ItemTaozijiu,ItemMangguojiu,ItemNingmengjiu,ItemShiliujiu,ItemGuojiang,ItemBinggan,ItemDangao,
ItemCaidaoHJ,ItemCaidaoZS,ItemCaidaoLBS,ItemBingganF,ItemBingganXN,ItemTest;
	
	public static void registermodel(Item myitem, String name){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(myitem, 0,
			    new ModelResourceLocation("foodcraft:" + name, "inventory"));
			ModelBakery.addVariantName(myitem, "foodcraft:" + name);
	}
	
	public static void registermodelBlock(Block myitem, String name){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(myitem), 0,
			    new ModelResourceLocation("foodcraft:" + name, "inventory"));
			ModelBakery.addVariantName(Item.getItemFromBlock(myitem), "foodcraft:" + name);
	}
	
	public static void init() {
		//做菜工具	
				ItemTiepian = new ItemKb();
				ItemTiepian.setUnlocalizedName("ItemTiepian");
				ItemTiepian.setCreativeTab(FoodCraft.FcTabJiqi);
				

				Itemwater = new ItemKb();
				Itemwater.setUnlocalizedName("Itemwater");
				Itemwater.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemCaidao = new Item();
				ItemCaidao.setUnlocalizedName("ItemCaidao");
				ItemCaidao.setCreativeTab(FoodCraft.FcTabJiqi);
				ItemCaidao.setMaxDamage(59);
				ItemCaidao.setMaxStackSize(1);
				
				ItemCaidaoHJ = new ItemCaidaoHJ();
				ItemCaidaoHJ.setUnlocalizedName("ItemCaidaoHJ");
				ItemCaidaoHJ.setCreativeTab(FoodCraft.FcTabJiqi);
				
				ItemCaidaoZS = new ItemCaidaoZS();
				ItemCaidaoZS.setUnlocalizedName("ItemCaidaoZS");
				ItemCaidaoZS.setCreativeTab(FoodCraft.FcTabJiqi);
				
				ItemCaidaoLBS = new ItemCaidaoLBS();
				ItemCaidaoLBS.setUnlocalizedName("ItemCaidaoLBS");
				ItemCaidaoLBS.setCreativeTab(FoodCraft.FcTabJiqi);
				
				ItemJinghuashuitong = new ItemJinghuashuitong(EnumHelper.addToolMaterial("JHST", 0, 16, 2.0F, 0.0F, 15));
				ItemJinghuashuitong.setMaxStackSize(1);
				ItemJinghuashuitong.setUnlocalizedName("ItemJinghuashuitong");
				ItemJinghuashuitong.setCreativeTab(FoodCraft.FcTabJiqi);
			//饭	
				ItemDami = new ItemShuidao();
				MinecraftForge.addGrassSeed(new ItemStack(ItemDami), 2);
				ItemDami.setUnlocalizedName("ItemDami");
				ItemDami.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemHuashen = new ItemHuashen();
				ItemHuashen.setUnlocalizedName("ItemHuashen");
				MinecraftForge.addGrassSeed(new ItemStack(ItemHuashen), 2);
				ItemHuashen.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemShucaizhong = new ItemShucai();
				ItemShucaizhong.setUnlocalizedName("ItemShucaizhong");
				MinecraftForge.addGrassSeed(new ItemStack(ItemShucaizhong), 1);
				ItemShucaizhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemDouzi = new ItemDouzi();
				MinecraftForge.addGrassSeed(new ItemStack(ItemDouzi), 2);
				ItemDouzi.setUnlocalizedName("ItemDouzi");
				ItemDouzi.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemNull = new ItemKb();
				ItemNull.setUnlocalizedName("ItemNull");
				
				Itemfan = new ItemKb();
				Itemfan.setUnlocalizedName("Itemfan");
				Itemfan.setCreativeTab(FoodCraft.FcTabShicai);

				//面粉
				ItemMianfen = new ItemKb();
				ItemMianfen.setUnlocalizedName("ItemMianfen");
				ItemMianfen.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemHuashenyou = new ItemKb();
				ItemHuashenyou.setUnlocalizedName("ItemHuashenyou");
				ItemHuashenyou.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemDoujiang = new ITemFood(2, 4F, false, "ItemDoujiang");
				ItemDoujiang.setUnlocalizedName("ItemDoujiang");
				ItemDoujiang.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemDianluban = new ItemKb();
				ItemDianluban.setUnlocalizedName("ItemDianluban");
				ItemDianluban.setCreativeTab(FoodCraft.FcTabJiqi);
				
				ItemJianjidan = new ITemFood(3, 5F, false, "ItemJianjidan");
				ItemJianjidan.setUnlocalizedName("ItemJianjidan");
				ItemJianjidan.setCreativeTab(FoodCraft.FcTabXiaodian);
				
				ItemLaobing = new ITemFood(3, 5F, false, "ItemLaobing");
				ItemLaobing.setUnlocalizedName("ItemLaobing");
				ItemLaobing.setCreativeTab(FoodCraft.FcTabXiaodian);
				
				ItemMianpi = new ItemKb();
				ItemMianpi.setUnlocalizedName("ItemMianpi");
				ItemMianpi.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemJiaozixian = new ItemKb();
				ItemJiaozixian.setUnlocalizedName("ItemJiaozixian");
				ItemJiaozixian.setCreativeTab(FoodCraft.FcTabShicai);		
				
				ItemJiaozi = new ITemFood(3, 8F, false, "ItemJiaozi");
				ItemJiaozi.setUnlocalizedName("ItemJiaozi");
				ItemJiaozi.setCreativeTab(FoodCraft.FcTabXiaodian);
				
				ItemJianjiao = new ITemFood(3, 10F, false, "ItemJianJiao");
				ItemJianjiao.setUnlocalizedName("ItemJianJiao");
				ItemJianjiao.setCreativeTab(FoodCraft.FcTabXiaodian);
				
				ItemQiaokelifen = new ItemKb();
				ItemQiaokelifen.setUnlocalizedName("ItemQiaokelifen");
				ItemQiaokelifen.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemQiaokeli = new ITemFood(3, 4F, false, "ItemQiaokeli");
				ItemQiaokeli.setUnlocalizedName("ItemQiaokeli");
				ItemQiaokeli.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemLajiaozhong = new ItemLajiao();
				MinecraftForge.addGrassSeed(new ItemStack(ItemLajiaozhong), 2);
				ItemLajiaozhong.setUnlocalizedName("ItemLajiaozhong");
				ItemLajiaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemFanqiezhong = new ItemFanqie();
				MinecraftForge.addGrassSeed(new ItemStack(ItemFanqiezhong), 2);
				ItemFanqiezhong.setUnlocalizedName("ItemFanqiezhong");
				ItemFanqiezhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemPutaozhong = new ItemPutao();
				MinecraftForge.addGrassSeed(new ItemStack(ItemPutaozhong), 2);
				ItemPutaozhong.setUnlocalizedName("ItemPutaozhong");
				ItemPutaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemQiezizhong = new ItemQiezi();
				MinecraftForge.addGrassSeed(new ItemStack(ItemQiezizhong), 2);
				ItemQiezizhong.setUnlocalizedName("ItemQiezizhong");
				ItemQiezizhong.setCreativeTab(FoodCraft.FcTabZhiwu);

				ItemYan = new ItemKb();
				ItemYan.setUnlocalizedName("ItemYan");
				ItemYan.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemDoufu = new ITemFood(3, 4F, false, "ItemDoufu");
				ItemDoufu.setUnlocalizedName("ItemDoufu");
				ItemDoufu.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemJiangyou = new ItemKb();
				ItemJiangyou.setUnlocalizedName("ItemJiangyou");
				ItemJiangyou.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemNuomi = new ItemNuodao();
				MinecraftForge.addGrassSeed(new ItemStack(ItemNuomi), 2);
				ItemNuomi.setUnlocalizedName("ItemNuomi");
				ItemNuomi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemDoufugan = new ITemFood(3, 6F, false, "ItemDoufugan");
				ItemDoufugan.setUnlocalizedName("ItemDoufugan");
				ItemDoufugan.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemBaifan = new ITemFood(3, 3F, false, "ItemBaifan");
				ItemBaifan.setUnlocalizedName("ItemBaifan");
				ItemBaifan.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemFanqiechaojidanfan = new ItemZhushi(3, 18F, false, "ItemFanqiechaojidanfan");
				ItemFanqiechaojidanfan.setUnlocalizedName("ItemFanqiechaojidanfan");
				ItemFanqiechaojidanfan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemDisanxian = new ItemZhushi(3, 18F, false, "ItemDisanxian");
				ItemDisanxian.setUnlocalizedName("ItemDisanxian");
				ItemDisanxian.setCreativeTab(FoodCraft.FcTabZhushi);	
			
				ItemYuxiangrousi = new ItemZhushi(3, 18F, false, "ItemYuxiangrousi");
				ItemYuxiangrousi.setUnlocalizedName("ItemYuxiangrousi");
				ItemYuxiangrousi.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemCu = new ItemKb();
				ItemCu.setUnlocalizedName("ItemCu");
				ItemCu.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemGongbaojiding = new ItemZhushi(3, 18F, false, "ItemGongbaojiding");
				ItemGongbaojiding.setUnlocalizedName("ItemGongbaojiding");
				ItemGongbaojiding.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemJitui = new ITemFood(3, 3F, false, "ItemJitui");
				ItemJitui.setUnlocalizedName("ItemJitui");
				ItemJitui.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemTudoupian = new ItemKb();
				ItemTudoupian.setUnlocalizedName("ItemTudoupian");
				ItemTudoupian.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemTudousi = new ItemKb();
				ItemTudousi.setUnlocalizedName("ItemTudousi");
				ItemTudousi.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemChaotudousifan = new ItemZhushi(3, 18F, false, "ItemChaotudousifan");
				ItemChaotudousifan.setUnlocalizedName("ItemChaotudousifan");
				ItemChaotudousifan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemChaotudoupian = new ITemFood(3, 7F, false, "ItemChaotudoupian");
				ItemChaotudoupian.setUnlocalizedName("ItemChaotudoupian");
				ItemChaotudoupian.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemDuojiaoyutou = new ItemZhushi(3, 18F, false, "ItemDuojiaoyutou");
				ItemDuojiaoyutou.setUnlocalizedName("ItemDuojiaoyutou");
				ItemDuojiaoyutou.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemDouban = new ItemKb();
				ItemDouban.setUnlocalizedName("ItemDouban");
				ItemDouban.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemMapodoufufan = new ItemZhushi(3, 18F, false, "ItemMapodoufufan");
				ItemMapodoufufan.setUnlocalizedName("ItemMapodoufufan");
				ItemMapodoufufan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemDianfen = new ItemKb();
				ItemDianfen.setUnlocalizedName("ItemDianfen");
				ItemDianfen.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemHongshaoroufan = new ItemZhushi(3, 18F, false, "ItemHongshaoroufan");
				ItemHongshaoroufan.setUnlocalizedName("ItemHongshaoroufan");
				ItemHongshaoroufan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemHuiguoroufan = new ItemZhushi(3, 18F, false, "ItemHuiguoroufan");
				ItemHuiguoroufan.setUnlocalizedName("ItemHuiguoroufan");
				ItemHuiguoroufan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemXifan = new ITemFood(3, 7F, false, "ItemXifan");
				ItemXifan.setUnlocalizedName("ItemXifan");
				ItemXifan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemDangeng = new ITemFood(3, 8F, false, "ItemDangeng");
				ItemDangeng.setUnlocalizedName("ItemDangeng");
				ItemDangeng.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemMogudunjitang = new ITemFood(3, 8F, false, "ItemMogudunjitang");
				ItemMogudunjitang.setUnlocalizedName("ItemMogudunjitang");
				ItemMogudunjitang.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemZongzi = new ITemFood(3, 8F, false, "ItemZongzi");
				ItemZongzi.setUnlocalizedName("ItemZongzi");
				ItemZongzi.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZongye = new ItemKb();
				ItemZongye.setUnlocalizedName("ItemZongye");
				ItemZongye.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemCong = new ItemReed(ModBlocks.BlockCong);
				ItemCong.setUnlocalizedName("ItemCong");
				MinecraftForge.addGrassSeed(new ItemStack(ItemCong), 2);
				ItemCong.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemNuomifen = new ItemKb();
				ItemNuomifen.setUnlocalizedName("ItemNuomifen");
				ItemNuomifen.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemNuomituan = new ItemKb();
				ItemNuomituan.setUnlocalizedName("ItemNuomituan");
				ItemNuomituan.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemHuashentangyuanxian = new ItemKb();
				ItemHuashentangyuanxian.setUnlocalizedName("ItemHuashentangyuanxian");
				ItemHuashentangyuanxian.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemTangyuan = new ITemFood(3, 8F, false, "ItemTangyuan");
				ItemTangyuan.setUnlocalizedName("ItemTangyuan");
				ItemTangyuan.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemJikuai = new ITemFood(3, 6F, false, "ItemJikuai");
				ItemJikuai.setUnlocalizedName("ItemJikuai");
				ItemJikuai.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemShutiao = new ITemFood(3, 7F, false, "ItemShutiao");
				ItemShutiao.setUnlocalizedName("ItemShutiao");
				ItemShutiao.setCreativeTab(FoodCraft.FcTabXiaodian);	
				 
				ItemAeljichi = new ITemFood(3, 8F, false, "ItemAeljichi");
				ItemAeljichi.setUnlocalizedName("ItemAeljichi");
				ItemAeljichi.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemJimihua = new ITemFood(3, 4F, false, "ItemJimihua");
				ItemJimihua.setUnlocalizedName("ItemJimihua");
				ItemJimihua.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemYuanweijikuai = new ITemFood(3, 8F, false, "ItemYuanweijikuai");
				ItemYuanweijikuai.setUnlocalizedName("ItemYuanweijikuai");
				ItemYuanweijikuai.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemAeljichifan = new ItemZhushi(3, 20F, false, "ItemAeljichifan");
				ItemAeljichifan.setUnlocalizedName("ItemAeljichifan");
				ItemAeljichifan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemMahua = new ITemFood(3, 7F, false, "ItemMahua");
				ItemMahua.setUnlocalizedName("ItemMahua");
				ItemMahua.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemNiangao = new ITemFood(3, 8F, false, "ItemNiangao");
				ItemNiangao.setUnlocalizedName("ItemNiangao");
				ItemNiangao.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemChunjuan = new ITemFood(3, 8F, false, "ItemChunjuan");
				ItemChunjuan.setUnlocalizedName("ItemChunjuan");
				 
				ItemChunjuan.setCreativeTab(FoodCraft.FcTabXiaodian);	

				ItemZhadoufu = new ITemFood(3, 6F, false, "ItemZhadoufu");
				ItemZhadoufu.setUnlocalizedName("ItemZhadoufu");
				 
				ItemZhadoufu.setCreativeTab(FoodCraft.FcTabXiaodian);	

				ItemZhaniangao = new ITemFood(3, 10F, false, "ItemZhaniangao");
				ItemZhaniangao.setUnlocalizedName("ItemZhaniangao");
				 
				ItemZhaniangao.setCreativeTab(FoodCraft.FcTabXiaodian);	

				ItemShupian = new ITemFood(3, 7F, false, "ItemShupian");
				ItemShupian.setUnlocalizedName("ItemShupian");
				 
				ItemShupian.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZhamianbao = new ITemFood(3, 7F, false, "ItemZhamianbao");
				ItemZhamianbao.setUnlocalizedName("ItemZhamianbao");
				 
				ItemZhamianbao.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZhachunjuan = new ITemFood(3, 10F, false, "ItemZhachunjuan");
				ItemZhachunjuan.setUnlocalizedName("ItemZhachunjuan");
				 
				ItemZhachunjuan.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZhamahua = new ITemFood(3, 10F, false, "ItemZhamahua");
				ItemZhamahua.setUnlocalizedName("ItemZhamahua");
				 
				ItemZhamahua.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZhajitui = new ITemFood(3, 5F, false, "ItemZhajitui");
				ItemZhajitui.setUnlocalizedName("ItemZhajitui");
				 
				ItemZhajitui.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemDajirou = new ItemKb();
				ItemDajirou.setUnlocalizedName("ItemDajirou");
				 
				ItemDajirou.setCreativeTab(FoodCraft.FcTabShicai);	

				ItemZhongjirou = new ItemKb();
				ItemZhongjirou.setUnlocalizedName("ItemZhongjirou");
				 
				ItemZhongjirou.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemXiaojirou = new ItemKb();
				ItemXiaojirou.setUnlocalizedName("ItemXiaojirou");
				 
				ItemXiaojirou.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemJichi = new ITemFood(3, 4F, false, "ItemJichi");
				ItemJichi.setUnlocalizedName("ItemJichi");
				 
				ItemJichi.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemDoufusi = new ItemKb();
				ItemDoufusi.setUnlocalizedName("ItemDoufusi");
				 
				ItemDoufusi.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemLuobosi = new ItemKb();
				ItemLuobosi.setUnlocalizedName("ItemLuobosi");
				 
				ItemLuobosi.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemHongjiu = new ItemFoodJiu(3, 8F, false, "ItemHongjiu").setAlwaysEdible();
				ItemHongjiu.setUnlocalizedName("ItemHongjiu");
				 
				ItemHongjiu.setCreativeTab(FoodCraft.FcTabYingliao);	

				ItemBaijiu = new ItemFoodJiu(3, 8F, false, "ItemBaijiu").setAlwaysEdible();
				ItemBaijiu.setUnlocalizedName("ItemBaijiu");
				 
				ItemBaijiu.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPingguojiu = new ItemFoodJiu(3, 8F, false, "ItemPingguojiu").setAlwaysEdible();
				ItemPingguojiu.setUnlocalizedName("ItemPingguojiu");
				 
				ItemPingguojiu.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPutaojiu = new ItemFoodJiu(3, 8F, false, "ItemPutaojiu").setAlwaysEdible();
				ItemPutaojiu.setUnlocalizedName("ItemPutaojiu");
				 
				ItemPutaojiu.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinputao = new ITemFood(3, 20F, false, "ItemJinputao" ,true);
				ItemJinputao.setUnlocalizedName("ItemJinputao");
				 
				ItemJinputao.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemJinputaojiu = new ItemFoodJinputaojiu(3, 20F, false, "ItemJinputaojiu").setAlwaysEdible();
				ItemJinputaojiu.setUnlocalizedName("ItemJinputaojiu");
				 
				ItemJinputaojiu.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinpingguojiu = new ItemFoodJinpingguojiu(3, 20F, false, "ItemJinpingguojiu").setAlwaysEdible();
				ItemJinpingguojiu.setUnlocalizedName("ItemJinpingguojiu");
				 
				ItemJinpingguojiu.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemQiaokelishui = new ItemYingliao(3, 7F, false, "ItemQiaokelishui",0x956844);
				ItemQiaokelishui.setUnlocalizedName("ItemQiaokelishui");
				 
				ItemQiaokelishui.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemQiaokelinai = new ItemYingliao(3, 7F, false, "ItemQiaokelinai",0xae927c);
				ItemQiaokelinai.setUnlocalizedName("ItemQiaokelinai");
				 
				ItemQiaokelinai.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemHuluobozhi = new ItemYingliao(3, 7F, false, "ItemHuluobozhi",0xf4872f);
				ItemHuluobozhi.setUnlocalizedName("ItemHuluobozhi");
				 
				ItemHuluobozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPutaozhi = new ItemYingliao(3, 7F, false, "ItemPutaozhi",0xbc18b6);
				ItemPutaozhi.setUnlocalizedName("ItemPutaozhi");
				 
				ItemPutaozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPingguozhi = new ItemYingliao(3, 7F, false, "ItemPingguozhi",0xfa2059);
				ItemPingguozhi.setUnlocalizedName("ItemPingguozhi");
				 
				ItemPingguozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemShucaizhi = new ItemYingliao(3, 7F, false, "ItemShucaizhi",0x6abc19);
				ItemShucaizhi.setUnlocalizedName("ItemShucaizhi");
				 
				ItemShucaizhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinputaozhi = new ItemYingliao(3, 20F, false, "ItemJinputaozhi",true , 0, 0xe0da42);
				ItemJinputaozhi.setUnlocalizedName("ItemJinputaozhi");
				 
				ItemJinputaozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinpingguozhi = new ItemYingliao(3, 20F, false, "ItemJinpingguozhi",true , 1, 0xe7e480);
				ItemJinpingguozhi.setUnlocalizedName("ItemJinpingguozhi");
				 
				ItemJinpingguozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
			
				ItemDounai = new ItemYingliao(3, 7F, false, "ItemDounai",0xfafaf2);
				ItemDounai.setUnlocalizedName("ItemDounai");
				 
				ItemDounai.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemKele = new ItemYingliao(3, 7F, false, "ItemKele",0x512008);
				ItemKele.setUnlocalizedName("ItemKele");
				 
				ItemKele.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemXuebi = new ItemYingliao(3, 7F, false, "ItemXuebi",0xededed);
				ItemXuebi.setUnlocalizedName("ItemXuebi");
				 
				ItemXuebi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemQiaokelinaiice = new ItemMilk(3, 9F, false, "ItemQiaokelinaiice").setAlwaysEdible();
				ItemQiaokelinaiice.setUnlocalizedName("ItemQiaokelinaiice");
				 
				ItemQiaokelinaiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPutaozhiice = new ItemYingliao(3, 9F, false, "ItemPutaozhiice",0);
				ItemPutaozhiice.setUnlocalizedName("ItemPutaozhiice");
				 
				ItemPutaozhiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemPingguozhiice = new ItemYingliao(3, 9F, false, "ItemPingguozhiice",0);
				ItemPingguozhiice.setUnlocalizedName("ItemPingguozhiice");
				 
				ItemPingguozhiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinputaozhiice = new ItemYingliao(3, 9F, false, "ItemJinputaozhiice" , true , 0,0);
				ItemJinputaozhiice.setUnlocalizedName("ItemJinputaozhiice");
				 
				ItemJinputaozhiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemJinpingguozhiice = new ItemYingliao(3, 9F, false, "ItemJinpingguozhiice" , true , 1,0);
				ItemJinpingguozhiice.setUnlocalizedName("ItemJinpingguozhiice");
				 
				ItemJinpingguozhiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemXiguazhi = new ItemYingliao(3, 7F, false, "ItemXiguazhi",0xe848b9);
				ItemXiguazhi.setUnlocalizedName("ItemXiguazhi");
				 
				ItemXiguazhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemXiguazhiice = new ItemYingliao(3, 9F, false, "ItemXiguazhiice",0);
				ItemXiguazhiice.setUnlocalizedName("ItemXiguazhiice");
				 
				ItemXiguazhiice.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemMianfensi = new ItemKb();
				ItemMianfensi.setUnlocalizedName("ItemMianfensi");
				 
				ItemMianfensi.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemCha = new ItemYingliao(3, 6F, false, "ItemCha",0x98a285);
				ItemCha.setUnlocalizedName("ItemCha");
				 
				ItemCha.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemNaicha = new ItemYingliao(3, 7F, false, "ItemXiguazhi",0xc29833);
				ItemNaicha.setUnlocalizedName("ItemNaicha");
				 
				ItemNaicha.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemKafei = new ItemYingliao(3, 7F, false, "ItemKafei",0x50462d);
				ItemKafei.setUnlocalizedName("ItemKafei");
				 
				ItemKafei.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemBaiqiuji = new ItemZhushi(3, 18F, false, "ItemBaiqiuji");
				ItemBaiqiuji.setUnlocalizedName("ItemBaiqiuji");
				 
				ItemBaiqiuji.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemCongyouji = new ItemZhushi(3, 18F, false, "ItemCongyouji");
				ItemCongyouji.setUnlocalizedName("ItemCongyouji");
				 
				ItemCongyouji.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemKoushuiji = new ItemZhushi(3, 18F, false, "ItemKoushuiji");
				ItemKoushuiji.setUnlocalizedName("ItemKoushuiji");
				 
				ItemKoushuiji.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemLaziji = new ItemZhushi(3, 18F, false, "ItemLaziji");
				ItemLaziji.setUnlocalizedName("ItemLaziji");
				 
				ItemLaziji.setCreativeTab(FoodCraft.FcTabZhushi);	

				ItemQingzhenyu = new ItemZhushi(3, 18F, false, "ItemQingzhenyu");
				ItemQingzhenyu.setUnlocalizedName("ItemQingzhenyu");
				 
				ItemQingzhenyu.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemMalayu = new ItemZhushi(3, 18F, false, "ItemMalayu");
				ItemMalayu.setUnlocalizedName("ItemMalayu");
				 
				ItemMalayu.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemSuancaiyu = new ItemZhushi(3, 18F, false, "ItemSuancaiyu");
				ItemSuancaiyu.setUnlocalizedName("ItemSuancaiyu");
				 
				ItemSuancaiyu.setCreativeTab(FoodCraft.FcTabZhushi);	

				ItemKelejichifan = new ItemZhushi(3, 20F, false, "ItemKelejichifan");
				ItemKelejichifan.setUnlocalizedName("ItemKelejichifan");
				 
				ItemKelejichifan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemGalijiroufan = new ItemZhushi(3, 18F, false, "ItemGalijiroufan");
				ItemGalijiroufan.setUnlocalizedName("ItemGalijiroufan");
				 
				ItemGalijiroufan.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemGalikuai = new ITemFood(3, 3F, false, "ItemGalikuai");
				ItemGalikuai.setUnlocalizedName("ItemGalikuai");
				 
				ItemGalikuai.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemShuizhuniurou = new ItemZhushi(3, 18F, false, "ItemShuizhuniurou");
				ItemShuizhuniurou.setUnlocalizedName("ItemShuizhuniurou");
				 
				ItemShuizhuniurou.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemMian = new ITemFood(3, 7F, false, "ItemMian");
				ItemMian.setUnlocalizedName("ItemMian");
				 
				ItemMian.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemGuoqiaomixian = new ITemFood(3, 7F, false, "ItemGuoqiaomixian");
				ItemGuoqiaomixian.setUnlocalizedName("ItemGuoqiaomixian");
				 
				ItemGuoqiaomixian.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemYifen = new ITemFood(3, 7F, false, "ItemYifen");
				ItemYifen.setUnlocalizedName("ItemYifen");
				 
				ItemYifen.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemYifenpork = new ItemZhushi(3, 18F, false, "ItemYifenpork");
				ItemYifenpork.setUnlocalizedName("ItemYifenpork");
				 
				ItemYifenpork.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemYifenbeef = new ItemZhushi(3, 18F, false, "ItemYifenbeef");
				ItemYifenbeef.setUnlocalizedName("ItemYifenbeef");
				 
				ItemYifenbeef.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemYifenchicken = new ItemZhushi(3, 18F, false, "ItemYifenchicken");
				ItemYifenchicken.setUnlocalizedName("ItemYifenchicken");
				 
				ItemYifenchicken.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemPidanshourouzhou = new ITemFood(3, 7F, false, "ItemPidanshourouzhou");
				ItemPidanshourouzhou.setUnlocalizedName("ItemPidanshourouzhou");
				 
				ItemPidanshourouzhou.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemYuebing = new ITemFood(3, 8F, false, "ItemYuebing");
				ItemYuebing.setUnlocalizedName("ItemYuebing");
				 
				ItemYuebing.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemMantou = new ITemFood(3, 4F, false, "ItemMantou");
				ItemMantou.setUnlocalizedName("ItemMantou");
				 
				ItemMantou.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemSuancaibing = new ITemFood(3, 7F, false, "ItemSuancaibing");
				ItemSuancaibing.setUnlocalizedName("ItemSuancaibing");
				 
				ItemSuancaibing.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemYoutiao = new ITemFood(3, 8F, false, "ItemYoutiao");
				ItemYoutiao.setUnlocalizedName("ItemYoutiao");
				 
				ItemYoutiao.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemLatiao = new ITemFood(3, 4F, false, "ItemLatiao");
				ItemLatiao.setUnlocalizedName("ItemLatiao");
				 
				ItemLatiao.setCreativeTab(FoodCraft.FcTabXiaodian);	

				ItemHetaosu = new ITemFood(3, 8F, false, "ItemHetaosu");
				ItemHetaosu.setUnlocalizedName("ItemHetaosu");
				 
				ItemHetaosu.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemAici = new ITemFood(3, 8F, false, "ItemAici");
				ItemAici.setUnlocalizedName("ItemAici");
				 
				ItemAici.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemCiba = new ITemFood(3, 7F, false, "ItemCiba");
				ItemCiba.setUnlocalizedName("ItemCiba");
				 
				ItemCiba.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemChangfen = new ITemFood(3, 7F, false, "ItemChangfen");
				ItemChangfen.setUnlocalizedName("ItemChangfen");
				 
				ItemChangfen.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemXiangchang = new ITemFood(3, 6F, false, "ItemXiangchang");
				ItemXiangchang.setUnlocalizedName("ItemXiangchang");
				 
				ItemXiangchang.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemRegou = new ITemFood(3, 8F, false, "ItemRegou");
				ItemRegou.setUnlocalizedName("ItemRegou");
				 
				ItemRegou.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemLachang = new ITemFood(3, 8F, false, "ItemLachang");
				ItemLachang.setUnlocalizedName("ItemLachang");
				 
				ItemLachang.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemLarou = new ITemFood(3, 9F, false, "ItemLarou");
				ItemLarou.setUnlocalizedName("ItemLarou");
				 
				ItemLarou.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemZhaxiangchang = new ITemFood(3, 8F, false, "ItemZhaxiangchang");
				ItemZhaxiangchang.setUnlocalizedName("ItemZhaxiangchang");
				 
				ItemZhaxiangchang.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemRibendoufu = new ItemZhushi(3, 18F, false, "ItemRibendoufu");
				ItemRibendoufu.setUnlocalizedName("ItemRibendoufu");
				 
				ItemRibendoufu.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemLabazhou = new ITemFood(3, 9F, false, "ItemLabazhou");
				ItemLabazhou.setUnlocalizedName("ItemLabazhou");
				 
				ItemLabazhou.setCreativeTab(FoodCraft.FcTabZhushi);	
				
				ItemLaweixunliao = new ItemKb();
				ItemLaweixunliao.setUnlocalizedName("ItemLaweixunliao");
				 
				ItemLaweixunliao.setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemNainao = new ITemFood(3, 5F, false, "ItemNainao");
				ItemNainao.setUnlocalizedName("ItemNainao");
				 
				ItemNainao.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemPisa = new ITemFood(3, 12F, false, "ItemPisa");
				ItemPisa.setUnlocalizedName("ItemPisa");
				 
				ItemPisa.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemHanbaobao = new ITemFood(3, 12F, false, "ItemHanbaobao");
				ItemHanbaobao.setUnlocalizedName("ItemHanbaobao");
				 
				ItemHanbaobao.setCreativeTab(FoodCraft.FcTabXiaodian);	


				ItemYouyurou = new ITemFood(3, 8F, false, "ItemYouyurou");
				ItemYouyurou.setUnlocalizedName("ItemYouyurou");
				 
				ItemYouyurou.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemShuyouyurou = new ITemFood(3, 10F, false, "ItemShuyouyurou");
				ItemShuyouyurou.setUnlocalizedName("ItemShuyouyurou");
				 
				ItemShuyouyurou.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemYouyusi = new ITemFood(3, 3F, false, "ItemYouyusi");
				ItemYouyusi.setUnlocalizedName("ItemYouyusi");
				 
				ItemYouyusi.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemShucai = new ITemFood(3, 3F, false, "ItemShucai");
				ItemShucai.setUnlocalizedName("ItemShucai");
				 
				ItemShucai.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemLajiao = new ItemChili();
				ItemLajiao.setUnlocalizedName("ItemLajiao");
				 
				ItemLajiao.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemFanqie = new ITemFood(3, 3F, false, "ItemFanqie");
				ItemFanqie.setUnlocalizedName("ItemFanqie");
				 
				ItemFanqie.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemPutao = new ITemFood(3, 3F, false, "ItemPutao");
				ItemPutao.setUnlocalizedName("ItemPutao");
				 
				ItemPutao.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemQiezi = new ITemFood(3, 3F, false, "ItemQiezi");
				ItemQiezi.setUnlocalizedName("ItemQiezi");
				 
				ItemQiezi.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemQingjiao = new ITemFood(3, 3F, false, "ItemQingjiao");
				ItemQingjiao.setUnlocalizedName("ItemQingjiao");
				 
				ItemQingjiao.setCreativeTab(FoodCraft.FcTabZhiwu);
				/*ItemHongdou,ItemLvdou,ItemHongshu;*/
				
				ItemBailuobo = new ItemHongshu(ModBlocks.BlockBailuobo,3);
				MinecraftForge.addGrassSeed(new ItemStack(ItemBailuobo), 2);
				ItemBailuobo.setUnlocalizedName("ItemBailuobo");
				 
				ItemBailuobo.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemQingjiaozhong = new ItemPlant(null,ModBlocks.BlockQingjiao);
				MinecraftForge.addGrassSeed(new ItemStack(ItemQingjiaozhong), 2);
				ItemQingjiaozhong.setUnlocalizedName("ItemQingjiaozhong");
				 
				ItemQingjiaozhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemHongdou = new ItemPlant(null,ModBlocks.BlockHongdou);
				MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
				ItemHongdou.setUnlocalizedName("ItemHongdou");
				 
				ItemHongdou.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemLvdou = new ItemPlant(null,ModBlocks.BlockLvdou);
				MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
				ItemLvdou.setUnlocalizedName("ItemLvdou");
				 
				ItemLvdou.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemHongshu = new ItemHongshu(ModBlocks.BlockHongshu,3);
				MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
				ItemHongshu.setUnlocalizedName("ItemHongshu");
				 
				ItemHongshu.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemKaohongshu = new ITemFood(3, 8F, false, "ItemKaohongshu");
				ItemKaohongshu.setUnlocalizedName("ItemKaohongshu");
				 
				ItemKaohongshu.setCreativeTab(FoodCraft.FcTabXiaodian);
				
				ItemDoujiao = new ITemFood(3, 3F, false, "ItemDoujiao");
				ItemDoujiao.setUnlocalizedName("ItemDoujiao");
				 
				ItemDoujiao.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemWrench = new ItemWrench("ItemWrench");
				ItemWrench.setUnlocalizedName("ItemWrench");
				 
				ItemWrench.setCreativeTab(FoodCraft.FcTabJiqi);
				ItemWrench.setMaxStackSize(1);
				
				ItemYumi = new ITemFood(3, 3F, false, "ItemYumi");
				ItemYumi.setUnlocalizedName("ItemYumi");
				 
				ItemYumi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemHuanggua = new ITemFood(3, 3F, false, "ItemHuanggua");
				ItemHuanggua.setUnlocalizedName("ItemHuanggua");
				 
				ItemHuanggua.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemYumizhong = new ItemPlant(null,ModBlocks.BlockYumi);
				MinecraftForge.addGrassSeed(new ItemStack(ItemYumizhong), 2);
				ItemYumizhong.setUnlocalizedName("ItemYumizhong");
				 
				ItemYumizhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemHuangguazhong = new ItemPlant(null,ModBlocks.BlockHuanggua);
				MinecraftForge.addGrassSeed(new ItemStack(ItemHongdou), 2);
				ItemHuangguazhong.setUnlocalizedName("ItemHuangguazhong");
				 
				ItemHuangguazhong.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemBailuobosi = new ItemKb();
				ItemBailuobosi.setUnlocalizedName("ItemBailuobosi");
				 
				ItemBailuobosi.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemBailuobozhi = new ItemYingliao(3, 8F, false, "ItemBailuobozhi",0xfffbf3);
				ItemBailuobozhi.setUnlocalizedName("ItemBailuobozhi");
				 
				ItemBailuobozhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemFanqiezhi = new ItemYingliao(3, 8F, false, "ItemFanqiezhi",0xe1304d);
				ItemFanqiezhi.setUnlocalizedName("ItemFanqiezhi");
				 
				ItemFanqiezhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemHuangguazhi = new ItemYingliao(3, 8F, false, "ItemHuangguazhi",0xb1c28b);
				ItemHuangguazhi.setUnlocalizedName("ItemHuangguazhi");
				 
				ItemHuangguazhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemYumizhi = new ItemYingliao(3, 8F, false, "ItemYumizhi",0xebe47a);
				ItemYumizhi.setUnlocalizedName("ItemYumizhi");
				 
				ItemYumizhi.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemDousha = new ItemKb();
				ItemDousha.setUnlocalizedName("ItemDousha");
				 
				ItemDousha.setCreativeTab(FoodCraft.FcTabShicai);
				
				ItemKaoyumi = new ITemFood(3, 6F, false, "ItemKaoyumi");
				ItemKaoyumi.setUnlocalizedName("ItemKaoyumi");
				 
				ItemKaoyumi.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemBaoyumihua = new ITemFood(3, 6F, false, "ItemBaoyumihua");
				ItemBaoyumihua.setUnlocalizedName("ItemBaoyumihua");
				 
				ItemBaoyumihua.setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemLi = new ITemFood(3, 2F, false, "ItemLi");
				ItemLi.setUnlocalizedName("ItemLi");
				 
				ItemLi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemLizhi = new ITemFood(3, 2F, false, "ItemLizhi");
				ItemLizhi.setUnlocalizedName("ItemLizhi");
				 
				ItemLizhi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemTaozi = new ITemFood(3, 2F, false, "ItemTaozi");
				ItemTaozi.setUnlocalizedName("ItemTaozi");
				 
				ItemTaozi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemJuzi = new ITemFood(3, 2F, false, "ItemJuzi");
				ItemJuzi.setUnlocalizedName("ItemJuzi");
				 
				ItemJuzi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemPipa = new ITemFood(3, 2F, false, "ItemPipa");
				ItemPipa.setUnlocalizedName("ItemPipa");
				 
				ItemPipa.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemMangguo = new ITemFood(3, 2F, false, "ItemMangguo");
				ItemMangguo.setUnlocalizedName("ItemMangguo");
				 
				ItemMangguo.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemNingmeng = new ITemFood(3, 2F, false, "ItemNingmeng");
				ItemNingmeng.setUnlocalizedName("ItemNingmeng");
				 
				ItemNingmeng.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemYouzi = new ITemFood(3, 2F, false, "ItemYouzi");
				ItemYouzi.setUnlocalizedName("ItemYouzi");
				 
				ItemYouzi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemShizi = new ITemFood(3, 2F, false, "ItemShizi");
				ItemShizi.setUnlocalizedName("ItemShizi");
				 
				ItemShizi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemMugua = new ITemFood(3, 2F, false, "ItemMugua");
				ItemMugua.setUnlocalizedName("ItemMugua");
				 
				ItemMugua.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemShanzha = new ITemFood(3, 2F, false, "ItemShanzha");
				ItemShanzha.setUnlocalizedName("ItemShanzha");
				 
				ItemShanzha.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemLongyan = new ITemFood(3, 2F, false, "ItemLongyan");
				ItemLongyan.setUnlocalizedName("ItemLongyan");
				 
				ItemLongyan.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemShiliu = new ITemFood(3, 2F, false, "ItemShiliu");
				ItemShiliu.setUnlocalizedName("ItemShiliu");
				 
				ItemShiliu.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemCaomei = new ItemHongshu(ModBlocks.BlockCaomei,3);
				MinecraftForge.addGrassSeed(new ItemStack(ItemCaomei), 2);
				ItemCaomei.setUnlocalizedName("ItemCaomei");
				 
				ItemCaomei.setCreativeTab(FoodCraft.FcTabZhiwu);
				
				ItemHongzao = new ITemFood(3, 2F, false, "ItemHongzao");
				ItemHongzao.setUnlocalizedName("ItemHongzao");
				 
				ItemHongzao.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemYezi = new ITemFood(3, 2F, false, "ItemYezi");
				ItemYezi.setUnlocalizedName("ItemYezi");
				 
				ItemYezi.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemYingtao = new ITemFood(3, 2F, false, "ItemYingtao");
				ItemYingtao.setUnlocalizedName("ItemYingtao");
				 
				ItemYingtao.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemXiangjiao = new ITemFood(3, 2F, false, "ItemXiangjiao");
				ItemXiangjiao.setUnlocalizedName("ItemXiangjiao");
				 
				ItemXiangjiao.setCreativeTab(FoodCraft.FcTabZhiwu);	
				
				ItemJinkela = new ItemKb();
				ItemJinkela.setUnlocalizedName("ItemJinkela");
				 
				ItemJinkela.setCreativeTab(FoodCraft.FcTabJiqi);



				
				ItemLizizhi = new ItemYingliao(3, 8F, false, "ItemLizizhi",0xe5db3b).setUnlocalizedName("ItemLizizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemLizhizhi = new ItemYingliao(3, 8F, false, "ItemLizhizhi",0xf6edd0).setUnlocalizedName("ItemLizhizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemTaozizhi = new ItemYingliao(3, 8F, false, "ItemTaozizhi",0xf6cc24).setUnlocalizedName("ItemTaozizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemJuzizhi = new ItemYingliao(3, 8F, false, "ItemJuzizhi",0xf6ae24).setUnlocalizedName("ItemJuzizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemPipazhi = new ItemYingliao(3, 8F, false, "ItemPipazhi",0xfdcb6b).setUnlocalizedName("ItemPipazhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemMangguozhi = new ItemYingliao(3, 8F, false, "ItemMangguozhi",0xffd986).setUnlocalizedName("ItemMangguozhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemNingmengzhi = new ItemYingliao(3, 8F, false, "ItemNingmengzhi",0xfcf393).setUnlocalizedName("ItemNingmengzhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemYouzizhi = new ItemYingliao(3, 8F, false, "ItemYouzizhi",0xece382).setUnlocalizedName("ItemYouzizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemShizizhi = new ItemYingliao(3, 8F, false, "ItemShizizhi",0xeb8c30).setUnlocalizedName("ItemShizizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemMuguazhi = new ItemYingliao(3, 8F, false, "ItemMuguazhi",0xf18a25).setUnlocalizedName("ItemMuguazhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemShanzhazhi = new ItemYingliao(3, 8F, false, "ItemShanzhazhi",0xea7b0e).setUnlocalizedName("ItemShanzhazhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemShiliuzhi = new ItemYingliao(3, 8F, false, "ItemShiliuzhi",0xf46c30).setUnlocalizedName("ItemShiliuzhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemHongzaozhi = new ItemYingliao(3, 8F, false, "ItemHongzaozhi",0xb57c63).setUnlocalizedName("ItemHongzaozhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemCaomeizhi = new ItemYingliao(3, 8F, false, "ItemCaomeizhi",0xef1f6d).setUnlocalizedName("ItemCaomeizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemYezizhi = new ItemYingliao(3, 8F, false, "ItemYezizhi",0xfcf4d6).setUnlocalizedName("ItemYezizhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemYingtaozhi = new ItemYingliao(3, 8F, false, "ItemYingtaozhi",0xfd6d0d).setUnlocalizedName("ItemYingtaozhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemXiangjiaozhi = new ItemYingliao(3, 8F, false, "ItemXiangjiaozhi",0xf7eb6a).setUnlocalizedName("ItemXiangjiaozhi")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemYenai = new ItemYingliao(3, 8F, false, "ItemYenai",0xfefdf4).setUnlocalizedName("ItemYenai")
						.setCreativeTab(FoodCraft.FcTabYingliao);
				ItemLizhizhiice = new ItemYingliao(3, 9F, false, "ItemLizhizhiice",0).setUnlocalizedName("ItemLizhizhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemTaozizhiice = new ItemYingliao(3, 9F, false, "ItemTaozizhiice",0).setUnlocalizedName("ItemTaozizhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemJuzizhiice = new ItemYingliao(3, 9F, false, "ItemJuzizhiice",0).setUnlocalizedName("ItemJuzizhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemMangguozhiice = new ItemYingliao(3, 9F, false, "ItemMangguozhiice",0).setUnlocalizedName("ItemMangguozhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemNingmengzhiice = new ItemYingliao(3, 9F, false, "ItemNingmengzhiice",0).setUnlocalizedName("ItemNingmengzhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemMuguazhiice = new ItemYingliao(3, 9F, false, "ItemMuguazhiice",0).setUnlocalizedName("ItemMuguazhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemCaomeizhiice = new ItemYingliao(3, 9F, false, "ItemCaomeizhiice",0).setUnlocalizedName("ItemCaomeizhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemYezizhiice = new ItemYingliao(3, 9F, false, "ItemYezizhiice",0).setUnlocalizedName("ItemYezizhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				ItemXiangjiaozhiice = new ItemYingliao(3, 9F, false, "ItemXiangjiaozhiice",0).setUnlocalizedName("ItemXiangjiaozhiice")
						 .setCreativeTab(FoodCraft.FcTabYingliao);
				
				
				ItemLizijiu = new ItemFoodJiu(3, 8F, false, "ItemLizijiu").setAlwaysEdible().setUnlocalizedName("ItemLizijiu")
				.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemLizhijiu = new ItemFoodJiu(3, 8F, false, "ItemLizhijiu").setAlwaysEdible().setUnlocalizedName("ItemLizhijiu")
				 .setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemTaozijiu = new ItemFoodJiu(3, 8F, false, "ItemTaozijiu").setAlwaysEdible().setUnlocalizedName("ItemTaozijiu")
				.setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemMangguojiu = new ItemFoodJiu(3, 8F, false, "ItemMangguojiu").setAlwaysEdible().setUnlocalizedName("ItemMangguojiu")
				 .setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemNingmengjiu = new ItemFoodJiu(3, 8F, false, "ItemNingmengjiu").setAlwaysEdible().setUnlocalizedName("ItemNingmengjiu")
				 .setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemShiliujiu = new ItemFoodJiu(3, 8F, false, "ItemShiliujiu").setAlwaysEdible().setUnlocalizedName("ItemShiliujiu")
				 .setCreativeTab(FoodCraft.FcTabYingliao);	
				
				ItemGuojiang = new ItemGuojiang().setUnlocalizedName("ItemGuojiang")
						 .setCreativeTab(FoodCraft.FcTabShicai);	
				
				ItemBinggan = new ItemBinggan(3, 10F, false, "ItemBinggan").setUnlocalizedName("ItemBinggan")
						 .setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemDangao = new ItemDangao().setUnlocalizedName("ItemDangao")
						 .setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemBingganF = new ITemFood(3, 6F, false, "ItemBingganF").setUnlocalizedName("ItemBingganF")
						.setCreativeTab(FoodCraft.FcTabXiaodian);	
				ItemBingganXN = new ITemFood(3, 7F, false, "ItemBingganXN").setUnlocalizedName("ItemBingganXN")
						 .setCreativeTab(FoodCraft.FcTabXiaodian);	
				
				ItemTest = new ItemTest().setUnlocalizedName("ItemTest")
						 .setCreativeTab(CreativeTabs.tabTools);	
				GameRegistry.registerItem(ItemTest, "ItemTest");	
		
		/**
		 *------------------------------ 机器工具  ------------------------------ 
		 */
		GameRegistry.registerItem(ItemTiepian, "ItemTiepian");
		GameRegistry.registerItem(ItemJinghuashuitong, "ItemJinghuashuitong");
		GameRegistry.registerItem(ItemDianluban, "ItemDianluban");
		GameRegistry.registerItem(ItemCaidao, "ItemCaidao");
		GameRegistry.registerItem(ItemCaidaoHJ, "ItemCaidaoHJ");
		GameRegistry.registerItem(ItemCaidaoZS, "ItemCaidaoZS");
		GameRegistry.registerItem(ItemCaidaoLBS, "ItemCaidaoLBS");
		GameRegistry.registerItem(ItemWrench, "ItemWrench");
		GameRegistry.registerItem(ItemJinkela, "ItemJinkela");
		GameRegistry.registerItem(ItemNull, "ItemNull");
		/**
		 *------------------------------ 植物  ------------------------------
		 */ 	
		GameRegistry.registerItem(ItemDami, "ItemDami");
		GameRegistry.registerItem(ItemHuashen, "ItemHuashen");	
		GameRegistry.registerItem(ItemDouzi, "ItemDouzi");	
		GameRegistry.registerItem(ItemNuomi, "ItemNuomi");
		GameRegistry.registerItem(ItemHongdou, "ItemHongdou");
		GameRegistry.registerItem(ItemLvdou, "ItemLvdou");
		
		GameRegistry.registerItem(ItemBailuobo, "ItemBailuobo");
		GameRegistry.registerItem(ItemShucai, "ItemShucai");	
		GameRegistry.registerItem(ItemLajiao, "ItemLajiao");	
		GameRegistry.registerItem(ItemQingjiao, "ItemQingjiao");
		GameRegistry.registerItem(ItemFanqie, "ItemFanqie");	
		GameRegistry.registerItem(ItemQiezi, "ItemQiezi");	
		GameRegistry.registerItem(ItemCong, "ItemCong");	
		GameRegistry.registerItem(ItemDoujiao, "ItemDoujiao");
		GameRegistry.registerItem(ItemHuanggua, "ItemHuanggua");
		GameRegistry.registerItem(ItemYumi, "ItemYumi");
		
		GameRegistry.registerItem(ItemHongshu, "ItemHongshu");
		GameRegistry.registerItem(ItemZongye, "ItemZongye");
		GameRegistry.registerItem(ItemPutao, "ItemPutao");	
		GameRegistry.registerItem(ItemJinputao, "ItemJinputao");	
		GameRegistry.registerItem(ItemLi, "ItemLi");
		GameRegistry.registerItem(ItemLizhi, "ItemLizhi");
		GameRegistry.registerItem(ItemTaozi, "ItemTaozi");
		GameRegistry.registerItem(ItemJuzi, "ItemJuzi");
		GameRegistry.registerItem(ItemPipa, "ItemPipa");
		GameRegistry.registerItem(ItemMangguo, "ItemMangguo");
		GameRegistry.registerItem(ItemNingmeng, "ItemNingmeng");
		GameRegistry.registerItem(ItemYouzi, "ItemYouzi");
		GameRegistry.registerItem(ItemShizi, "ItemShizi");
		GameRegistry.registerItem(ItemMugua, "ItemMugua");
		GameRegistry.registerItem(ItemShanzha, "ItemShanzha");
		GameRegistry.registerItem(ItemLongyan, "ItemLongyan");
		GameRegistry.registerItem(ItemShiliu, "ItemShiliu");
		GameRegistry.registerItem(ItemHongzao, "ItemHongzao");
		GameRegistry.registerItem(ItemCaomei, "ItemCaomei");
		GameRegistry.registerItem(ItemYezi, "ItemYezi");
		GameRegistry.registerItem(ItemYingtao, "ItemYingtao");
		GameRegistry.registerItem(ItemXiangjiao, "ItemXiangjiao");
		
		GameRegistry.registerItem(ItemShucaizhong, "ItemShucaizhong");
		GameRegistry.registerItem(ItemLajiaozhong, "ItemLajiaozhong");
		GameRegistry.registerItem(ItemFanqiezhong, "ItemFanqiezhong");
		GameRegistry.registerItem(ItemPutaozhong, "ItemPutaozhong");
		GameRegistry.registerItem(ItemQiezizhong, "ItemQiezizhong");
		GameRegistry.registerItem(ItemQingjiaozhong, "ItemQingjiaozhong");
		GameRegistry.registerItem(ItemYumizhong, "ItemYumizhong");
		GameRegistry.registerItem(ItemHuangguazhong, "ItemHuangguazhong");
		/**
		 *------------------------------  饮料    ------------------------------
		 */ 
		GameRegistry.registerItem(ItemDoujiang, "ItemDoujiang");
		GameRegistry.registerItem(ItemHongjiu, "ItemHongjiu");
		GameRegistry.registerItem(ItemBaijiu, "ItemBaijiu");
		GameRegistry.registerItem(ItemPutaojiu, "ItemPutaojiu");
		GameRegistry.registerItem(ItemPingguojiu, "ItemPingguojiu");		
		GameRegistry.registerItem(ItemJinputaojiu, "ItemJinputaojiu");
		GameRegistry.registerItem(ItemJinpingguojiu, "ItemJinpingguojiu");	
		GameRegistry.registerItem(ItemLizijiu, "ItemLizijiu");
		GameRegistry.registerItem(ItemLizhijiu, "ItemLizhijiu");
		GameRegistry.registerItem(ItemTaozijiu, "ItemTaozijiu");
		GameRegistry.registerItem(ItemMangguojiu, "ItemMangguojiu");
		GameRegistry.registerItem(ItemNingmengjiu, "ItemNingmengjiu");
		GameRegistry.registerItem(ItemShiliujiu, "ItemShiliujiu");
		
		GameRegistry.registerItem(ItemQiaokelishui, "ItemQiaokelishui");
		GameRegistry.registerItem(ItemHuluobozhi, "ItemHuluobozhi");
		GameRegistry.registerItem(ItemCha, "ItemCha");
		GameRegistry.registerItem(ItemPutaozhi, "ItemPutaozhi");
		GameRegistry.registerItem(ItemPingguozhi, "ItemPingguozhi");
		GameRegistry.registerItem(ItemShucaizhi, "ItemShucaizhi");
		GameRegistry.registerItem(ItemXiguazhi, "ItemXiguazhi");		
		GameRegistry.registerItem(ItemJinputaozhi, "ItemJinputaozhi");
		GameRegistry.registerItem(ItemJinpingguozhi, "ItemJinpingguozhi");
		GameRegistry.registerItem(ItemKele, "ItemKele");
		GameRegistry.registerItem(ItemXuebi, "ItemXuebi");
		GameRegistry.registerItem(ItemNaicha, "ItemNaicha");
		GameRegistry.registerItem(ItemKafei, "ItemKafei");		
		GameRegistry.registerItem(ItemQiaokelinai, "ItemQiaokelinai");
		GameRegistry.registerItem(ItemDounai, "ItemDounai");		
		GameRegistry.registerItem(ItemBailuobozhi, "ItemBailuobozhi");	
		GameRegistry.registerItem(ItemFanqiezhi, "ItemFanqiezhi");	
		GameRegistry.registerItem(ItemYumizhi, "ItemYumizhi");	
		GameRegistry.registerItem(ItemHuangguazhi, "ItemHuangguazhi");	
		
		GameRegistry.registerItem(ItemLizizhi, "ItemLizizhi");	
		GameRegistry.registerItem(ItemLizhizhi, "ItemLizhizhi");	
		GameRegistry.registerItem(ItemTaozizhi, "ItemTaozizhi");	
		GameRegistry.registerItem(ItemJuzizhi, "ItemJuzizhi");	
		GameRegistry.registerItem(ItemPipazhi, "ItemPipazhi");	
		GameRegistry.registerItem(ItemMangguozhi, "ItemMangguozhi");	
		GameRegistry.registerItem(ItemNingmengzhi, "ItemNingmengzhi");	
		GameRegistry.registerItem(ItemYouzizhi, "ItemYouzizhi");	
		GameRegistry.registerItem(ItemShizizhi, "ItemShizizhi");	
		GameRegistry.registerItem(ItemMuguazhi, "ItemMuguazhi");	
		GameRegistry.registerItem(ItemShanzhazhi, "ItemShanzhazhi");	
		GameRegistry.registerItem(ItemShiliuzhi, "ItemShiliuzhi");	
		GameRegistry.registerItem(ItemHongzaozhi, "ItemHongzaozhi");	
		GameRegistry.registerItem(ItemCaomeizhi, "ItemCaomeizhi");	
		GameRegistry.registerItem(ItemYezizhi, "ItemYezizhi");	
		GameRegistry.registerItem(ItemYingtaozhi, "ItemYingtaozhi");	
		GameRegistry.registerItem(ItemXiangjiaozhi, "ItemXiangjiaozhi");	
		GameRegistry.registerItem(ItemYenai, "ItemYenai");	

		
		GameRegistry.registerItem(ItemQiaokelinaiice, "ItemQiaokelinaiice");
		GameRegistry.registerItem(ItemPutaozhiice, "ItemPutaozhiice");
		GameRegistry.registerItem(ItemPingguozhiice, "ItemPingguozhiice");
		GameRegistry.registerItem(ItemJinputaozhiice, "ItemJinputaozhiice");
		GameRegistry.registerItem(ItemXiguazhiice, "ItemXiguazhiice");
		GameRegistry.registerItem(ItemJinpingguozhiice, "ItemJinpingguozhiice");

		GameRegistry.registerItem(ItemLizhizhiice, "ItemLizhizhiice");
		GameRegistry.registerItem(ItemTaozizhiice, "ItemTaozizhiice");
		GameRegistry.registerItem(ItemJuzizhiice, "ItemJuzizhiice");
		GameRegistry.registerItem(ItemMangguozhiice, "ItemMangguozhiice");
		GameRegistry.registerItem(ItemNingmengzhiice, "ItemNingmengzhiice");
		GameRegistry.registerItem(ItemMuguazhiice, "ItemMuguazhiice");
		GameRegistry.registerItem(ItemCaomeizhiice, "ItemCaomeizhiice");
		GameRegistry.registerItem(ItemYezizhiice, "ItemYezizhiice");
		GameRegistry.registerItem(ItemXiangjiaozhiice, "ItemXiangjiaozhiice");
		/**
		 *------------------------------  主食    ------------------------------
		 */ 
		GameRegistry.registerItem(ItemMogudunjitang, "ItemMogudunjitang");
		GameRegistry.registerItem(ItemDangeng, "ItemDangeng");
		GameRegistry.registerItem(ItemMian, "ItemMian");
		GameRegistry.registerItem(ItemGuoqiaomixian, "ItemGuoqiaomixian");
		GameRegistry.registerItem(ItemPidanshourouzhou, "ItemPidanshourouzhou");
		GameRegistry.registerItem(ItemLabazhou, "ItemLabazhou");
		GameRegistry.registerItem(ItemFanqiechaojidanfan, "ItemFanqiechaojidanfan");
		GameRegistry.registerItem(ItemDisanxian, "ItemDisanxian");
		GameRegistry.registerItem(ItemYuxiangrousi, "ItemYuxiangrousi");
		GameRegistry.registerItem(ItemGongbaojiding, "ItemGongbaojiding");
		GameRegistry.registerItem(ItemChaotudousifan, "ItemChaotudousifan");
		GameRegistry.registerItem(ItemDuojiaoyutou, "ItemDuojiaoyutou");
		GameRegistry.registerItem(ItemMapodoufufan, "ItemMapodoufufan");
		GameRegistry.registerItem(ItemHongshaoroufan, "ItemHongshaoroufan");
		GameRegistry.registerItem(ItemHuiguoroufan, "ItemHuiguoroufan");
		GameRegistry.registerItem(ItemAeljichifan, "ItemAeljichifan");
		GameRegistry.registerItem(ItemLaziji, "ItemLaziji");
		GameRegistry.registerItem(ItemKoushuiji, "ItemKoushuiji");
		GameRegistry.registerItem(ItemBaiqiuji, "ItemBaiqiuji");
		GameRegistry.registerItem(ItemCongyouji, "ItemCongyouji");
		GameRegistry.registerItem(ItemSuancaiyu, "ItemSuancaiyu");
		GameRegistry.registerItem(ItemMalayu, "ItemMalayu");
		GameRegistry.registerItem(ItemQingzhenyu, "ItemQingzhenyu");
		GameRegistry.registerItem(ItemKelejichifan, "ItemKelejichifan");
		GameRegistry.registerItem(ItemGalijiroufan, "ItemGalijiroufan");
		GameRegistry.registerItem(ItemShuizhuniurou, "ItemShuizhuniurou");
		GameRegistry.registerItem(ItemYifen, "ItemYifen");
		GameRegistry.registerItem(ItemYifenpork, "ItemYifenpork");
		GameRegistry.registerItem(ItemYifenbeef, "ItemYifenbeef");
		GameRegistry.registerItem(ItemYifenchicken, "ItemYifenchicken");
		GameRegistry.registerItem(ItemRibendoufu, "ItemRibendoufu");
		GameRegistry.registerItem(ItemChangfen, "ItemChangfen");
		/**
		 *------------------------------  食材    ------------------------------
		 */ 
		GameRegistry.registerItem(Itemwater, "Itemwater");
		GameRegistry.registerItem(Itemfan, "Itemfan");
		GameRegistry.registerItem(ItemMianfen, "ItemMianfen");
		GameRegistry.registerItem(ItemYan, "ItemYan");
		GameRegistry.registerItem(ItemMianpi, "ItemMianpi");
		GameRegistry.registerItem(ItemDouban, "ItemDouban");
		GameRegistry.registerItem(ItemQiaokelifen, "ItemQiaokelifen");
		GameRegistry.registerItem(ItemJiaozixian, "ItemJiaozixian");
		GameRegistry.registerItem(ItemHuashenyou, "ItemHuashenyou");
		GameRegistry.registerItem(ItemBaifan, "ItemBaifan");
		GameRegistry.registerItem(ItemJitui, "ItemJitui");	
		GameRegistry.registerItem(ItemJichi, "ItemJichi");	
		GameRegistry.registerItem(ItemDajirou, "ItemDajirou");	
		GameRegistry.registerItem(ItemZhongjirou, "ItemZhongjirou");	
		GameRegistry.registerItem(ItemXiaojirou, "ItemXiaojirou");	
		GameRegistry.registerItem(ItemTudoupian, "ItemTudoupian");	
		GameRegistry.registerItem(ItemTudousi, "ItemTudousi");	
		GameRegistry.registerItem(ItemJiangyou, "ItemJiangyou");	
		GameRegistry.registerItem(ItemCu, "ItemCu");	
		GameRegistry.registerItem(ItemDousha, "ItemDousha");
		GameRegistry.registerItem(ItemDianfen, "ItemDianfen");		
		GameRegistry.registerItem(ItemNuomifen, "ItemNuomifen");	
		GameRegistry.registerItem(ItemNuomituan, "ItemNuomituan");	
		GameRegistry.registerItem(ItemHuashentangyuanxian, "ItemHuashentangyuanxian");	
		GameRegistry.registerItem(ItemDoufusi, "ItemDoufusi");	
		GameRegistry.registerItem(ItemLuobosi, "ItemLuobosi");	
		GameRegistry.registerItem(ItemBailuobosi, "ItemBailuobosi");	
		GameRegistry.registerItem(ItemMianfensi, "ItemMianfensi");	
		GameRegistry.registerItem(ItemGalikuai, "ItemGalikuai");	
		GameRegistry.registerItem(ItemLaweixunliao, "ItemLaweixunliao");			
		GameRegistry.registerItem(ItemGuojiang, "ItemGuojiang");
		
		/**
		 *------------------------------  小点    ------------------------------
		 */ 
		GameRegistry.registerItem(ItemYouyurou, "ItemYouyurou");
		GameRegistry.registerItem(ItemShuyouyurou, "ItemShuyouyurou");
		GameRegistry.registerItem(ItemYouyusi, "ItemYouyusi");		
		GameRegistry.registerItem(ItemJianjidan, "ItemJianjidan");		
		GameRegistry.registerItem(ItemLaobing, "ItemLaobing");
		GameRegistry.registerItem(ItemJiaozi, "ItemJiaozi");
		GameRegistry.registerItem(ItemJianjiao, "ItemJianJiao");
		GameRegistry.registerItem(ItemDoufu, "ItemDoufu");
		GameRegistry.registerItem(ItemDoufugan, "ItemDoufugan");
		GameRegistry.registerItem(ItemChaotudoupian, "ItemChaotudoupian");
		GameRegistry.registerItem(ItemXifan, "ItemXifan");
		GameRegistry.registerItem(ItemZongzi, "ItemZongzi");
		GameRegistry.registerItem(ItemYuebing, "ItemYuebing");
		GameRegistry.registerItem(ItemTangyuan, "ItemTangyuan");
		GameRegistry.registerItem(ItemMahua, "ItemMahua");
		GameRegistry.registerItem(ItemChunjuan, "ItemChunjuan");
		GameRegistry.registerItem(ItemShupian, "ItemShupian");
		GameRegistry.registerItem(ItemXiangchang, "ItemXiangchang");
		GameRegistry.registerItem(ItemLachang, "ItemLachang");
		GameRegistry.registerItem(ItemLarou, "ItemLarou");
		GameRegistry.registerItem(ItemZhaxiangchang, "ItemZhaxiangchang");
		GameRegistry.registerItem(ItemPisa, "ItemPisa");
		GameRegistry.registerItem(ItemHanbaobao, "ItemHanbaobao");		
		GameRegistry.registerItem(ItemYoutiao, "ItemYoutiao");
		GameRegistry.registerItem(ItemLatiao, "ItemLatiao");		
		GameRegistry.registerItem(ItemJikuai, "ItemJikuai");
		GameRegistry.registerItem(ItemYuanweijikuai, "ItemYuanweijikuai");
		GameRegistry.registerItem(ItemShutiao, "ItemShutiao");
		GameRegistry.registerItem(ItemJimihua, "ItemJimihua");
		GameRegistry.registerItem(ItemAeljichi, "ItemAeljichi");		
		GameRegistry.registerItem(ItemZhadoufu, "ItemZhadoufu");
		GameRegistry.registerItem(ItemZhachunjuan, "ItemZhachunjuan");
		GameRegistry.registerItem(ItemZhamahua, "ItemZhamahua");
		GameRegistry.registerItem(ItemZhajitui, "ItemZhajitui");
		GameRegistry.registerItem(ItemKaohongshu, "ItemKaohongshu");
		GameRegistry.registerItem(ItemKaoyumi, "ItemKaoyumi");
		GameRegistry.registerItem(ItemBaoyumihua, "ItemBaoyumihua");
		/**
		 *------------------------------  甜点    ------------------------------
		 */ 
		GameRegistry.registerItem(ItemQiaokeli, "ItemQiaokeli");
		GameRegistry.registerItem(ItemNiangao, "ItemNiangao");
		GameRegistry.registerItem(ItemHetaosu, "ItemHetaosu");
		GameRegistry.registerItem(ItemAici, "ItemAici");
		GameRegistry.registerItem(ItemCiba, "ItemCiba");
		GameRegistry.registerItem(ItemNainao, "ItemNainao");
		GameRegistry.registerItem(ItemMantou, "ItemMantou");
		GameRegistry.registerItem(ItemSuancaibing, "ItemSuancaibing");
		GameRegistry.registerItem(ItemZhaniangao, "ItemZhaniangao");
		GameRegistry.registerItem(ItemZhamianbao, "ItemZhamianbao");
		GameRegistry.registerItem(ItemRegou, "ItemRegou");
		GameRegistry.registerItem(ItemBingganXN, "ItemBingganXN");
		GameRegistry.registerItem(ItemBingganF, "ItemBingganF");
		GameRegistry.registerItem(ItemBinggan, "ItemBinggan");
		GameRegistry.registerItem(ItemDangao, "ItemDangao");
		/**
		 *----------------------------------------------------------------
		 */ 

	}

	}
