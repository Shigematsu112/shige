package K_25.curriculum_New_2425;

import java.util.Scanner;

import K_25.curriculum_New_2425.status.Player;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("名前を入力してください：");
			String name = scanner.nextLine();

			Player player = new Player(name);

			System.out.println("こんにちは 「" + player.getName() + "」 さん");

			System.out.println("ステータス");
			System.out.println("HP：" + player.getHp());
			System.out.println("MP：" + player.getMp());
			System.out.println("攻撃力：" + player.getAttack());
			System.out.println("素早さ：" + player.getSpeed());
			System.out.println("防御力：" + player.getDefense());
		}

        System.out.println("さあ冒険に出かけよう！");
    }
}
