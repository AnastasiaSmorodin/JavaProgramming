package day14;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter word");
        String word= scan.next();
       String lasttwo= word.substring(word.length()-2);
       if(lasttwo.equals("ly")){
           System.out.println("Really?");}
           else{
           System.out.println("Nevermind");



        }
    }
}
