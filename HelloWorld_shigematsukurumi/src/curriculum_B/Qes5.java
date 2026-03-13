package curriculum_B;

/**
 * 課題5
 * for文を使用して1〜9段、1〜20までの掛け算表を表示するプログラム
 * 表示形式：001 × 001 = 001 || のように3桁で表示する
 */
public class Qes5 {

    public static void main(String[] args) {

        // 段（1〜9）
        for (int dan = 1; dan <= 9; dan++) {

            // 掛けられる数（1〜20）
            for (int num = 1; num <= 20; num++) {

                int result = num * dan;

                // 3桁ゼロ埋め
                System.out.printf("%03d × %03d = %03d", num, dan, result);

                // 区切り
                if (num < 20) {
                    System.out.print(" || ");
                }
            }

            // 段ごとに改行
            System.out.println();
        }
    }
}
