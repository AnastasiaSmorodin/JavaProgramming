package day20Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[]letters= new char[26];
      //  for (int i =0 ,j='A'; i <=letters.length-1 ; i++,j++) {
       //     letters[i]=(char)j;
     //   }
      //  System.out.println(Arrays.toString(letters));
        char ch = 'A';

        for (int i = 0; i < letters.length ; i++ ) { // or here ch++
            letters[i] = ch; // or letters[i] = ch++;
            ch++ ; //
        }
        System.out.println(Arrays.toString(letters));

        char ch1= 'A';
        for (int i = 0; i <letters.length ; i++) {
            letters[i]=ch1++;

        }
        System.out.println(Arrays.toString(letters));

    }
}
