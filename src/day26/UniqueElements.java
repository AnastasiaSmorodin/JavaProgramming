package day26;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[]array={1,1,2,3,3,4,5,5,6,7,8,9,9,9,9,};
        int[]unique= uniqueElements(array);
        System.out.println(Arrays.toString(unique));
    }


    public static int[] uniqueElements(int[] array ){
        int[] result={};
        for(int each: array){
            if(ArraysUtility.frequencyOfElement(array,each)==1){
              result =ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}