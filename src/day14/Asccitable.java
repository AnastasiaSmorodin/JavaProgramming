package day14;

import java.util.Scanner;

public class Asccitable {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the word");
        String word= scan.next();
        scan.close();
        String result= "";
        char firstchar= word.charAt(0);
        if(firstchar>='0' && firstchar<='9') {
            result = "first character is digit";
        }else if(firstchar>= 'a' && firstchar<= 'z') {
            result = " first character is lower case letter";
        } else if(firstchar>= 'A'&& firstchar<='Z'){
            result= " fisrt character is upper case letter";}
        else{
            result= "invslid entry";


        }


    }
}


