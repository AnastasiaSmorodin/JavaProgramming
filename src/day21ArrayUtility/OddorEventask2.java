package day21ArrayUtility;

import java.util.Arrays;

public class OddorEventask2 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 7, 8, 9, 12, 13, 14};
        int countodd = 0;
        int coundeven = 0;
        for (int each : numbers) {// int eachelement=numbers[i];
            if (each %2 == 0) {
                coundeven++;
            }else{
                    countodd++;
                }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(coundeven);
        System.out.println(countodd);

        }

    }


