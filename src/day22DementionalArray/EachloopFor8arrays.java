package day22DementionalArray;

import java.util.Arrays;

public class EachloopFor8arrays {
    public static void main(String[] args) {
        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };
        for (int[][][][][][][] arr7D : arr8D) {
            for (int[][][][][][] arr6d : arr7D) {
                for (int[][][][][] arr5d : arr6d) {
                    for (int[][][][] arr4d : arr5d) {
                        for (int[][][] arr3d : arr4d) {
                            for (int[][] arr2d : arr3d) {
                                for (int[] arr1d : arr2d) {
                                    for (int element : arr1d) {
                                        System.out.print(element+" ");
                                    }

                                }


                            }

                        }

                    }

                }

            }

        }

    }
}
