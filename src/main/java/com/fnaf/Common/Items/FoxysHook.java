package com.fnaf.Common.Items;

import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.main.MAIN_FNAF;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoxysHook extends Item {
	public static void mainRegistry(){
		registerItem();
		register();
	}
	
	public static Item block;
	public static Object instance;
	public static Item Foxyshook1;	
	
	
	
	public static void registerItem(){
	
	}
	
	public static void register()
	{
	
	}	
	
	


public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
    
    public FoxysHook()
	{
    	setMaxDamage(6);
    	maxStackSize = 1;
    	setUnlocalizedName("FoxysHook");
    	setTextureName("FoxysHook");
    	setCreativeTab(MAIN_FNAF.tabFnaf);
    
	}
}

	; 