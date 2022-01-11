package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get (i)*2);// getting element from specific index
        }

        System.out.println(list);
        System.out.println("______________________________________");
        ArrayList<String>employees= new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(2);
       boolean r1 =employees.remove("Hulya");
        System.out.println(employees);
        System.out.println(r1);


    }
}
