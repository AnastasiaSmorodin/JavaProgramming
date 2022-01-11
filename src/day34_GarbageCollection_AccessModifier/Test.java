package day34_GarbageCollection_AccessModifier;
import static utilities.MathUtility.sum;



public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);
        System.out.println("___________________________________");
        //find the sum of 10,20
        //find the sum of 100,200
       int n1= sum(10,20);
       int n2= sum(100,200);
        System.out.println(n1+":"+n2);
    }

}
