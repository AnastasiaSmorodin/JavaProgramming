package day22DementionalArray;

public class Practice2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {9, 10, 11, 12, 13}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            //  arr2D[i]//each single dimensional array
            for (int j = 0; j < arr2D[i].length; j++) {///j ind num of elements start from 0
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("_________________________________________");
        for (int i = 0; i < arr2D.length; i++) {//i is the index number ofeach array from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j for ind num of eachelement of every array
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("___________________________________");
        for (int i = arr2D.length-1; i >= 0; i--) {//i is the index number ofeach array from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j for ind num of eachelement of every array
                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
        }
    }
}



