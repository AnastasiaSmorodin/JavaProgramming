package day13_String;


import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Split check");
        String split = scan.next();
        System.out.println("Enter the number of people");
        int people = scan.nextInt();
        System.out.println("Enter the check amount");
        double check = scan.nextDouble();
        System.out.println("How was the service quality");
        String quality = scan.next();


        double tip = (quality.equals("Excellent")) ? check * 25 / 100 :
                (quality.equals("Great")) ? check * 20 / 100 :
                        (quality.equals("Good")) ? check * 15 / 100 :
                                (quality.equals("Fair")) ? check * 10 / 100 :
                                        (quality.equals("Poor")) ? check * 5 / 100
                                                : 0;

        double totaltopay = check + tip;
        double totalperperson = totaltopay / people;
        double tipperperson = tip / people;


        if (split.equals("yes")) {
            System.out.println("Number of people entered: " +people);
            System.out.println("Total to pay :" + totaltopay);
            System.out.println("Total tip: "+ tip);
            System.out.println("Total per person :"+ totalperperson);
            System.out.println("Tip per person :"+ tipperperson);

        }  else {
            System.out.println("Total to pay: "+totaltopay);}









    }
}
