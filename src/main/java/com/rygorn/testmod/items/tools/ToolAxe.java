/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.items.tools;

import com.rygorn.testmod.Main;
import com.rygorn.testmod.init.ModItems;
import com.rygorn.testmod.util.IHasModel;

import net.minecraft.item.ItemAxe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 *
 * @author Rygorn
 */
public class ToolAxe extends ItemAxe implements IHasModel
{
    public ToolAxe(String name, Item.ToolMaterial material)
    {
        super(material, 6.0F, -3.2F);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);
        
        ModItems.ITEMS.add(this);
    }
    
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
