package day16LoopPractice;

public class Palindrome {
    public static void main(String[] args) {
        //racecar ,level,mom,dad,anna,level,etc
        String word = "Level";
        String reverced = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverced += word.charAt(i);
        }
        boolean ispalindrome = (word.equalsIgnoreCase(reverced)) ;
        System.out.println(ispalindrome);

        }
    }
