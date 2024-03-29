package day39.Shapes;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square= new Square(10);
        System.out.println(square);
        square.setSide(20);

        Rectangle rectangle= new Rectangle(5,6);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getName());

        Circle circle= new Circle(7);
        circle.setRadius(7);
        circle.getRadius();
        System.out.println(circle);
    }
}
