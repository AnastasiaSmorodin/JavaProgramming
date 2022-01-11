package day21ArrayUtility;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        /*write a program that can merge two arrays of integers
        Ex:
        arr1 = {1,2,3,4}
        arr2 = {5,6}    arr3 = {1,2,3,4,5,6}*/
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

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
        System.out.println(Arrays.toString(newArr));
    }
}







