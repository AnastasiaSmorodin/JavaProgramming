package day20Array;
/*
7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
public class Task7CommonElementsfrom2Strings {
    public static void main(String[] args) {
        int[] first = {1,2,3,4,5};
        int [] second= {4,5,6,7,8};
        String result="";

        for (int i = 0; i < first.length; i++) {
            int eachelement= first[i];

            for (int j = 0; j <second.length ; j++) {
                int eachelemnt2= second[j];
                if(eachelement==eachelemnt2){
                    result+=" "+eachelement;
                }
            }

        }
        System.out.println(result);
    }
}
