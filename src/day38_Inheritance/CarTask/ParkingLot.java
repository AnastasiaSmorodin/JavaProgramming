package day38_Inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("corolla",2019,17000,"black",19000);
        Tesla tesla= new Tesla("Model Y",2018,45000,"white",12000);
        Bmw bmw= new Bmw("350i",2020, 50000,"blue",35000);
        toyota.start();
        bmw.start();
        tesla.start();
    }
}
