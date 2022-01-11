package day22DementionalArray;

import java.util.Arrays;

public class ForeachLoop {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};
       /* for (int[] each1d : arr2D) {//each1d is for  the each  of arrays
            System.out.println(Arrays.toString(each1d));

            for(int eachelement:each1d){//eachelment for each elem of each array
                System.out.print(eachelement);/*

      */
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement+" ");
            }
        }

    }}




