package day11Switch_Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size="grande";
        String result = "";

        switch(size){
            case "tall":
                result= "price is $3.69" + "\n 90 calories ";
                break;
            case "grande":
                result= "price is $3.99" + "\n 120 calories";
                break;
            case "venti":
                result= "price is $4.29" + "\n 150 calories";
                break;
            default:
                result= "Invalide size";}

        System.out.println(result);




        }
    }

