package com.mesly.trialmod.item;

import com.mesly.trialmod.TrailMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Ouren on 12-9-2016.
 */
public class ModItems {

    public static Item trialItem;

    public static void preInit() {

        trialItem = new itemTrialItem("trial_item");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(trialItem, new ResourceLocation(TrailMod.MODID, "trial_item"));
    }

    public static void registerRenders() {
        registerRender(trialItem);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TrailMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
