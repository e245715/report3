package jp.ac.uryukyu.ie.e245715;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    /*private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    //getterメソッド：nameを取得する
    public String getName(){
        return name;
    }
    // setter メソッド: name を設定する
    public void setName(String name) {
        this.name = name;
    }
    
    

    //getterメソッド：hitPointを取得する
    public int getHitPoint(){
        return hitPoint;
    }

    // setter メソッド: hitPointを設定する
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    //getterメソッド：attackを取得する
    public int getAttack(){
        return attack;
    }

    // setter メソッド: attack を設定する
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //getterメソッド：deadを取得する
    public boolean getDead(){
        return dead;
    }

    // setter メソッド: dead を設定する
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    */

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {

        super(name,maximumHP,attack);


        //System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     
    public void attack(Hero hero){
        if(dead){
            //enemyが倒された時に実行されるコード
            int damage = 0;
            hero.wounded(damage);
            System.out.printf("%sは死亡した。\n",name);
        }else{
            //上記が偽である時(=enemyが生存している)に実行されるコード
            int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        hero.wounded(damage);
        }
        
    }*/

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */

     @Override
    public void wounded(int damage){
        
        System.out.printf("モンスター%sは倒れた。\n", name);
        
    }

}