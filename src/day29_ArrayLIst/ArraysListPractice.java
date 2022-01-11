package day29_ArrayLIst;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListPractice {
    public static void main(String[] args) {
        String[] countries= {"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
        ArrayList<String> list= new ArrayList<>(Arrays.asList(countries));//converting array to arraylist
        list.removeIf(p-> p.length()>=10);
        //converting arraylist back to Array
      countries=  list.toArray(new String[0]);//you van put any number
        System.out.println(Arrays.toString(countries));


    }
}
