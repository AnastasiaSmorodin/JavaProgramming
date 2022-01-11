package day13_String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word number one");
        String word1= scan.next();
        System.out.println("Enter word number two");
        String word2= scan.next();
        System.out.println("Enter word number three");
        String word3= scan.next();
        int word1char= word1.length();
        int word2char= word2.length();
        int word3char= word3.length();
        if(word1char == word2char && word2char== word3char){
            System.out.println("All words are same lenght");}
            else if(word1char != word2char && word2char != word3char && word1char!=word3char){

          System.out.println(" All different lenght");
        } else {
        System.out.println("Not same nor Different lenghts");}
            scan.close();
    }
    }


