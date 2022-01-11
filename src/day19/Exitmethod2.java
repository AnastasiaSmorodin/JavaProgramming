package day19;

import java.util.Scanner;

public class Exitmethod2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter a math operator");
        char operator = scan.next().charAt(0);
        if(!(operator=='+'|| operator=='-')){
            System.err.println("Invalid Math Operator:"+operator);
            System.exit(0);

        }
        System.out.println("Enter number:");
        int num2= scan.nextInt();
        if(operator=='-'){
            System.out.println(num1-num2);
        } else{
            System.out.println(num1+num2);
        }
    }
}
