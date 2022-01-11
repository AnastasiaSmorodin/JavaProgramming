package day22DementionalArray;

public class MaxandMintwodemarray {
    public static void main(String[] args) {
        int[][] arr = {{5, 2, 3, 4}, {12, 6, 7},{10,7,17,13}};
       // int max=-2145467;
       // int min=2145467;
        //1. Write a program that can find the minimum and maximum numbers from a two dimensional array
        int max=arr[0][0];
        int min=arr[0][0];
        for (int[] each : arr) {
            for (int element : each) {
                if(element>max){
                    max=element;}
                if (element<min){
                    min=element;
                }
            }

        }
        System.out.println(max);
        System.out.println(min);
            }
        }

