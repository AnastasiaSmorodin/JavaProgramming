package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println("_______________________");
        ArrayList<Integer>list2= new ArrayList<>();
        list2.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        list2.retainAll(Arrays.asList(100,200,300));
        System.out.println(list2);
        System.out.println("__________________________________________");
        ArrayList<String> jobtitles = new ArrayList<>();
        jobtitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master","BA","BA"));
        jobtitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobtitles);
        System.out.println("____________________________________________");

        ArrayList<Integer>nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1= nums.contains(10);
        boolean r2= nums.contains(2)&& nums.contains(5)&& nums.contains(10);
        boolean r3= nums.containsAll(Arrays.asList(2,5,1000));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("___________________________________");
        String[] names= {"Josh","Jack","Daniel","Shay","Breanna"};
       // ArrayList<String> namesList= new ArrayList<>();
       // namesList.addAll(Arrays.asList(names));
        ArrayList<String> namesList= new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        System.out.println("__________________________________");
        Integer[] arr= {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list3);







    }
}
