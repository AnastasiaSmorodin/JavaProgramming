package day39.DeviceTask;

public class Google extends Phone{
    public Google( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("google", model, price, hasBattery, hasPowerButton);
    }
    public void xtraFeatures() {
        System.out.println(getBrand() + " " + getModel() + "has a lot of extra features");
    }
}
