package day19;

public class Exitmethod {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            if (i==3){
                //break //terminates the loop
                //continue;// skips 3 and prints the rest
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("Wooden spoon");
    }
}
