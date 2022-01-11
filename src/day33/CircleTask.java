package day33;

public class CircleTask {
    double radius;
    public static double Pi= 3.14;
    double diameter= radius*2;

    public CircleTask(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public  void calcPerimiter(){
        System.out.println(radius*2*Pi);
    }
    public void calcArea(){
        System.out.println(Pi*radius*radius);
    }
    public void printPi(){
        System.out.println(Pi);
    }

    public String toString() {
        return "CircleTask{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
