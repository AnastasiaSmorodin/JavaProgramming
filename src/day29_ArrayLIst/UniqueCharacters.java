package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "aaabcccdeeef";
        String[] arr= str.split("");// to ptint each character

        ArrayList<String>list= new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        String unique="";
        for(String each: list){
           int freq= Collections.frequency(list,each);
            if(freq==1){
                unique+=each;

            }
        }

        System.out.println("unique = " + unique);
    }
}
