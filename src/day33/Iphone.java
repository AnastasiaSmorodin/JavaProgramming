package day33;

public class Iphone {
    public static String brand= "Apple";
    public String model;
    public double price;

    public static String OS = "iOS";
    public String color;
    public static boolean hasFacetime= true;
    public static boolean madeInChina= true;
    public void printmodelAndprice(){
        System.out.println(model+":"+price);
    }

    public static void printOperatingSystem(){
        System.out.println(OS);

    }
}
