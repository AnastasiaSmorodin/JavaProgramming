package day17loops;

public class BranchingStatments2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 1; i < 11; i++) {// i:1,2,3,4,5,6,7,8,9,10
            if (i % 2 != 0) { //1, 3, 5, 7, 9
                continue; //Skip
            }

            System.out.println(i); //2 4 6 8 10
        }

        for (int i = 1; i < 11; i++) {

            if (i % 2 == 0) { //2, 4, 6, 8, 10
                continue;
            }

            System.out.println(i);

        }
    }
}





