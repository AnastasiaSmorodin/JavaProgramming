package day20Array;
/*
 given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */

public class Age {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        String result="";

        grades[0]='A'; grades[1]='C'; grades[2]='B';
        //char[] grades={'A','C','B'}
        for (int i = 0; i < names.length ; i++) {
            result+=names[i]+"'s score is " +scores[i]+", and grade is "+grades[i]+"\n";

        }
        System.out.println(result);



    }
}
