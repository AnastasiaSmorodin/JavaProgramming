package day13_String;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String word= scan.next();
        int wordLenght = word.length();
        char letter= word.charAt(1);

        if(word.length()==3) {
            if (letter == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            }
        }else if(word.length()<3) {
            System.out.println("Too short");
        } else {
            System.out.println("Too long");}

scan.close();
            }





        }




