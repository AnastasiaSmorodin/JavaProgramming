package day17loops;

import java.util.Scanner;

public class BranchingStatments {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            if (i == 'F') {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("___________________________________");

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number");
            int num= scan.nextInt();
            if(num<0){
                break;
            }
            }
        }
    }

