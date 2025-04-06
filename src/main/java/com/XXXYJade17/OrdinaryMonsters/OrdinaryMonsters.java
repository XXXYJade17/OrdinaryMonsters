package com.XXXYJade17.OrdinaryMonsters;

import com.XXXYJade17.OrdinaryMonsters.Registry.MonstersRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(OrdinaryMonsters.MODID)
public class OrdinaryMonsters {
    public static final String MODID = "ordinarymonsters";

    public OrdinaryMonsters(IEventBus bus, ModContainer container) {
        MonstersRegistry.register(bus);

    }
}
