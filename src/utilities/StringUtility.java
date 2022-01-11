package utilities;

import java.util.Arrays;

public class StringUtility {
    public static void main(String[] args) {

    }
    public static void printEachchar(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));

        }
    }
    //prints each character of string in new line
    public static String reverse(String str){
        String result= "";
        for (int i =str.length()-1; i >=0; i--) {
            result+=str.charAt(i);

        }
        return result;
    }
    //reversing the string

        public static boolean isPalindrome(String str){
            return reverse(str).equalsIgnoreCase(str);
        }
    //checks if the given string is palindrome ,returns true or false
        public static boolean anagram(String str1, String str2){
        char[]ch1= str1.toCharArray();
        char[]ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
           return  Arrays.equals(ch1,ch2);
        }
        //cheks if string is anagram ,returns boolean

       public static String removeDuplicates(String str){
           String result = "";
           for (int i = 0; i < str.length(); i++) {
               String ch = "" + str.charAt(i);
               if (result.contains(ch)) {
                   continue;
               }
               result += ch;
           }
           return result;

       }
       //remove duplicated characters from string
    }





