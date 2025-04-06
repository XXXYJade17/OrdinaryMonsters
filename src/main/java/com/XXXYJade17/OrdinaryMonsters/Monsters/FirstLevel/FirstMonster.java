package com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel;

import com.XXXYJade17.AttributeCore.Capability.Shackle.Shackle;
import com.XXXYJade17.MoreAttributes.Capabilities.Crit.Crit;
import com.XXXYJade17.MoreAttributes.Capabilities.Damage.Damage;
import com.XXXYJade17.MoreAttributes.Capabilities.Defence.Defence;
import com.XXXYJade17.MoreAttributes.Capabilities.Inteface.IMoreAttributes;
import com.XXXYJade17.MoreAttributes.Capabilities.LifeSteal.LifeSteal;
import com.XXXYJade17.OrdinaryMonsters.MonsterGoals.FirstLevel.FirstMonsterGoal;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.Level;

public class FirstMonster extends Monster implements IMoreAttributes {
    private int attackRange=2;
    private Damage damage;

    public FirstMonster(EntityType<? extends Monster> entityType, Level level){
        super(entityType, level);
        damage=new Damage();
        damage.setDamage(2);
    }

    @Override
    protected void registerGoals() {
        // 这里添加的是我们自己的Goal
        this.goalSelector.addGoal(0,new FirstMonsterGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        System.out.println("12345");
        return Monster.createMonsterAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    public int getAttackRange() {
        return attackRange;
    }

    @Override
    public Damage getDamage() {
        return damage;
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
