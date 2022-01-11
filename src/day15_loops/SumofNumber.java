package day15_loops;

import java.util.Scanner;

public class SumofNumber {
    public static void main(String[] args) {

        double sum=0;
        for (int i = 1; i <101; i++) {
            sum+=i;}
        System.out.println(sum);
        System.out.println("__________________________________-");

        int total=0;
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ener a number");
            total+= scan.nextInt();


        }

        System.out.println("total="+total);
        scan.close();

    }
}
