package day39.DeviceTask;

public class BlackBerry extends Phone{
    public BlackBerry( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Blackberry", model, price, hasBattery, hasPowerButton);
    }


    public void secure() {
        System.out.println(getBrand() + " " + getModel() + "very secure ");
    }
}
