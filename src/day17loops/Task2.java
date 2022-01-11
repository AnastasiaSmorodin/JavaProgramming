package day17loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int num = 0;
        while (num >= 0) {//5-4-6
            System.out.println("Enter a number");
            num = scan.nextInt();//5-4-6 - -1
            sum += num;//5+4+6 -1
            if (num < 0) {
                break;
            }
            System.out.println("Sum of the numbers is :"+sum);


        }
    }
}

/*2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop


 */