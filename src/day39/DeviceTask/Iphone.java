package day39.DeviceTask;

public class Iphone extends Phone {
    public Iphone( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("appple", model, price, hasBattery, hasPowerButton);
    }

    public void islowBattery() {
        System.out.println(getBrand() + " " + getModel() + " low battery");

    }
}