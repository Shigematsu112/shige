package curriculum_B;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = 0;

            // ★ 2以上になるまで人数を再入力させる
            while (true) {
                System.out.print("生徒の人数を入力してください（2以上）：");
                try {
                    n = sc.nextInt();
                    if (n >= 2) {
                        break;
                    } else {
                        System.out.println("※ 2以上の整数を入力してください。");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("※ 数字を入力してください。");
                    sc.next(); // バッファクリア
                }
            }

            // 教科ごとの合計点
            int sumEng = 0;
            int sumMath = 0;
            int sumSci = 0;
            int sumSoc = 0;

            // 全体の合計点
            int totalAll = 0;

            // ★ 生徒ごとの入力と計算
            for (int i = 1; i <= n; i++) {

                System.out.print(i + "人目の「英語」の点数を入力してください：");
                int eng = sc.nextInt();

                System.out.print(i + "人目の「数学」の点数を入力してください：");
                int math = sc.nextInt();

                System.out.print(i + "人目の「理科」の点数を入力してください：");
                int sci = sc.nextInt();

                System.out.print(i + "人目の「社会」の点数を入力してください：");
                int soc = sc.nextInt();

                // 生徒ごとの平均
                double avg = (eng + math + sci + soc) / 4.0;
                System.out.printf("%d人目の平均点は%.2f点です。\n", i, avg);

                // 教科ごとの合計に加算
                sumEng += eng;
                sumMath += math;
                sumSci += sci;
                sumSoc += soc;

                // 全体の合計にも加算
                totalAll += eng + math + sci + soc;
            }

            // ★ 教科ごとの平均（課題例と同じ順番）
            System.out.printf("英語の平均点は%.2f点です。\n", sumEng / (double) n);
            System.out.printf("数学の平均点は%.2f点です。\n", sumMath / (double) n);
            System.out.printf("理科の平均点は%.2f点です。\n", sumSci / (double) n);
            System.out.printf("社会の平均点は%.2f点です。\n", sumSoc / (double) n);

            // ★ 全体の平均
            System.out.printf("全体の平均点は%.2f点です。\n", totalAll / (double) (n * 4));

        } catch (Exception e) {
            System.out.println("予期せぬエラーが発生しました。");
            e.printStackTrace();
        }
    }
}
