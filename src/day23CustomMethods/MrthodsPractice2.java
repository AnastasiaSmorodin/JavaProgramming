package day23CustomMethods;

public class MrthodsPractice2 {
    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5times();
        evenNumbers1_10();
    }
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloWorld");}

    }

    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello cydeo");
        }

    }


    public static void evenNumbers1_10(){
        for (int i = 1; i <10 ; i++) {
            if(i%2==0){
                System.out.println(i+": is  even number ");
            }

        }
    }

}
