package curriculum_1718;
public class Curriculum_New_1_18 {

    // Q1
    public static void printHello(String text, int number) {
        System.out.println(text + " " + number);
    }

    // Q2
    public static void multiply(int a, int b) {
        System.out.println("乗算結果: " + (a * b));
    }

    // Q3
    public static void printArray(int[] array) {
        System.out.println("配列の要素:");
        for (int num : array) {
            System.out.println(num);
        }
    }

    // Q4
    public static void add(double a, double b) {
        System.out.println("和算結果: " + (a + b));
    }

    // Q5
    public static int[] generateRandomNumbers(int count) {
        Random rand = new Random();
        int[] result = new int[count];
        int index = 0;

        while (index < count) {
            int num = rand.nextInt(100) + 1; // 1〜100
            if (num != 0) {
                result[index] = num;
                System.out.println("生成された数: " + num);
                index++;
            }
        }
        return result;
    }

    // Q6
    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.printf("平均値: %.2f%n", average);
        return average;
    }

    // Q7
    public static boolean isAboveThreshold(double average) {
        boolean result = average >= 50;
        System.out.println("50以上か？: " + result);
        return result;
    }

    public static void main(String[] args) {
        // Q1
        printHello("Hello JavaSE", 11);

        // Q2
        multiply(5, 6);

        // Q3
        int[] sampleArray = {10, 20, 30};
        printArray(sampleArray);

        // Q4
        add(3.5, 4.2);

        // Q5
        int[] randomNumbers = generateRandomNumbers(5);

        // Q6
        double average = calculateAverage(randomNumbers);

        // Q7
        isAboveThreshold(average);
    }
}
