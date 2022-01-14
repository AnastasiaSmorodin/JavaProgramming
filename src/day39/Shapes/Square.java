package day39.Shapes;

public class Square extends Shapes {
    private double side;

    public Square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid side size" + side);
            System.exit(0);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() + '\'' +
                ", perimeter=" + perimeter() + '\'' +
                '}';
    }
}



