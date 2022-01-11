package day21ArrayUtility;

public class PalindromeTask4 {
    public static void main(String[] args) {
        /*
         write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */
        String[] str = {"anna", "level", "Java"};

        int count=0;
        for (String each : str) {//going to get us each name
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if(each.equals(reverse)) {
                count++;

            }
        }
        System.out.println(count);
    }
}
