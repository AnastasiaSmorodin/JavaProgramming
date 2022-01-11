package day20Array;



public class FindingMaxMinfromArray {
    public static void main(String[] args) {
       int[]numbers= {10,5,4,30,1,7};
       //find out the max number from array;
        int max= numbers[0];//we re just assuming that the 1 number is maximum
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){// i represents every element of an array
                max=numbers[i];
        }

        }
        System.out.println(max);
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(min);
        }
    }

