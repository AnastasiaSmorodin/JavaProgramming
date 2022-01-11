package day13_String;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your sentence");
        String sentence= scan.nextLine();
        char  Firstchar= sentence.charAt(0);
        char lastChar = sentence.charAt(  sentence.length()-1);

        System.out.println(Firstchar);
        System.out.println(lastChar);
        scan.close();
    }
}
