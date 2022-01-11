package day17loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Write a program that can divide two positive numbers without using /
        (division) and * (multiplication) operators. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        int div=0;
        if (num1>=num2){
            for (int i = num1; i >= num2; i-=num2) {
                div+=1;
            }
        }
        System.out.println(div);
    }
}

/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.

 */




