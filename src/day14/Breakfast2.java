package day14;

import java.util.Scanner;

public class Breakfast2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();

        String result= word.replace("X","a");
        result=result.replace("x","a");
        System.out.println(result);
    }
}
