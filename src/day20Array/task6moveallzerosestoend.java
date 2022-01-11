package day20Array;
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */

import java.util.Arrays;

public class task6moveallzerosestoend {
    public static void main(String[] args) {
        int[]numbers= {10,0,5,0,1,0};
        int count=0;
        Arrays.sort(numbers);
        int[]newarray=new int [numbers.length];
                System.out.println(Arrays.toString(numbers));
        for (int i = numbers.length-1; i >=0; i--) {
            newarray[count]= numbers[i];
            count++;
        }
        System.out.println(Arrays.toString(newarray));

    }
}
