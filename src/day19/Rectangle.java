package day19;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //area=w*l , p=2*(w+l)
        double area = 0;
        double width = 0;
        double length = 0;
        double perimiter = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the rectangle");
            length = scan.nextInt();
            if (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the rectangle");
            width = scan.nextInt();
            if (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }
            area = width * length;
            perimiter = (2 * (width + length));
            System.out.println("Area of rectangle is:" + area);
            System.out.println("Perimiter of rectangle is:" + perimiter);

            System.out.println("would you like to calculate another rectangle");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry,  re-enter  a valid entry");
                answer = scan.next();}

                if (answer.equals("no")) {
                    break;
                }

            }
        System.out.println("Thank you for using calculator");

        /*
         Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program
				after displaying the error message "Invalid Entry for the length of the rectangle"

	2. Ask the user "Enter the width of the Rectangle:"
	if user enters 0 or negative numbers, terminate the program after
	displaying the error message "Invalid Entry for the width of the rectangle"
3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

			Hint: Ones Uzun knows all the formulas you need for this task
         */
        }
    }

