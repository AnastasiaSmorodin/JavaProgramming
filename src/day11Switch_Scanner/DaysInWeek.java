package day11Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 7;
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
               break;
            default:
                System.out.println("Invalid entry");




        }


    }
}
