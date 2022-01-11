package day8_IfStatements;

public class GradeREport2 {
    public static void main(String[] args) {
        int grade = 400;
        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("Excellent");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("Great");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("Good");
            } else if (grade >= 60 && grade <= 69)
            {System.out.println("Passed");}
            else if (grade<=59)
                System.out.println("Failed");
        }
          else {
            System.out.println("Invalid entry");}

        }
    }







