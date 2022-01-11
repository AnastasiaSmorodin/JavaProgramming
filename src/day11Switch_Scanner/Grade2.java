package day11Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch='Z';
        String result="";
        switch (ch){
            case 'A': case 'B': case 'C': case 'D':
                result="Passed";
                break;
            case 'F':
                result="Failed";
            default:
                result="Invalid";
        }
        System.out.println(result);
    }
}
