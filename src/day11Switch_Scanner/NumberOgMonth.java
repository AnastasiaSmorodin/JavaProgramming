package day11Switch_Scanner;

public class NumberOgMonth {
    public static void main(String[] args) {
        int month=2;
        String result="";
        int year =2001;

        switch(month){case 1 : case 3: case 5: case 7: case 10: case 12:
            result= "31 days";
            break;
            case 4: case 6: case 9 : case 11:
                result="30 days";
            break;
            case 2 :
                result="28 days";
                if (year % 4 ==0) result="29 days";// to know id the year is leap than 29 days
                break;
            default :
                result= "Invalid";}
        System.out.println(result);
    }
}
