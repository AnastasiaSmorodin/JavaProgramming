package day8_IfStatements;

public class NestedIf2 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasId = true;
        if (hasId) {
            if (age >= 21) {
                System.out.println("Elegible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }

        } else {
            System.out.println("You must have ID to buy alcohol");
        }
        System.out.println("________________________________-");
        int number = 7;
        if (number <= 7 && number >= 1) {
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }


        } else {
            System.out.println("Invalit number");
        }
    }
}

