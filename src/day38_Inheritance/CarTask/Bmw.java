package day38_Inheritance.CarTask;

public class Bmw extends Car{
    public Bmw( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
public void breaksDown(){
    System.out.println(brand+ model+ "is breaking down a lot");
}

}