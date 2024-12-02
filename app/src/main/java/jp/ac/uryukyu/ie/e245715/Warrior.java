package jp.ac.uryukyu.ie.e245715;

public class Warrior extends LivingThing{

    public Warrior (String name,int maximumHP,int attack){
        super(name, maximumHP, attack);
    }
    
    //追加メソッド
    public void attackWithWeponSkill(LivingThing opponent){

        if(isDead()){
            System.out.printf("%sは死亡した、攻撃はできない。\n",this.getName());
        }else{

            //attackの150%を固定ダメージとして与える
            int damage = (int) (getAttack() * 1.5);  // 攻撃力の150%

            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);

            // 相手のwoundedメソッドを呼び出してダメージを与える
            opponent.wounded(damage);
        }
    }

    


    
}
