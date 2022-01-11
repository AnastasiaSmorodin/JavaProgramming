package utilities;

public class MathUtility {
    public static void main(String[] args) {

    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static double sum(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static int subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return subtraction;
    }

    public static double subtraction(double num1, double num2) {
        double subtraction = num1 - num2;
        return subtraction;
    }

    public static double multiplication(double num1, double num2) {
        double multiplication = num1 * num2;
        return multiplication;
    }

    public static int multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;
    }

    public static int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }

    public static double division(double num1, double num2) {
        double division = num1 / num2;
        return division;
    }

    public static String even(int num1) {
        String result = "";

        if (num1 % 2 == 0) {
            result = "number is even";
        } else{
            result="number is odd";
        }
        return result;
    }

    public static String odd(int num1) {
        String result = "";
        if (num1 % 2 != 0) {
            result = "number is odd";
        } else
            result="number is even";
        return result;
    }

    public static String maximum(int num1, int num2) {
        String result = "";
        if (num1 > num2) {
            result = num1 + " is the maximum number ";
        } else {
            result = num2 + " is the maximum number";
        }
        return result;
    }

    public static String maximum(double num1, double num2) {
        String result = "";
        if (num1 > num2) {
            result = num1 + " is the maximum number ";
        } else {
            result = num2 + " is the maximum number";
        }
        return result;
    }

    public static String minimum(int num1, int num2) {
        String result = "";
        if (num1 > num2) {
            result = num2 + " is the minimum number ";
        } else {
            result = num1 + " is the minimum number";
        }
        return result;
    }

    public static String minimum(double num1, double num2) {
        String result = "";
        if (num1 > num2) {
            result = num2 + " is the minimum number ";
        } else {
            result = num1 + " is the minimum number";
        }
        return result;
    }

    public static int square(int num) {
        int square = num * num;
        return square;
    }

    public static double square(double num) {
        double square = num * num;
        return square;
    }

    public static int cube(int num) {
        int cube = num * num * num;
        return cube;
    }

    public static double cube(double num) {
        double cube = num * num * num;
        return cube;
    }
}
