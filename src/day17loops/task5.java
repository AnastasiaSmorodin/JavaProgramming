package day17loops;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to reserve the room?Yes/no");
        String answer = scan.next();

        String result = "";
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Re-enter a valid entry.Answer should be yes or no.");
            System.out.println("Would you like to reserve a room? ");
            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("What type of room you prefer");
            String room = scan.nextLine();
            scan.nextLine();

            while (!(((room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("Queen bed") ||
                    room.equalsIgnoreCase("single bed"))))) {
                System.out.println("Invalid room choice.Re-enter");
                System.out.println("Enter prefered room");
                scan.nextLine();

                if (room.equalsIgnoreCase("king bed")) {
                    System.out.println("total is 120$");
                } else if (room.equalsIgnoreCase("queen bed")) {
                    System.out.println("total is 100$");
                } else {
                    System.out.println("total is 80$");
                } }
            } else{
                System.out.println("Have a nice day");
            }

            }
        }





/*
. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)

 */