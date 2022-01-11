package day21ArrayUtility;

import java.util.Arrays;

public class MergetwoStrings {
    public static void main(String[] args) {
        String[]group1={"Adam","Ana","Gulya"};
        String[]group2={"Nick","John"};
        String[]students=new String[group1.length+group2.length];
        int i=0;
        for (String each:group1){
            students[i++]=each;

        }
        for (String each:group2){
            students[i++]=each;

        }
        System.out.println(Arrays.toString(students));
    }
}
