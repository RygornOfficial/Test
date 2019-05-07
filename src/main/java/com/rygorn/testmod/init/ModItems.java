
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rygorn.testmod.init;


import java.util.ArrayList;
import java.util.List;

import com.rygorn.testmod.items.ItemBase;
import com.rygorn.testmod.items.armor.ArmorBase;
import com.rygorn.testmod.items.food.FoodBase;
import com.rygorn.testmod.items.food.FoodEffectBase;
import com.rygorn.testmod.items.tools.ToolSword;
import com.rygorn.testmod.items.tools.ToolSpade;
import com.rygorn.testmod.items.tools.ToolPickaxe;
import com.rygorn.testmod.items.tools.ToolAxe;
import com.rygorn.testmod.items.tools.ToolHoe;
import com.rygorn.testmod.util.Reference;
import net.minecraft.init.MobEffects;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

/**
 *
 * @author Rygorn
 */
public class ModItems 
{
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    // Materials
    public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 750, 12.0F, 8.0F, 10);
    public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 18, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
    
    //Tools
    public static final ItemSpade RUBY_SPADE = new ToolSpade("ruby_spade", MATERIAL_RUBY);
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
    public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
    
    //Weapons
    public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
    
    //Armor
    public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
    public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
    public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
    public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
    
    //Items
    public static final Item RUBY = new ItemBase("ruby");
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
    
    //Food
    //public static final Item EVIL_APPLE = new FoodBase("evil_apple", 8, 3.5F, false);
    public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 10, 10.5F, false, new PotionEffect((MobEffects.POISON), (60*20), 1, false, true));
    
}
