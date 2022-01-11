package day33;

import java.util.Scanner;

public class homeprctice {
    public static void main(String[] args) {
        //ask user to enter two words . Then add them together and print.
        // But if the last letter of the first word and the first letter of the last letter is the same,
        //        print that character once.
        //        Input:one eigh
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first word");
       String word1= scan.next();
        System.out.println("Enter second word");
        String word2= scan.next();


        if(word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(""+word1.substring(0,word1.length()-1)+ word2);
        }else{
            System.out.println(word1+word2);
        }

    }
}
