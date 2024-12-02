package jp.ac.uryukyu.ie.e245715;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WarriorTest{


   @Test
   void attackWithWeponSkill(){


       int remainingEnemyHP;
       Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
       Enemy demoEnemy = new Enemy("スライムもどき", 1000, 10);


       for(int i=1; i<3; i++){
           remainingEnemyHP = demoEnemy.getHitPoint();
           demoWarrior.attackWithWeponSkill(demoEnemy);
           demoEnemy.attack(demoWarrior);


           assertEquals(demoWarrior.getAttack()*1.5,remainingEnemyHP - demoEnemy.getHitPoint());


       }
   }
}
