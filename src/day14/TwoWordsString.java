package day14;

import java.util.Scanner;

public class TwoWordsString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1= scan.next();
        System.out.println("Enter your second word");
        String word2= scan.next();
        if(word1.charAt(word1.length()-1)==word2.charAt(0)) {
            System.out.println(word1 + word2.substring(1, word2.length()));
        }else{
            System.out.println(word1+word2);
        }
scan.close();
    }
}
