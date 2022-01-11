package day8_IfStatements;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s=50;
        String result = (s<=100 && s>=0)? (s>=60)? "Passed":"Failed" :"Invalid score";
        System.out.println(result);
        // nested if ternarie will be the last one in the end
        System.out.println("_____________________");

        int s2= 40;
        String result2=  (s2>=0 && s<=100)? (s2>=90)? "Excellent" :(s2>=80)? "Great"
                :(s2>70)? "Good" : (s2>60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result2);




    }
}
