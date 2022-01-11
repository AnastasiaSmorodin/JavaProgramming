package day8_IfStatements;
// && || and !

public class logicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";
        //                   19>=18  true && "UK" == "USA" false//false is final
        System.out.println(name + " is eligible to vote " + isEligible);//true
        System.out.println("_________________________");

        String name2 = "Josh";
        int creditScore = 712;
        String isEmployed = "Yes";
        int age2 = 33;
        boolean  isEligible2= age2 >=21 && creditScore >=700 && isEmployed =="Yes";
        System.out.println(name2 + " is eligible for loan " + isEligible2);
        System.out.println("____________________");
        
        String name3 = "Ana";
        int age3 = 21;
        char gender = 'M';
        boolean isEligible3 = age3>=18 && (gender == 'M' || gender == 'F');
        System.out.println("isEligible3 = " + isEligible3);

        String name4 = "James";
        String countryOgbirth = "UK";
        boolean marriedToUsCitizen = false;
        boolean isEligible4 = countryOgbirth =="USA" || marriedToUsCitizen ==true;

        System.out.println(name4  + "is eligible to apply for citizenship " +isEligible4);

        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa>=3.5 || familyIncome<=60000;
        System.out.println(student + " is eligible for scholarship : " + isEligible5);

        boolean result2 = true;
        boolean resul3 = !result2;
        System.out.println(result2);


        int score = 85;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed =" +passed );
        System.out.println("failed = " + failed);


        








    }
}
