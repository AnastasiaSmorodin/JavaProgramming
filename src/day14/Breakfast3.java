package day14;

import java.util.Locale;
import java.util.Scanner;

public class Breakfast3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String first= scan.next();
        System.out.println("Enter your last name");
        String last= scan.next();
       first= first.substring(0,1).toUpperCase()+ first.substring(1).toLowerCase();
       last= (""+last.charAt(0)).toUpperCase()+last.substring(1).toLowerCase();
        System.out.println(first+ " "+last);




    }
}
