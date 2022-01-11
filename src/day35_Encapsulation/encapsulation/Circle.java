package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.exit(0);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea() {
        return (pi * radius * radius);
    }

    public double calcPerimeter() {
        return (2 * radius * pi);

    }

    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                " Area = " + calcArea() +
                " Perimeter= " + calcPerimeter() +
                '}';

    }
}
