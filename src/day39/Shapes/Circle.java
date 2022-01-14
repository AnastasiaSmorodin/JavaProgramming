package day39.Shapes;

public class Circle extends Shapes{
private double radius;
public static  double pi= 3.14;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setRadius(double radius) {

        if(radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
            this.radius = radius;
    }








    }
}
