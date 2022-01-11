package day14;

import java.util.Scanner;

public class TwoWordstogether {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1= scan.next();
        System.out.println("Enter the second word");
        String word2= scan.next();
        char word1x= word1.charAt(0);
        char word2x= word2.charAt(word2.length()-1);
        if (word1x==word2x){
            System.out.println(word1x+word2x-word2.charAt(0));}
        else{
            System.out.println(word1+word2);

        }
    }
}
