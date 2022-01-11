package day24CustomMethodsReturn;

import java.util.Arrays;

public class HomeTasks {
    public static void main(String[] args) {
        String str="aabbccffhhkwdkvtbdhbssrrywwtyy";
        str = removedublicate(str);
        System.out.println(str);
        int[]lop= {1,2,3,4,5,6,7,8};
        int[] lop2={10,20,30};
        System.out.println(maximumNumber(lop));
        System.out.println(minimumNumber(lop));
        String[]arr1={"Have", "a","good","day"};
        System.out.println(Arrays.toString(reversedArray(arr1)));
        System.out.println(Arrays.toString(mergeTwoArrays(lop,lop2)));
    }
    /*
    1. create a method that can remove duplicated characters from a string
    and returns the new value
   */
    public static String removedublicate(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String each = str.charAt(i) + "";
            if (!each.contains(each))
                result += each;
        }

        return result;
    }

    /*
     2. create a method that can return the maximum number from
      an array of integers
     */
    public static int maximumNumber(int[]arr){
        int max=0;
        for (int each : arr) {
            if(each>max){
                max=each;
            }
        }
        return max;
    }

/*
3. create a method that can return the minimum number from an array of integers
 */
   public static int minimumNumber(int[]arr) {
       int min = Integer.MAX_VALUE;
       for (int each : arr) {

           if (each < min) {
               min = each;
           }
       }


       return min;
   }
   /*4. create a method that return the reversed array

    */
    public static String[] reversedArray(String[]str){
        String[] result= new String[str.length];
        for (int i = str.length-1, j=0; i >=0; i--, j++) {
            result[j]=str[i];
        }

           return result;
        }

        /*
        5. create a method that can merge two arrays and return
 the new array
         */
    public static int[] mergeTwoArrays(int[]arr1,int[]arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[count]=arr1[i];
            count++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            newArr[count]=arr2[i];
            count++;

        }
        return newArr;
    }
    }



