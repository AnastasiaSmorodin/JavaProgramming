package day14;

public class Substring {
    public static void main(String[] args) {
        String word = "Cydeo School";
        //             01234567891011
        String brand = word.substring(0,5);
        System.out.println("brand = " + brand);
        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);
        String word2 = "Java Programming Language";
        String s1=word2.substring(0, word2.indexOf(" "));
        System.out.println(s1);
        String s2=word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        System.out.println(s2);
        String s3= word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println(s3);
    }
}
