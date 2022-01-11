package day20Array;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] elements={10,20,50,70};//size is 4 elements
        System.out.println(Arrays.toString(elements));
        System.out.println("___________________");
        int[]scores= new int[5];
        scores[1]=85;//we asign 85 to index 1 of array
        scores[scores.length-1]=95;//or scores.lenght-1 to find the last indez
        scores[3]=75;
        scores[2]=55;
        scores[0]=65;
        System.out.println(Arrays.toString(scores));
        System.out.println("____________________________");
        String[]month= {"January","February","March","April","May","June",
        "July","August","September","October","November","December"};
        System.out.println(month[0]);//jan
        System.out.println(month[1]);//feb
        for (int i = 0; i < month.length; i++) {//i is index numbers

        System.out.println(month[i]);}
        for (int i = month.length-1; i >=0 ; i--) {

        System.out.println(month[i]);}

    }
}
