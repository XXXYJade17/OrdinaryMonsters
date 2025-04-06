package com.XXXYJade17.OrdinaryMonsters.Registry;

import com.XXXYJade17.OrdinaryMonsters.MonsterModels.FirstLevel.FirstMonsterModel;
import com.XXXYJade17.OrdinaryMonsters.MonsterRenderer.FirstLevel.FirstMonsterRenderer;
import com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel.FirstMonster;
import com.XXXYJade17.OrdinaryMonsters.OrdinaryMonsters;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod.EventBusSubscriber(modid = OrdinaryMonsters.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventRegistry {
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions evt) {
        evt.registerLayerDefinition(FirstMonsterModel.LAYER_LOCATION, FirstMonsterModel::createBodyLayer);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onClientEvent(FMLClientSetupEvent event){
        event.enqueueWork(()->{
            EntityRenderers.register(MonstersRegistry.FIRST_MONSTER.get(), FirstMonsterRenderer::new);
        });
    }

    @SubscribeEvent
    public static void setupAttributes(EntityAttributeCreationEvent event) {
        event.put(MonstersRegistry.FIRST_MONSTER.get(), FirstMonster.createAttributes().build());
    }
}
