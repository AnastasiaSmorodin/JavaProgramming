package day32;

public class ConstractorCalls {

    public ConstractorCalls() {
        System.out.println("Default Constructor");
    }

    public ConstractorCalls(int a) {
        this();
        System.out.println("Constructor with int  argument");
    }

    public ConstractorCalls(String str) {
        this(10);
        System.out.println("Constructor with String  argument");
    }

    public static void main(String[] args) {
        ConstractorCalls obj1= new ConstractorCalls();
        System.out.println("______________________________");
        ConstractorCalls obj2= new ConstractorCalls(10);
        System.out.println("_________________________");
        ConstractorCalls obj3= new ConstractorCalls("Java");



    }
}
