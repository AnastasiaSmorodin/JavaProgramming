package day21ArrayUtility;

import java.util.Arrays;

public class Task1ReverseNumbers {
    public static void main(String[] args) {
        int[]numbers={2,5,3,7,9};
        int[]reversed=new int[numbers.length];
        Arrays.sort(numbers);
        for (int i = numbers.length-1, j=0; i >=0; i--, j++) {
            reversed[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reversed));
    }
}
