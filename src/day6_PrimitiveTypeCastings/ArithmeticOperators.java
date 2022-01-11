package day6_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+20);
        System.out.println(100-50);
        System.out.println(10*6);

        System.out.println(100/3);//dast toliko tseloe 4islo
        //4tob polu4iti rezulitat dobavi .0 ptimer 100.3
        System.out.println(100.0/3.0);

        int a =100;
        double b =a/6; //16.0
        System.out.println(b);
        double c = a/6d;
        System.out.println(c);//16.6666

        System.out.println(100D);
        short e = 10;
        System.out.println(e%3);//prints remainder witch is 1;
        System.out.println(50%8);//prints the remainder 2;
        int num1= 10;
        int num2= 3;
        int division= num1/num2;//division variable contains the result of num 1/num2
        int remainder =num1%num2;//gives remainder;
        System.out.println("remainder = " + remainder);
        System.out.println("division = " + division);
        System.out.println(num1+ " divide by "+ num2 + " is equal to " + division +
                 " remainder of " + remainder);
        // print statement 10 divide by 3 is equal to 3 with a remainder of 1












    }
}
