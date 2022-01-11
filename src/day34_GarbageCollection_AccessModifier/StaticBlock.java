package day34_GarbageCollection_AccessModifier;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static{
        System.out.println("Static Block");//runs first before anything and only one time
    }
}
