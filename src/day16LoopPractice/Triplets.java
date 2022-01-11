package day16LoopPractice;


import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2) &&
                    str.charAt(i+1)==str.charAt(i+2)){
                count++;
            }
        }
        System.out.println(count);
    }
}

