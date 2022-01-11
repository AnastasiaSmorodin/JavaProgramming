package day13_String;

import java.util.Scanner;

public class SameorNot {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your sentence");
        String n1= scan.nextLine();
        char Firstchar= n1.charAt(0);
                char Lastchar=n1.charAt( n1.length()-1);
                if (Firstchar==Lastchar) {
                    System.out.println("same");
                }else{
                    System.out.println("not the same");
                }
scan.close();
    }
}
