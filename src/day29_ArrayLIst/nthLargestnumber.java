package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestnumber {
    public static void main(String[] args) {


    /*
     write a program that can return the nth largest number from an arraylist
             arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
            n = 5   output:4
                 */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n=7;//7 po s4etu maximalinii nomer
        for (int i = 1; i <n ; i++) {
            list.removeIf(p->Collections.max(list)==p);

        }
int max= Collections.max(list);
        System.out.println(max);

        }



    }

