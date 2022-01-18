package day39.DeviceTask;

public class PersonalComputer extends Computer{
    public PersonalComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void cantMove() {
        System.out.println(getBrand() + " " + getModel() + " you cant move PC with you");
    }
}
