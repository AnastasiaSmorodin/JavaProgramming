package day17loops;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int first= scan.nextInt();
        System.out.println("Enter second number");
        int second= scan.nextInt();
        System.out.println("Enter math operator");
        char operator= scan.next().charAt(0);
        while(!(operator=='+'|| operator=='-'|| operator=='*'||operator=='/')){
            System.out.println("Re enter a valid operator");
            operator= scan.next().charAt(0);
        }
        if(operator=='+'){
            System.out.println(first+second);
        } else if(operator=='-'){
            System.out.println(first-second);
        } else if(operator=='*'){
            System.out.println(first*second);
        }else {
            System.out.println(first/second);
        }
    }
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)


 */