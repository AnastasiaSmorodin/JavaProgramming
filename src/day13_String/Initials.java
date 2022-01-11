package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName= scan.next();
        System.out.println("Enter your last name");
        String lasName = scan.next();

        char f= firstName.charAt(0);
        char l= lasName.charAt(0);
        String initial = f+ "."+l;
        System.out.println(initial);

scan.close();
    }
}
