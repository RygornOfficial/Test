/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.init;

import com.rygorn.testmod.blocks.RubyBlock;
import com.rygorn.testmod.blocks.RubyOre;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 *
 * @author Rygorn
 */
public class ModBlocks
{
    
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    
    //Blocks
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
    
    //Storage
    public static final Block RUBY_CHEST = new RubyChest("ruby_chest", Material.GLASS);
}
