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

    public void setRadius(double radius) {

        if(radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
            this.radius = radius;
    }





    }
}
