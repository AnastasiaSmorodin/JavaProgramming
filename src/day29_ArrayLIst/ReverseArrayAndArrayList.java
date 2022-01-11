package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6};
        int[]result=new int[array.length];
        int j= 0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("_____________________________");

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        ArrayList<Integer> reverse= new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            int each= list.get(i);
            reverse.add(each);
        }
        System.out.println(reverse);



    }
}
