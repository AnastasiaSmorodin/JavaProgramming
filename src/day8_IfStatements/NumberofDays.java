package day8_IfStatements;

public class NumberofDays {
    public static void main(String[] args) {
        int number = 5;
        boolean has28days = number==2;//for the month that has 28 days (february 2)
        boolean has30days= number==4 || number==6 || number ==9 || number ==11;
        boolean has31days = !has28days && !has30days;
        if(has28days){
            System.out.println(" 28 days");}
        if(has30days){
            System.out.println(" 30 days ");}
        if (has31days){
            System.out.println(" 31 days");}



    }
}
