package com.mesly.trialmod.item;

import com.mesly.trialmod.TrailMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Mesly on 12-9-2016.
 */
public class itemTrialItem extends Item {
    public itemTrialItem(String name) {
        setUnlocalizedName(name);
        setCreativeTab(TrailMod.tabTrial);
        setMaxStackSize(32);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player, EnumHand hand) {
        if (!worldIn.isRemote) {
            player.addChatComponentMessage(new TextComponentString("User Right Clicked"));
        }
        return super.onItemRightClick(itemStackIn, worldIn, player, hand);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (world.getBlockState(pos).getBlock() == Blocks.GRASS) {
            world.setBlockState(pos, Blocks.SANDSTONE.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("This item turns grass into sandstone");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }



    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
