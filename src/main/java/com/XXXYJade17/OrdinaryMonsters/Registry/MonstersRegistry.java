package com.XXXYJade17.OrdinaryMonsters.Registry;

import com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel.FirstMonster;
import com.XXXYJade17.OrdinaryMonsters.OrdinaryMonsters;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MonstersRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, OrdinaryMonsters.MODID);

    public static final Supplier<EntityType<FirstMonster>> FIRST_MONSTER =
            ENTITY_TYPES.register("first_monster",
                    () -> EntityType.Builder.of(FirstMonster::new, MobCategory.MISC)
                            .sized(0.6f, 1.95f)
                            .build("first_monster"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
