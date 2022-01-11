package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ticketsost= 1000;

        System.out.println("Do you have passport");
        String passport= scan.next();
        if(passport.equals("yes")){
        System.out.println("Enter the country");
        String country = scan.next();
        System.out.println("How many bags");
        byte bags = scan.nextByte();
        System.out.println("How many people travel");
        short people= scan.nextShort();
            System.out.println("Enter travelers names");
            String names= scan.nextLine();





        }
    }
}
