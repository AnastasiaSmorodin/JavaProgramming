package day8_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {
    public static void main(String[] args) {
        int score= 80;
        boolean a = score >= 90 &&  score <= 100;
        boolean b = score >=80 && score <= 89;//or you can say not a !a
        boolean c = score >= 70 && score <=79 ;// or !a && !b && score<=70
        boolean d = score >= 60 && score<=69;//
        boolean f = score >=0 && score<=59; //!a && !b && !c && !d

       if(a){ System.out.println("Excellent");}

       if(b)  {System.out.println("Great");}

        if(c) {System.out.println("Good");}

       if (d) { System.out.println("Passed");}

       if (f) {System.out.println("Failed");}


    }
}
