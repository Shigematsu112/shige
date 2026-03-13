package curriculum_B;
import java.util.Random;
public class Qes6 {
    public static void main(String[] args) {

        // 入力された商品一覧（例として問題文の入力例を使用）
        String[] items = {
            "パソコン", "冷蔵庫", "風呂機", "洗濯機", "加湿器",
            "テレビ", "ディスプレイ", "その他商品"
        };

        // ランダム生成のためのクラス
        Random rand = new Random();

        // テレビとディスプレイで共通の値を使うために先に作る
        int tvValue = rand.nextInt(12);  // 0〜11 のランダム

        // 拡張for文で1つずつ処理
        for (String item : items) {

            switch (item) {

                case "パソコン":
                case "冷蔵庫":
                case "風呂機":
                case "洗濯機":
                case "加湿器":
                    // 条件演算子でランダム値を生成
                    int value = rand.nextInt(12);
                    System.out.println(item + "の残り台数は" + value + "台です");
                    break;

                case "テレビ":
                    // テレビは共通値をそのまま出力
                    System.out.println("テレビの残り台数は" + tvValue + "台です");
                    break;

                case "ディスプレイ":
                    // ディスプレイは最大値（11）のみランダム
                    int displayValue = 11;
                    System.out.println("ディスプレイの残り台数は" + displayValue + "台です");
                    break;

                default:
                    // その他商品
                    System.out.println(item + "は指定の商品ではありません");
                    break;
            }
        }
    }
}
