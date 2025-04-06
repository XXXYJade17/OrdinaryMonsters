package com.XXXYJade17.OrdinaryMonsters.MonsterRenderer.FirstLevel;

import com.XXXYJade17.OrdinaryMonsters.MonsterModels.FirstLevel.FirstMonsterModel;
import com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel.FirstMonster;
import com.XXXYJade17.OrdinaryMonsters.OrdinaryMonsters;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FirstMonsterRenderer extends MobRenderer<FirstMonster, FirstMonsterModel> {
    public FirstMonsterRenderer(EntityRendererProvider.Context context) {
        super(context, new FirstMonsterModel(context.bakeLayer(FirstMonsterModel.LAYER_LOCATION)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(FirstMonster entity) {
        return new ResourceLocation(OrdinaryMonsters.MODID,"textures/entity/first_monster.png");
    }

}
