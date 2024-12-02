package jp.ac.uryukyu.ie.e245715;

class LivingThing {

    //フィールドの変数は４つ
    protected String name; //名前
    private int hitPoint; //HP
    private int attack; //攻撃力
    private boolean dead; //生死状態、true = 死亡

    //コンストラクタ
    public  LivingThing(String name, int maximumHP,int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false; //deadの初期化
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    //deadの getter method
    public boolean isDead(){
        return dead;

    }

    //nameのgetterメソッド、勇者またはスライムのnameを取得する
    public String getName(){
        return name;
    }

    //hitPointのgetter method
    public int getHitPoint() {
        return hitPoint;
    }

    //attackのgetter method
    public int getAttack(){
        return attack;
    }


    //勇者からスライム、またはスライムから勇者に攻撃するメソッド
    public void attack(LivingThing opponent){

        //相手に倒された時に実行される
        if(dead){
            int damage = 0;
            System.out.printf("%sは死亡した。\n",name);
            opponent.wounded(damage);

        }else{//自分が生存している時に実行される
            int damage = (int)(Math.random()*attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
        
    }

    //自身が攻撃された時のダメージを処理するメソッド
    public void wounded(int damage){
        hitPoint -= damage;

        if(hitPoint < 0){
            dead = true; //＝死亡

        }

    }

    
}
