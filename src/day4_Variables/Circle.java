package day4_Variables;

public class Circle {
    public static void main(String[] args) {


        double Pi = 3.14;
        double radius = 5.5;
        double diameter = 2.5;
        double area = radius * radius * Pi;//finds the diameter by multiplying the radius to 2
        double perimiter = 2 * radius * Pi;//finds the area of the circle
        System.out.println("Pi = " + Pi);//finds the perimiter by formula
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimiter);

    }
}
