package day8_IfStatements;

public class TernariesIntro {
    public static void main(String[] args) {
        int number = 100;
        if(number %2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("___________________");

        String result1 =(number%2==0)? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("____________________-");

        int age=23;
        String result2 = (age>=21)? "Eligible" : "Not eligible";
        System.out.println(result2);
        System.out.println("_______________________");

        int n=0;
        String result3= (n>0)? "Positive" :(n<0)? "Negative" :"Zero";
        System.out.println(result3);
        /* if (number>0) {
        System.out.println("Positive")} else if and etc
        We are using it to make it shorter
        (condition)?  if else :(condition)?  :(condition)
         */

    }
}
