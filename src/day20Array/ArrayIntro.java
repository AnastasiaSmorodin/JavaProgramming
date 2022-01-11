package day20Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        //create a variable capable to contain 5 names
        String[] myGroup= new String[5];
        myGroup[0]= "Gunay";
        myGroup[1]= "Neira";
        myGroup[2]= "Suat";
        myGroup[3]= "Hulya";
        myGroup[4]= "Mikael";


        System.out.println(Arrays.toString(myGroup));
        System.out.println("_________________________________");
        Scanner scan = new Scanner(System.in);
        String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday",
        "Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        int num= 5;
        if(num<1 || num>7){
            System.out.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[num-1]);

    }

}
