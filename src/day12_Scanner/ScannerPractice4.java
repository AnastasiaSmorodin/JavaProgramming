package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = input.nextLine();


        System.out.println("Enter the building number");
        String building = input.next();
        input.nextLine();

        System.out.println("Enter your Street name");
        String street= input.nextLine();

        System.out.println("Enter city name");
        String city= input.next();


        System.out.println("Enter your state");
        String state= input.next();
        input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.nextLine();



        System.out.println(name+ "\n" + " " + building  + street + "\n" +city
                + "\n" + state +" \n" + zip);
        input.close();

       input.close();

    }
}
