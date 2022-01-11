package day21ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[]chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (char each:chars){
            System.out.println(each);
        }

        System.out.println("________________________");
        String sentence= "Wooden Spoon";
        String[]words =sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String email = "anastasiasmorodin@gmail.com";
        String[]words2 =email.split("@");
        System.out.println(Arrays.toString(words2));
     String s= "Today is a good day.Today is monday. Today we learn java";
     String[]sentences= s.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }
}
