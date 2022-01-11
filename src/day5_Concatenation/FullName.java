package day5_Concatenation;

import javax.lang.model.SourceVersion;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Anastasia";
        String lastName = "Smorodin";
        String fullName = firstName + " " + lastName;
        int age = 29;
        String jobtitle = "SDET";
        String companyName = "Apple";
        double salary = 100000.58;

        System.out.println(fullName);
        System.out.println("Full name of the person is " + fullName);
        System.out.println( fullName + " is " + age + " years old ");
        System.out.println( fullName +" is " + jobtitle + " works at " + companyName
                +  " , and " + fullName + " salary is " + salary);





    }
}
