package day23CustomMethods;

import java.util.Arrays;

public class DinnerTasks {
    public static void main(String[] args) {
        OddNumbers(1, 100);
        System.out.println("\n" + "_________________________");
        Evennumber(1, 100);
        eligible(40);
        VoteorNot(17, "Canada");
        GradeCalculator(70);
        areaOfThecircle(15);
        areaOftheSquare(15);
        convertertoEuros(100);
        dollarToLira(100);
        kgToPounds(76);
        poSitivNegative(-100);
        printEachChar("Today is a good day");

    }

    public static void OddNumbers(int x, int y) {
        for (int i = 1; i <= 100; i++)
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
    }

    public static void Evennumber(int x, int y) {
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
    }

    public static void eligible(int age) {
        if (age >= 21) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

    }

    public static void VoteorNot(int age, String citizenship) {
        if (age >= 18 && citizenship.equals("USA")) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("not eligible to vote");


        }
    }


    public static void GradeCalculator(int score) {
        String grade = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ?
                "Good" : (score >= 60) ? "Passed" : "Failed";
        System.out.println(grade);

    }

    public static void areaOfThecircle(double radius) {
        double Pi = 3.14;
        double area = radius * Pi;
        System.out.println("Area of the circle is:" + area);

    }

    public static void areaOftheSquare(double side) {
        double area = side * side;
        if (side <= 0) {
            System.out.println("Invalid entry");
        } else {
            System.out.println("Area of the square is:" + area);
        }


    }

    public static void convertertoEuros(double dollar) {
        double euro = dollar * 1.13;
        System.out.println(dollar + " dollar" + "is " + euro + " euro");
    }

    public static void dollarToLira(double dollar) {
        double lira = dollar * 13.88;
        System.out.println(dollar + " dollar is " + lira + "liras");
    }

    public static void kgToPounds(double kg) {
        double pound = kg * 2.205;
        System.out.println(kg + " kg is" + pound + " pounds");
    }

    public static void poSitivNegative(int number) {
        String result = (number > 0) ? "Number is positive" : (number < 0) ? "Number is negative" :
                (number == 0) ? "Number is 0" : "Invalid entry";
        System.out.println(result);
    }

    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            String result = "";
            result += str.charAt(i) + " ";
            System.out.println(result);
        }

    }

}





















