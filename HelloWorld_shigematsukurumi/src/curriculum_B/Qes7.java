package curriculum_B;
import java.util.Scanner;
public class Qes7 {
	    public static void main(String[] args) {
	        try (var sc = new Scanner(System.in)) {
				// 生徒の人数を入力
				System.out.print("生徒の人数を入力してください（2以上）：");
				int n = sc.nextInt();

				// 教科ごとの合計点
				int sumEng = 0;
				int sumMath = 0;
				int sumSci = 0;
				int sumSoc = 0;

				// 全体の合計点
				int totalAll = 0;

				// 生徒ごとの入力と計算
				for (int i = 1; i <= n; i++) {
				    System.out.print(i + "人目の英語：");
				    int eng = sc.nextInt();

				    System.out.print(i + "人目の数学：");
				    int math = sc.nextInt();

				    System.out.print(i + "人目の理科：");
				    int sci = sc.nextInt();

				    System.out.print(i + "人目の社会：");
				    int soc = sc.nextInt();

				    // 生徒ごとの平均
				    double avg = (eng + math + sci + soc) / 4.0;
				    System.out.printf(i + "人目の平均点は%.2f点です。\n", avg);

				    // 教科ごとの合計に加算
				    sumEng += eng;
				    sumMath += math;
				    sumSci += sci;
				    sumSoc += soc;

				    // 全体の合計にも加算
				    totalAll += eng + math + sci + soc;
				}

				// 教科ごとの平均
				System.out.printf("英語の平均点は%.2f点です。\n", sumEng / (double)n);
				System.out.printf("数学の平均点は%.2f点です。\n", sumMath / (double)n);
				System.out.printf("理科の平均点は%.2f点です。\n", sumSci / (double)n);
				System.out.printf("社会の平均点は%.2f点です。\n", sumSoc / (double)n);

				// 全体の平均
				System.out.printf("全体の平均点は%.2f点です。\n", totalAll / (double)(n * 4));
			}
	    }
	}
