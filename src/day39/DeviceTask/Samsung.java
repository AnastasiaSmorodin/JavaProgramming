package day39.DeviceTask;

public class Samsung extends Phone {
    public Samsung( String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, price, hasBattery, hasPowerButton);
    }

    public void isBlowing() {
        System.out.println(getBrand() + " " + getModel() + " battery is blowing on the airplane");
    }
}
