package day8_IfStatements;

public class PracticeTaskIfElse {
    public static void main(String[] args) {
        int a = 50, b = 100;
        if (a > b) {
            System.out.println(a + " Is a maximum number");
        } else {
            System.out.println(b + " Is a maximum number");
        }
        if (a < b) {
            System.out.println(a + " Is a minimum number");
        } else {
            System.out.println(b + " Is a minimum number");
        }

        System.out.println("__________________");

        int age = 10;
        if (age >= 21) {
            System.out.println("Is able to buy alcohol");
        } else {
            System.out.println("Is not able to buy alcohol");
        }
        System.out.println("________________");

        int age2=17;
        String citizenship = "USA";
        boolean isEligible = age2>=18 && citizenship=="USA";

        if(isEligible){
            System.out.println("Is elegible to vote");}else{
            System.out.println("Is not eligible to vote");}
        }



        }











