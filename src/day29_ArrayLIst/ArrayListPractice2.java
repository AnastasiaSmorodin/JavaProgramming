package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String>employees= new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmed","Jimmy","Daniel","Aaron"));
        employees.retainAll(Arrays.asList(employees,"Ahmed","David"));
        System.out.println(employees);
        System.out.println("______________________________");
        String [] names= {"Mary","Monica","Mehray","Musti","Hasan","Beril"};
        ArrayList<String> list= new ArrayList<>(Arrays.asList(names));
       list.removeIf(p-> p.startsWith("M"));

       names= list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));






    }
}
