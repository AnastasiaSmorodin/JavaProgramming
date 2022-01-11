package day7_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //>,>=, <,<= ;
        boolean result1 = 20>40;
        System.out.println("result1 = " + result1);
        boolean result2 = 20>=10;
        System.out.println("result2 = " + result2);
        boolean result3 = 20<10;
        System.out.println("result3 = " + result3);
        boolean result4 = 10<=10;
        System.out.println("result4 = " + result4);
        System.out.println("_______________-");
        
        int creditScore = 745;
        boolean isEligibleforLoan = creditScore >=720;
        System.out.println("isEligibleforLoan = " + isEligibleforLoan);
        int score = 59;
        boolean hasFailed = score<=59;
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("_____________-");
        int x=100;
        int y= 200;
        boolean equal = x==y;
        System.out.println("equal = " + equal);
        
        boolean result5= "Java"=="Java";
        System.out.println("result5 = " + result5);//true
        boolean result6 = "A"=="a";
        System.out.println("result6 = " + result6);//false
        System.out.println("__________________________");

        //not equal != operator
        boolean result7= 100 != 200;
        System.out.println("result7 = " + result7);//true
        boolean result8 = 200!=300;
        System.out.println("result8 = " + result8);//true


                
    }
}
