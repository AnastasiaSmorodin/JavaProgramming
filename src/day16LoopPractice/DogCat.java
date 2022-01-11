package day16LoopPractice;

public class DogCat {
    public static void main(String[] args) {
        /**
         * 5. write a program to print true if the string "cat" and "dog"
         * appear the same number of times in the given sentence
         *Ex:
         * sentence = "caT dog dogG cAt"
         *output:
         *true
         */
        String str1 = "Cat cat dog cat dog Gdog";
        int countCat = 0;
        int countDog = 0;


        for (int i = 0; i < str1.length() - 2; i++) {
            if (str1.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countCat++;
            }
            if (str1.substring(i, i + 3).equalsIgnoreCase("dog")) {
                countDog++;
            }


        }
        // System.out.println("countDog = " + countDog);
        //System.out.println("countCat = " + countCat);
//        if (countCat == countDog) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        System.out.println(countCat==countDog);



    }
}
