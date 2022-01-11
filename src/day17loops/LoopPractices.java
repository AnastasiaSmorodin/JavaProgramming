package day17loops;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("____________________________");


        int j = 1;
        while (j <= 10) {
            // j++;wrong
            System.out.println(j);//2 starts from 2 to 11
            j++;
        }

        System.out.println("________________________________");
        int k =1;
        do{

            System.out.println(k);
            k++;
        }while(k <= 10);



    }
}
