package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Full name:");
        String fullname= input.nextLine();

        System.out.println("Enter your programming language");
        String programming = input.nextLine();
        input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName= input.nextLine();
        input.close();




    }
}
