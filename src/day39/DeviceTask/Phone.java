package day39.DeviceTask;

public class Phone  extends  Device {


    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " " + " is calling " + phoneNumber);
    }
}
