package day8_IfStatements;

public class TernariesIntro2 {
    public static void main(String[] args) {
        int n=1;
        String result= (n==1)? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday"
                :(n==4)? "Thursday" :(n==5)? "Friday" :(n==6)? "Saturday"
                :"Sunday";
        System.out.println(result);

    }
}
