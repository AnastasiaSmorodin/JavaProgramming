package day17loops;


import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name:");
        String u = scan.next();

        System.out.println("Enter the password:");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter the username:");
                u = scan.next();

                System.out.println("Enter the password:");
                p = scan.next();
                attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }

        }
        scan.close();
    }
}








        //username:Cydeo password:Cydeo123
        /*
        you are writing a code for the log-in function of the Cydeo Application,
         assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have
                three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
         */




