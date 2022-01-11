package day20Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //create a variable that can contain 26 characters
        char[] alpabets = new char[26];//Z-A
        //alpabets[0]= 'Z';//90 on ascchi table
        //alpabets[1]='Y';//89
        // alpabets[2]='X'//88
        //       i-index number //j char
       char ch = 'Z';
        for (int i = 0; i < alpabets.length; i++, ch--) {
      alpabets[i]=ch;
        }
        System.out.println(Arrays.toString(alpabets));

        //for(char i= 0, j='Z'; i<alpabets.length; i++,j--){
       //        alpabets[i]=j;



    }

}

