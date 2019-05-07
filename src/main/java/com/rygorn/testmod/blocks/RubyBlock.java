/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 *
 * @author Rygorn
 */
public class RubyBlock extends BlockBase
{
    public RubyBlock(String name, Material material)
    {
        super(name, material);
        
        setSoundType(SoundType.GLASS);
        setHardness(5.0F);
        setResistance(40.0F);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0F);
        //setLightOpacity(1);
        //setBlockUnbreakable();
    }
}
