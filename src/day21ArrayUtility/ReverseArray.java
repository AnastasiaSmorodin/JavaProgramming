package day21ArrayUtility;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50};
        int[]reversed= new int[numbers.length];
        //to make sure it can comntain all the elements
       // reversed[0]=numbers[3];
      //  reversed[1]=numbers[2];
       // reversed[2]=numbers[1];
      //  reversed[3]=numbers[0];

        for (int i = numbers.length-1, j=0; i >=0; i--, j++) {
            reversed[j]=numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}
