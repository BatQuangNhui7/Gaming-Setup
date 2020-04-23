package com.BatQuangNhui7.electricmod.init;

import java.util.ArrayList;
import java.util.List;

import com.BatQuangNhui7.electricmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block GAMING_WATER_COOLING = new BlockBase("gaming_water_cooling", Material.IRON);
}
