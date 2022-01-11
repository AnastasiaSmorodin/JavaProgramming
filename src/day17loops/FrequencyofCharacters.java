package day17loops;

public class FrequencyofCharacters {
    public static void main(String[] args) {
        /*
        Write a programm that can return a frequency of characters from a string
        ex: AAAABBCCC   ch='A'   iutput: 4
         */
        String str = "AAABBCC";
        char ch = 'A';
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {//i is indexes of str
            char eachchar = str.charAt(i);//will give each character of string
            if (ch == eachchar) {//if given char is matching with each character of string then
                //its appered in the string.
                frequency++;


            }
        }
        System.out.println(frequency);
    }
}
