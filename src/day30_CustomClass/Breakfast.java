package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Breakfast {
    public static void main(String[] args) {
        //1. write a program that
        // can swap the first and last elements of an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
           int size= numbers2.size();
           numbers2.removeAll(Arrays.asList(0));
           int newSize=numbers2.size();
           int totalZeroes= size-newSize;
        System.out.println(totalZeroes);
        for (int i = 0; i <totalZeroes ; i++) {
            numbers2.add(0);
        }
        System.out.println(numbers2);
        System.out.println("________________________________");
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character>chars= new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character>letters=new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character>digit=new ArrayList<>(chars);
        digit.removeIf(p-> !Character.isDigit(p));
        System.out.println("digit = " + digit);

        ArrayList<Character>special=new ArrayList<>(chars);

        special.removeAll(letters);
        special.removeAll(digit);
        System.out.println("special = " + special);







            }
        }




