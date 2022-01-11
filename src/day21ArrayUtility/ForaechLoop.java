package day21ArrayUtility;

import java.util.Arrays;

public class ForaechLoop {
    public static void main(String[] args) {
        int[]numbers= {10,20,30,50,60,70};
        for (int i = 0; i < numbers.length; i++) {
            int eachelement=numbers[i];
            System.out.println(eachelement);
        }
        System.out.println("_______________________");
        for(int each:numbers){
            System.out.println(each);
        }
    }
}
