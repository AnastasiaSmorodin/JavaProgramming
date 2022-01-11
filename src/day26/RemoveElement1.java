package day26;

import java.util.Arrays;

public class RemoveElement1 {
    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500,600};
       numbers= removeElementsByIndex(numbers,1);
       numbers=removeElementsByIndex(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] removeElementsByIndex(int[]array,int index){
        if(index<0 || index>=array.length-1){
            System.err.println("Invalid Index :"+ index);
            System.exit(0);
        }
        int[]newArray= new int[array.length-1];
        int j=0;//for the index numbers of newArray
        for (int i=0; i< array.length; i++) {
            if(i==index){//if the element of array is matching with the element at given index
                continue;
            }
           newArray[j++]=array[i];
        }
        return newArray;
    }


}

