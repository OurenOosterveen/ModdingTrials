package com.mesly.trialmod.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Mesly on 12-9-2016.
 */
public class CreativeTabTrial extends CreativeTabs {
    public CreativeTabTrial(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.DIAMOND_HOE;
    }
}
