package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingPractice {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
        char[] arr3 = {'h', 'e', 'l', 'l','o'};
        char[] arr4 = {'w', 'o','r','l','d'};
        System.out.println(Arrays.toString(merge(arr3,arr4)));
        String[] arr5 = {"i", "love", "java"};
        String[] arr6 = {"kidding"};
        System.out.println(Arrays.toString(merge(arr5,arr6)));
        double[] arr7 = {1.1, 2.2, 3.3, 4.4};
        double[] arr8 = {5.5, 6.6};
        System.out.println(Arrays.toString(merge(arr7,arr8)));


    }

    public static int[] merge(int[]arr1,int[]arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int count = 0;
        for (int i : arr1) {
            newArr[count] = i;
            count++;
        }
        for (int j : arr2) {
            newArr[count] = j;
            count++;
        }
        return newArr;
    }

    public static char[] merge(char[]arr1,char[]arr2) {
        char[] newArr = new char[arr1.length + arr2.length];
        char count = 0;
        for (char i : arr1) {
            newArr[count] = i;
            count++;
        }
        for (char j : arr2) {
            newArr[count] = j;
            count++;
        }
        return newArr;
    }
    public static String[] merge(String[]arr1,String[]arr2) {
        String[] newArr = new String[arr1.length + arr2.length];
        int count = 0;
        for (String i : arr1) {
            newArr[count] = i;
            count++;
        }
        for (String j : arr2) {
            newArr[count] = j;
            count++;
        }
        return newArr;
    }

    public static double[] merge(double[]arr1,double[]arr2) {
        double[] newArr = new double[arr1.length + arr2.length];
        int count = 0;
        for (double i : arr1) {
            newArr[count] = i;
            count++;
        }
        for (double j : arr2) {
            newArr[count] = j;
            count++;
        }
        return newArr;
    }
}


