package day21ArrayUtility;

import java.util.Arrays;

public class CopyMethods {
    public static void main(String[] args) {
        String[]students= {"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String[]earlyBirds= Arrays.copyOf(students,5);//will print first 5 elements
        System.out.println(Arrays.toString(earlyBirds));
        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("________________________________________-");
        char[]ch1={'A','B','C','D','E','F','G','H','I'};
        char[]ch2=Arrays.copyOfRange(ch1,2,6+1);//excludes the last element
        System.out.println(Arrays.toString(ch2));




    }
}
