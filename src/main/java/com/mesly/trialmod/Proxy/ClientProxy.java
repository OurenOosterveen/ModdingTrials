package com.mesly.trialmod.Proxy;

import com.mesly.trialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Mesly on 12-9-2016.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
