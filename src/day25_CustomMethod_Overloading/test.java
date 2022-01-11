package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str= "Java programming language";
        StringUtility.printEachchar(str);
        String str1="Wooden Spoon";
        StringUtility.reverse(str1);
        System.out.println(StringUtility.reverse(str1));
        String word="level";
       boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        String[]names= {"Anna", "Java", "Racecar","Mam"};
        int count=0;
        for (String each:names){
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        String str3= "abbccddnnsvvv";
        System.out.println(StringUtility.removeDuplicates(str3));


    }



}
