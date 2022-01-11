package day26;

import utilities.ArraysUtility;

public class Merge2Arrays2 {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            ArraysUtility.addElement(result, each);
        }
        for (int each : arr1) {
            ArraysUtility.addElement(result, each);
        }
        return result;
    }
}