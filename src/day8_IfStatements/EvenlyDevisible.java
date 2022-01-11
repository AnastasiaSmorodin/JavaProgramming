package day8_IfStatements;

public class EvenlyDevisible {
    public static void main(String[] args) {
        int number = 65;
        boolean divisibleBy2 = number % 2==0;
        boolean divisibleBy3 = number % 3==0;
        boolean divisibleBy5 = number % 5==0;
        System.out.println(number+ " is divisible by 2 :" + divisibleBy2);
        System.out.println(number+ " is divisible by 3 :" + divisibleBy3);
        System.out.println(number+ " is divisible by 5 :" + divisibleBy5);

        // Write a programm that can check if a number is evenly divisible by 2,3,5
        //ex:
        // number =65;
        // output:
        //65 is divisible by 2: false
        //65 is divisible by 3: false
        //65 is divisible by 5: true





    }
}
