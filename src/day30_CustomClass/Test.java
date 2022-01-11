package day30_CustomClass;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
      /*
      1. write a program that can check if the first and last characters of the string are same
            */
        String str = "cosmos";
        char str1 = str.charAt(str.length() - 1);
        char str2 = str.charAt(0);
        System.out.println(str1 == str2);
        //2. write a program that can return the initials of the user
        String first = "anastasia";
        String last = "smorodin";
        System.out.println(first.toUpperCase().charAt(0) + "." + last.toUpperCase().charAt(0));
     /*
     3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
      */
        String pr = "I love you";

        if (pr.length() == 0) {
            System.out.println("String is epmty");
        } else if (pr.length() > 3) {
            System.out.println("" + pr.charAt(pr.length() - 3) + pr.charAt(pr.length() - 2) + pr.charAt(pr.length() - 1));
        } else if (pr.length() <= 3) {
            System.out.println(pr);
        }

/*
4. write a program that asks the user enter a three letter word.
Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a'
 print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 letter word");
        String word = scan.next();
        if (word.length() == 3) {
            if (word.charAt(1) == 'a') {
                System.out.println("cool word");
            } else {
                System.out.println("okay word");
            }
        }else if(word.length()<3){
                System.out.println("too short");
            }else{
                System.out.println("Too long");
            }
        }

    }






