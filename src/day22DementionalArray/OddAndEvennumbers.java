package day22DementionalArray;

public class OddAndEvennumbers {
    public static void main(String[] args) {
        int[][] arr = {{5, 2, 3, 4}, {12, 6, 7},{10,7,17,13}};
        int countEven=0;
        int counOdd=0;
        for (int[] ints : arr) {
            for (int elements : ints) {
                if(elements%2==0){
                   countEven++;
                }
                if(!(elements%2==0)){
                    counOdd++;

                }

            }

        }
        System.out.println(counOdd);
        System.out.println(countEven);
    }
}
