package day16LoopPractice;

/**
 *  write a program that can return the frequency of the a word Java from the sentence
 *
 *         Ex:
 *             sentence = "Java Java";
 *
 *             output:
 *                 2
 *
 *             Hint: you need to create create all the possible substrings with
 *             3 characters from the given string and then count how many
 *             of those substrings are equal ( equalsIgnoreCase ) to dog and cat
 * substring(i, i+3)
 */

public class task5 {
    public static void main(String[] args) {
        String str= "Java Java java java java";
        str=str.toLowerCase();

        int count= 0;

//        System.out.println(str.substring(0, 4));

        for (int i = 0; i <str.length()-3 ; i++) {
            if(str.substring(i,i+4).equals("java")){
                count++;
            }
        }

        System.out.println(count);
    }
}
