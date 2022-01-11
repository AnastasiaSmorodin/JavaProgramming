package day28_ArrayList;



import java.sql.Array;
import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
              numbers.add(10);
              numbers.add(20);
              numbers.add(30);
              numbers.add(40);
              numbers.add(50);
              numbers.add(60);//adds the data after the last index;
        System.out.println(numbers);
        numbers.add(2,25);//25 is inserted to index 2
        System.out.println(numbers);
        numbers.add(5,45);
        System.out.println(numbers);
        System.out.println(numbers.size());
        int lastindex= numbers.size()-1;
        System.out.println("lastindex = " + lastindex);
        Integer num= numbers.get(3);
        System.out.println("num = " + num);
        System.out.println("___________________________________");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("_________________________________________");
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        System.out.println(list);
        list.set(2,"JavaScript");
        System.out.println(list);

    }
}
