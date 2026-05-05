package curriculum_New_question;

public class curriculum_New_23 {
    // フィールド（データを入れる箱）
    private String name;
    private double length;
    private int speed;

    // setter（値をセットするメソッド）
    public void setName(String name) {
        this.name = name; // this は「このクラスのフィールド」を指す
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter（値を取り出すメソッド）
    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }
}

