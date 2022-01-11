package day20Array;
/*

	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */

import java.util.Arrays;

public class ReverseStringAndCreateNEwone {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        int[]newarray=new int[numbers.length];
        int count=0;
        for (int i = numbers.length-1; i >=0; i--) {
           newarray[count]= numbers[i];
           count++;
        }
        //for(int i=0,j=numbers.lngth-1; i<numbers.length&&j>=0; i++;j--{
        //newarray[i]=numbers[j]
        //sout(arrays.toString(newarray));
        System.out.println(Arrays.toString(newarray));
    }
}
