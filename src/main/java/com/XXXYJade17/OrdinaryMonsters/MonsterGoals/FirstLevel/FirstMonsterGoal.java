package com.XXXYJade17.OrdinaryMonsters.MonsterGoals.FirstLevel;

import com.XXXYJade17.OrdinaryMonsters.Monsters.FirstLevel.FirstMonster;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class FirstMonsterGoal extends Goal {
    private FirstMonster monster;
    private final int maxDistance=20;
    private Vec3 homePos;

    public FirstMonsterGoal(FirstMonster monster) {
        this.monster = monster;
    }

    @Override
    public boolean canUse() {
        Level level = monster.level();
        if(!level.isClientSide){
            if(monster.getLastAttacker() instanceof Player player){
                if (this.homePos == null) {
                    this.homePos = monster.position();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean canContinueToUse() {
        if(monster.getLastAttacker() instanceof Player player){
            if(!player.isAlive()){
                return false;
            }
            if (monster.distanceTo(player) > maxDistance) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void start() {
        if(monster.getLastAttacker() instanceof Player player){
            monster.setTarget(player);
        }
    }

    @Override
    public void stop() {
        monster.setTarget(null);
    }

    @Override
    public void tick() {
        if(monster.getLastAttacker() instanceof Player player){
            if (monster.distanceTo(player) > maxDistance) {
                monster.getNavigation().moveTo(homePos.x, homePos.y, homePos.z, 1.0D);
            } else {
                monster.getNavigation().moveTo(player, 1.0D);
            }
        }
    }
}
