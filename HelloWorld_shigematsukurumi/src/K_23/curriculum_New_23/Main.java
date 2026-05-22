package K_23.curriculum_New_23;

import curriculum_New_question.curriculum_New_23;

public class Main {
    public static void main(String[] args) {

        // curriculum_New_23 のオブジェクトを作成
        curriculum_New_23 lion = new curriculum_New_23();

        // setterで値をセット
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // getterで値を取り出して出力
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
