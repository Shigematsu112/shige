package curriculum_New_question;

import java.util.Scanner;

public class Curriculum_New_1_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // ← Scannerは1つだけ定義

        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        System.out.print("年齢を入力してください: ");
        int age = scanner.nextInt();

        System.out.print("身長を入力してください（cm）: ");
        double height = scanner.nextDouble();

        System.out.print("体重を入力してください（kg）: ");
        double weight = scanner.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));
        System.out.println("こんにちは、" + name + "さん！");
        System.out.println("あなたの年齢は " + age + "歳 です。");
        System.out.println("あなたのBMIは " + String.format("%.2f", bmi) + " です。");

        scanner.close(); // ← closeは1回だけ
    }
}
