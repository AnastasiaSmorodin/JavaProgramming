package day38_Inheritance.CarTask;

public class Toyota extends Car {


    public Toyota(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }
    public void isReliable(){
        System.out.println("Toyota"+ model+ " is very reliable");
    }
}
