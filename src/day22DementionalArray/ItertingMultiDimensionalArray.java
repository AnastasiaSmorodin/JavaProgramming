package day22DementionalArray;

import java.util.Arrays;

public class ItertingMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12,}};

        for (int i = 0; i < arr2D.length; i++) {//i is index num  of single dim array
           // System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D.length; j++) {
                //j is index of elements
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
            System.out.println("___________________________");




        }
    }
}
