package day16LoopPractice;

import java.util.Locale;
import java.util.Scanner;

public class Task9part2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.nextLine();
        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);
        int count=0;
        str=str.toLowerCase();


        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)==ch){
                count++;
            }


        }
        System.out.println(count);
    }
}
/*
2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */