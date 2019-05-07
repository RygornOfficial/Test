/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.items.food;

import com.rygorn.testmod.Main;
import com.rygorn.testmod.init.ModItems;
import com.rygorn.testmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.ItemFood;

/**
 *
 * @author Rygorn
 */
public class FoodBase extends ItemFood implements IHasModel
{
    public FoodBase(String name, int amount, float saturation, boolean isAnimalFood){
        super(amount, saturation, isAnimalFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.FOOD);
        
        ModItems.ITEMS.add(this);
    }
    
    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
