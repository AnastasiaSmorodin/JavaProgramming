package day7_Operators;

public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte) averageScore;// we did explicit casting
        short num2 = (short) averageScore;//explicit casting
        int num3 = (int) averageScore;//explicit casting
        long num4 = (long) averageScore;//explisit casting
        float num5 = averageScore;// no casting
        double num6 = averageScore;// no casting

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);




    }
}
