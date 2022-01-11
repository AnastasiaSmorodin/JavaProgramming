package day24CustomMethodsReturn;
/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */

import java.util.Arrays;

public class lunch {
    public static void main(String[] args) {

        System.out.println(frequency("Java Java  Java love you much", "Java"));
        String a = "abc";
        String b = "bac";
        System.out.println(isAnagram(a, b));
        String str1 = "level";
        System.out.println(reverse(str1));
        System.out.println(isPalindrome(str1));
        int[] array ={1,1,1,1,1,2,2,3,3,3};
        System.out.println(frequencyOfnumber(array,3));
    }

    public static int frequency(String sentence, String word) {
        int frequency = 0;

        for (int i = 0; i < sentence.length() - word.length(); i++) {
            if (sentence.substring(i, i + word.length()).equalsIgnoreCase(word)) {
                frequency++;
            }

        }
        return frequency;
    }

    /*create a method named isAnagram that passes two String parameters,
    the method returns true if the given two strings are anagram,
    otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";
isAnagram(str1, str2) ====> true
     */
    public static boolean isAnagram(String word1, String word2) {
        int count = 0;
        boolean result = false;
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == word1.length() && count == word2.length()) {
            result = true;
        }
        return result;
    }
    /*
    3. create a method named reverse that passes one string parameter,
    the method can return the reversed string
     */

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i) + "";


        }
        return reverse;
    }

    //4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter,
    // the method returns true if the string is palindrome, otherwise returns false
    public static boolean isPalindrome(String str) {
        boolean result = false;
        if (str.equalsIgnoreCase(reverse(str))) {
            result = true;

        }
        return result;
    }

    // create method that accepts one integer array
    // and one integer number and returns the frequency of the number
    public static int frequencyOfnumber(int[] arr, int num) {
        int count = 0;
        for (int each : arr) {    //each stands for every single element from array like "cydeo"
            count = 0;
            for (int element : arr) {
                if (element == num) {
                    count++;
                }
            }
        }
        return count;
    }

}
