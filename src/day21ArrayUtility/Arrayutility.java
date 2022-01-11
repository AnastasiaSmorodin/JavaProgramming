package day21ArrayUtility;

import java.util.Arrays;

public class Arrayutility {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));//toString to print array
        //sort() sorts the array in order from smaller to bigger numbers or a to z
        int [] scores ={95,100,55,65,45};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        String []letters={"f","w","m","o","z","x"};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));
        String[]names= {"Anna","Ahmet","Maria","Sinema"};
                Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        //equals(array1,array2)will compare element index to index
        int[]arr1={1,2,3};
        int[]arr2={1,3,2};
        boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);//123 123
        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);
        char[] ch1={'a','c','b'};
        char[]ch2={'b','a','c'};
        Arrays.sort(ch1);   //anagram is the word containing same letters
        Arrays.sort(ch2);
       boolean anagram= Arrays.equals(ch1,ch2);
        System.out.println(anagram);





    }
}
