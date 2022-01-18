package day39.DeviceTask;

public class Nokia extends Phone{
    public Nokia( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }
    public void notPopular() {
        System.out.println(getBrand() + " " + getModel() + " not very popular anymore");
    }
}
