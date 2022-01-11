package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
       // write a program that asks user
       // to enter two strings, and print out the longest string
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string");
        String string1= scan.nextLine();
        System.out.println("Enter 2 string");
        String string2= scan.nextLine();
        int totalChars1 = string1.length();
        int totalChars2 = string2.length();
        if(totalChars1>totalChars2){
            System.out.println(string1);
        } else {
            System.out.println(string2);
        }
        scan.close();
    }
}
