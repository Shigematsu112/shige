package curriculum_B;
import java.util.Random;
import java.util.Scanner;



public class Qes1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 入力用スキャナ

        String username; // ユーザー名格納変数

        // --- ユーザー名入力 ---
        System.out.print("ユーザー名を入力してください: ");
        username = scanner.nextLine();

        // --- ユーザー名のチェック ---
        if (username == null || username.length() == 0) {
            System.out.println("名前を入力してください");
            scanner.close();
            return;
        }

        if (!username.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
            scanner.close();
            return;
        }

        if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
            scanner.close();
            return;
        }

        // --- 登録成功 ---
        System.out.println("ユーザー名「" + username + "」を登録しました");

        // --- じゃんけん開始 ---
        Random random = new Random();
        int count = 0; // 試行回数
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("じゃんけんをしましょう！（0:グー, 1:チョキ, 2:パー）: ");
            int userHand = input.nextInt(); // ユーザーの手
            int cpuHand = random.nextInt(3); // コンピュータの手
            count++; // カウント

            String[] hands = {"グー", "チョキ", "パー"};

            System.out.println(username + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[cpuHand] + "」");

            if (userHand == cpuHand) {
                System.out.println("DRAW あいこ もう一回しましょう！");
                System.out.println();
                continue;
            }

            boolean userWin = (userHand == 0 && cpuHand == 1) || 
                              (userHand == 1 && cpuHand == 2) || 
                              (userHand == 2 && cpuHand == 0);

            if (userWin) {
                System.out.println("やるやん。");
                System.out.println("次は俺にリベンジさせて");
                System.out.println();
                System.out.println("勝つまでにかかった合計回数は" + count + "回です");
                break;
            } else {
                System.out.println("俺の勝ち！");　
                if (cpuHand == 0) {
                    System.out.println("負けは次につながるチャンスです！");
                    System.out.println("ネバーギブアップ！");
                } else if (cpuHand == 1) {
                    System.out.println("たかがじゃんけん、そう思ってないですか？");
                    System.out.println("それやったら次も、俺が勝ちますよ");
                } else {
                    System.out.println("なんで負けたか、明日まで考えといてください。");
                    System.out.println("そしたら何かが見えてくるはずです");
                }
                System.out.println();
            }
        }

        scanner.close();
        input.close();
    }
}
