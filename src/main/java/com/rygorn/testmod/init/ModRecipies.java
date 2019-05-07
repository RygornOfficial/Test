/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.init;



import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
/**
 *
 * @author Rygorn
 */
public class ModRecipies {
    
    public static void init()
    {
        GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 15F);
    }
}
