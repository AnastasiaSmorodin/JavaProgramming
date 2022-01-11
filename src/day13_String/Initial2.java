package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initial2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname= scan.nextLine();
        System.out.println("Enter your last name");
        String lastname = scan.nextLine();

        firstname = firstname.toUpperCase();
        lastname = lastname.toUpperCase();
        char f = firstname.charAt(0);
        char l = lastname.charAt(0);
        System.out.println(f +"."+ l);

        scan.close();

    }
}
