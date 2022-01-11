package day20Array;

import java.util.Arrays;

public class Print100to1 {
    public static void main(String[] args) {
        int[]numbers=new int[100];
        for (int i=0, j=numbers.length; i<numbers.length && j>=1; i++,j--){
            numbers[i]=j;//will print 100 to 1
        }
        System.out.println(Arrays.toString(numbers));



        }

        }
        ///1. create an array that has the numbers 1 to 100
        //    2. create an array that has the numbers 100 to 1
        //    3. Write a program that asks user to enter a number 10 times:
        //            1. store all user entered numbers in an array
        //            2. find the max number
        //            3. find the min number


