package day39.DeviceTask;

public class Desctop extends Computer{
    public Desctop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void isAwesome() {
        System.out.println(getBrand() + " " + getModel() + " is awesome");

    }

}
