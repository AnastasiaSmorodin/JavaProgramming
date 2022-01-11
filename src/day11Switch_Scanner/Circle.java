package day11Switch_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();
        double area =  radius *radius* 3.14;
        double perimiter= 2* radius *3.14;
        System.out.println("perimiter=" + perimiter);
        System.out.println("area = " + area);
        input.close();

    }
}
