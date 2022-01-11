package day20Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[]numbers= new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();}
            //each user input will be asigned to the indexes of the array numbers
            int max= numbers[0];//assuption that 0 index is max (fits entered number)
            int min= numbers[0];
            for (int i1 = 0; i1 < numbers.length; i1++) {
                if(numbers[i1]>max){
                    max= numbers[i1];
                }
                if (numbers[i1] < min) {
                    min= numbers[i1];
                }

            }
        System.out.println(Arrays.toString(numbers));
            System.out.println("min = " + min);
            System.out.println("max = " + max);

        }

    }

