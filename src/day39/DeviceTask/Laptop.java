package day39.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void touchScreen() {
        System.out.println(getBrand() + " " + getModel() + "laptop has touchScreen option");
    }
}
