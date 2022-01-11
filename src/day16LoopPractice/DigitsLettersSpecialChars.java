package day16LoopPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo123456School!@%&WoodenSpoon";
        String digits = "";// 1234
        String letters = "";// CydeoWoodenSpoon
        String specialChar = "";//@#$%^^&&
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);// to get each of the characters
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                specialChar += ch;
            }

        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChar);
    }
}
