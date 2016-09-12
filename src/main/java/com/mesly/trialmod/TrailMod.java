package com.mesly.trialmod;

import com.mesly.trialmod.CreativeTab.CreativeTabTrial;
import com.mesly.trialmod.Proxy.CommonProxy;
import com.mesly.trialmod.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TrailMod.MODID, version = TrailMod.VERSION, name = TrailMod.NAME)
public class TrailMod {
    public static final String MODID = "trialmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "trialmod";

    @SidedProxy(clientSide = "com.mesly.trialmod.Proxy.ClientProxy", serverSide = "com.mesly.trialmod.Proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TrailMod instance;

    public static CreativeTabTrial tabTrial;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabTrial = new CreativeTabTrial(CreativeTabs.getNextID(), "tab_trial");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
