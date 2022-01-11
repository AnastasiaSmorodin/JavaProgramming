package day16LoopPractice;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 2 numbers");

        int n1 = scan.nextInt();//2
        int n2 = scan.nextInt();//3
        int result = 0;

        for (int i = 0; i <n2; i++) {
            result+= n1;
        }
        if(result<0){
            System.out.println("Invalid");
        } else {
            System.out.println(result);
        }

    }
}

/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

*/