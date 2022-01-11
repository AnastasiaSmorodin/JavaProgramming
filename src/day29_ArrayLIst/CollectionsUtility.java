package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("________________________");
        ArrayList<Character>list2= new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        Collections.reverse(list2);
        System.out.println(list2);
        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,4,1);
        System.out.println(list3);
        System.out.println("_________________________");
       int max=  Collections.max(list3);
        int min= Collections.min(list3);
        System.out.println(max);
        System.out.println(min);
        System.out.println("______________________________");
        ArrayList<Integer>list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,100);
        System.out.println(list4);
       int freq= Collections.frequency(list4,100);
        System.out.println(freq);




    }
}
