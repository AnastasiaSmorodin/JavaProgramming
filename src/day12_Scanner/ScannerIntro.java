package day12_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");//asking user
       int num1 = input.nextInt();//allows to take the first number from user
        System.out.println("enter a decimal"); //asking user
       double num2= input.nextDouble();//allows to put info from user

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication= " +(num1*num2));
        input.close();//closed scanner no output can be put after





    }

}
