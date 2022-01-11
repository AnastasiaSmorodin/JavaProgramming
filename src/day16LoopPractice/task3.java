package day16LoopPractice;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first positive number");
        int first = scan.nextInt();
        System.out.println("enter second positive number");
        int second = scan.nextInt();
        int count;

        for (int i = 0; i < 2; i++) {
            if (first > 0 || second > 0) {
                System.out.println(i++);}
                else {
                    System.out.println("Invalid");

                }

            }
        }
    }

