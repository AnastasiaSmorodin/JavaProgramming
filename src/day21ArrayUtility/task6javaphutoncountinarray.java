package day21ArrayUtility;

import java.util.Arrays;

public class task6javaphutoncountinarray {
    public static void main(String[] args) {
        /*
        6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)
 */      String str="What's the difference between java,  and python?";
        String[]words =str.split(" ");
        System.out.println(Arrays.toString(words));
        int javaCount=0;
        int pythonCount=0;
        for (String each : words) {
            if(each.contains("java")){
                javaCount++;
            }
            if(each.contains("python")){
                pythonCount++;
            }

        }
        System.out.println(javaCount==pythonCount);




    }
}
