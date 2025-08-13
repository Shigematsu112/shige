package curriculum_New_question;

import java.util.Random; // ← クラスの外に移動

public class Curriculum_New_1_18 {

    public static void printMessage(String text, int version) {
        System.out.println(text + " JavaSE " + version);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void multiply(double a, double b) {
        System.out.println(a + b);
    }

    public static int[] generateRandoms(int count) {
        Random rand = new Random(); // ← importに対応
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            int num;
            do {
                num = rand.nextInt(100) + 1;
            } while (num == 0);
            result[i] = num;
            System.out.println(num);
        }
        return result;
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;
        System.out.println("平均値: " + average);
        return average;
    }

    public static boolean isAboveThreshold(double average) {
        boolean result = average >= 50;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) { // ← 1つに統合
        printMessage("Hello", 11);
        multiply(3, 4);
        printArray(new int[]{1, 2, 3});
        multiply(2.5, 3.5);
        int[] randoms = generateRandoms(5);
        double avg = calculateAverage(randoms);
        isAboveThreshold(avg);
    }
}
