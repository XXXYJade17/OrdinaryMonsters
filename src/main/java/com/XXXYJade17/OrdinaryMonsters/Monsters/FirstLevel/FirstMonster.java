package com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel;

import com.XXXYJade17.AttributeCore.Capability.Shackle.Shackle;
import com.XXXYJade17.MoreAttributes.Capabilities.Crit.Crit;
import com.XXXYJade17.MoreAttributes.Capabilities.Damage.Damage;
import com.XXXYJade17.MoreAttributes.Capabilities.Defence.Defence;
import com.XXXYJade17.MoreAttributes.Capabilities.Inteface.IMoreAttributes;
import com.XXXYJade17.MoreAttributes.Capabilities.LifeSteal.LifeSteal;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class FirstMonster extends Monster implements IMoreAttributes {
    private int attackRange;
    private Damage damage;

    public FirstMonster(EntityType<? extends Monster> entityType, Level level){
        super(entityType, level);
    }

    @Override
    public int getAttackRange() {
        return 0;
    }

    @Override
    public Damage getDamage() {
        return null;
    }

    @Override
    public Crit getCrit() {
        return null;
    }

    @Override
    public Defence getDefence() {
        return null;
    }

    @Override
    public LifeSteal getLifeSteal() {
        return null;
    }
}
