package day13_String;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String sentence = scan.nextLine();
        scan.close();

        int sentenceLength = sentence.length();
        String result = "";
        if (sentenceLength ==0){
            result = "String is empty";
        }else if( sentenceLength <=3){
            result = sentence;
        }else{
            result = ""+ sentence.charAt(sentenceLength -3) + sentence.charAt(sentenceLength-2)+
                    sentence.charAt(sentenceLength-1);
        }
        System.out.println(result);



        }
    }

