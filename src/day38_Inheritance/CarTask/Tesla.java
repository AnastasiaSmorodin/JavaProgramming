package day38_Inheritance.CarTask;

public class Tesla extends Car{

    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
public void autopilot(){
    System.out.println(brand+model+"has autopilot function");
}
}
