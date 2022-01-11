package day14;

import java.util.Scanner;

public class WothwithX {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("enter the word");
        String word= scan.next();
        char first= word.charAt(0);
        String xless= word.substring(1);
        if( first =='x'){
            System.out.println(xless);
        } else{
            System.out.println(word);
        }
    }
}
