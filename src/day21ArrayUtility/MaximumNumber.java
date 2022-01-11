package day21ArrayUtility;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];//we asume that first number is thr maximum
        for (int each : numbers) {
            if (each > max) {
                max = each;

            }

        }
        System.out.println(max);
    }
}
