package day42;

public class DisadvantageOfThrowsKeyWord {
    public static void sleep(double seconds)throws InterruptedException{
        Thread.sleep((long)(seconds*1000));
    }

    public static void main(String[] args)throws InterruptedException {
        System.out.println("Hello");
        sleep(2.5);//throws keyword
        System.out.println("Hello world");
        MorningWorkout.sleep(2.5); //try and catch
        System.out.println("Cydeo");
    }
}
