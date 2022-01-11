package day8_IfStatements;

public class NestedIf {
    public static void main(String[] args) {
        int score = 95;
        if (score > 0 && score <= 100) {//if the score is valid like not 400
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");


            }
        }

    }
}

