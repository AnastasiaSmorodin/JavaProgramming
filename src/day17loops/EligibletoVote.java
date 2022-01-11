package day17loops;

import java.util.Scanner;

public class EligibletoVote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();//valid age 1-120;


        while(!(age<=120 && age>=1)){
            System.out.println("Invalid entry please re-enter");
            System.out.println("Enter your age");
            age= scan.nextInt();
        }
        System.out.println("Are you a US citizen");
        String usCitizen= scan.next();
        while(!(usCitizen.equalsIgnoreCase("yes")|| usCitizen.equalsIgnoreCase("no")))
        { System.out.println("Invalid entry please re-enter");
            System.out.println("Are you a US citizen");
            usCitizen=scan.next();
        }
    }
}

