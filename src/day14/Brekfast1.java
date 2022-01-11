package day14;

import java.util.Scanner;

public class Brekfast1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();
        String result1= word.replaceFirst("x","a");

        if(word.charAt(0)=='x' ){
            System.out.println(result1);} else{
            System.out.println(word);





        }

    }
}
