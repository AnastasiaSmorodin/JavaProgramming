package day39.DeviceTask;

public class TV extends Device {
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void channelUp() {
        System.out.println(getBrand() + " " + getModel() + " is changing the channel up");

    }

    public void channelDown() {
        System.out.println(getBrand() + " " + getModel() + " is changing the channel down");
    }
}
