package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str= scan.nextLine();
        if(str.length()==5){
           char ch1 = str.charAt(0);
           char ch2 = str.charAt(1);
            char ch3 = str.charAt(2);
            char ch4 = str.charAt(3);
            char ch5 = str.charAt(4);
            System.out.println(""+ch5+ch4+ch3+ch2+ch1);}
        else if(str.length()<5){
            System.out.println("Too short");
        }
        else {
            System.out.println("Too long");}

        scan.close();
    }
}
