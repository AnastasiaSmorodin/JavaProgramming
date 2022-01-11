package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = addElement(arr, 5);
        System.out.println(Arrays.toString(result));
        System.out.println("==============================");
        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        double result1[] = addElement(arr2, 5.5);
        System.out.println(Arrays.toString(arr2));
        String[] names = {"Tatiana", "Oleksandr", "Cassandra", "Ali"};  //"Neira"
        names = addElement(names, "Neira");  //{"Tatiana", "Oleksandr", "Cassandra", "Ali", "Neira"}
        names = addElement(names, "Igor");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------------------");
        char[] chars = {'A', 'B', 'C', 'D'};
        chars = addElement(chars, 'E'); //{'A', 'B', 'C', 'D', 'E'}

        System.out.println(Arrays.toString(chars));

    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element;

        return result;


    }

    public static String[] addElement(String[] array, String element) {
        String[] result2 = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result2[i++] = each;
        }

        result2[result2.length - 1] = element;

        return result2;


    }

    public static char[] addElement(char[] array, char element) {
        char[] result2 = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result2[i++] = each;
        }

        result2[result2.length - 1] = element;

        return result2;


    }
}

