package day23CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven90(10);//the method need additional info to comleteits task
        ageOfPerson(1992);
        xToY('A','Z');
    }


    public static void oddOrEven90(int number) {
        if (number % 2 == 0) {
            System.out.println(number + ":is even number");
        } else {
            System.out.println(number + ":is odd number");
        }


    }

    public static void ageOfPerson(int birthYear) {
        int age = 2021 - birthYear;
        System.out.println("Your age is:" + age);
    }

    public static void xToY(char x, char y) {

        for (char i = x; i <= y; i++) {
            System.out.print(i + " ");
        }

    }
}
