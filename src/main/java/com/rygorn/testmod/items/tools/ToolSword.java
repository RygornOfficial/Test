/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.items.tools;

import com.rygorn.testmod.Main;
import com.rygorn.testmod.init.ModItems;
import com.rygorn.testmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 *
 * @author Rygorn
 */
public class ToolSword extends ItemSword implements IHasModel
{
    
    public ToolSword(String name, ToolMaterial material)
    {
        super(material);
        
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.COMBAT);
        
        ModItems.ITEMS.add(this);
    }
    
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
