package K_25.curriculum_New_2425.status;
// ↑ このクラスが「status」パッケージに属していることを宣言。

import java.util.Random;
// ↑ ランダムな数値を生成するために Random クラスを読み込む。

public class Player {
    // ↑ Player クラスは「プレイヤーの情報を管理する役割」を持つ。

    // ★ フィールド（プレイヤーの情報）
    private String name;   // 名前
    private int hp;        // HP
    private int mp;        // MP
    private int attack;    // 攻撃力
    private int speed;     // 素早さ
    private int defense;   // 防御力
    // ↑ private にすることで「外から勝手に書き換えられない」ように守る。
    //   これがオブジェクト指向の基本「カプセル化」。

    // ★ コンストラクタ（new Player() された時に必ず実行される）
    public Player(String name) {
        // ↑ コンストラクタ名はクラス名と同じ。戻り値は書かない。

        this.name = name;
        // ↑ this.name は「フィールドの name」。
        //   = name は「引数の name」。
        //   同じ名前なので this を付けて区別する。

        Random rand = new Random();
        // ↑ ランダム値を作るための準備。

        // ★ ステータスをランダム生成（毎回変わる条件を満たす）
        this.hp = rand.nextInt(1000) + 1;      // 1〜1000
        this.mp = rand.nextInt(1000) + 1;      // 1〜1000
        this.attack = rand.nextInt(500) + 1;   // 1〜500
        this.speed = rand.nextInt(1000) + 1;   // 1〜1000
        this.defense = rand.nextInt(100) + 1;  // 1〜100
        // ↑ nextInt(n) は 0〜(n-1) なので +1 して 1〜n にしている。
    }

    // ★ getter & setter（private の値を安全に扱うための窓口）
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }
    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
}