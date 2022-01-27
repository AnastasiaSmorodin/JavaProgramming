package day40;

public class FinalVariable {
    final String birthDay;
    final static String name;
    static{
        name= "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }


    public static void main(String[] args) {

        final double pi= 3.14;
       // pi=4.14; cannot be resiagned
       final String name;
        name= "Java";
    //    name= "Wooden spoon"; cannot reasign because its final
        System.out.println("_____________________________");

        FinalVariable obj= new FinalVariable("May/01");
        System.out.println(obj.birthDay);
        System.out.println(name);//java
        System.out.println(FinalVariable.name);//batch25
    }
}
