package day29_ArrayLIst;

import java.util.ArrayList;

public class ArraytoArraysList {
    public static ArrayList<Integer> converArraytoArrysList(int[]array){
        ArrayList<Integer>list= new ArrayList<>();
        for (int each: array) {
              list.add(each);


        }
        return list;
    }
}
