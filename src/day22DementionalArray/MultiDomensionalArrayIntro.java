package day22DementionalArray;

import java.util.Arrays;

public class MultiDomensionalArrayIntro {
    public static void main(String[] args) {

        String[] group1={"Jon","Joes","James"};
        String []group2={"ana","hulya","Irina"};
        String []group3={"Valya","Nastya","Loh"};
        String[][]groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("_________________________________-");
          // index elements:012 0123       01234
        int[][]arr2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index of array 0        1             2
        System.out.println(Arrays.deepToString(arr2d));
        System.out.println(Arrays.toString(arr2d[1]));

        System.out.println(arr2d[2][3]);




    }
}
