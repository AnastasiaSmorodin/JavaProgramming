package day22DementionalArray;

import java.util.Arrays;

public class task1ReverseArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        int[][] reverse = new int[arr.length][arr[0].length];

        for (int i = 0, j = arr.length - 1; j >= 0; i++, j--) {
            for (int k = 0, l = arr[j].length - 1; l >= 0; k++, l--) {
                reverse[i][k] = arr[j][l];
            }
        }

        System.out.println(Arrays.deepToString(reverse));


       /* int[][]reverse=new int[arr.length][arr[0].length];
  int first= arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            int second=arr[i].length-1;
            for (int j=0; j < arr[i].length; j++) {
            reverse[i][j]=arr[first][second];
            second--;

            }
     first--;
        }
        System.out.println(Arrays.deepToString(reverse));


      /*
      int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - 1; j >= 0; j--) {
                int[][] reverse= new int [i][j];
                System.out.println(Arrays.deepToString(reverse));

        */




            }

        }





 
