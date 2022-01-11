package day19;

public class DublicateIndex {
    public static void main(String[] args) {
        // Write a program that can return the index number of the first
        // duplicated character from a string
        String str = "abcdffgtt";
        for (int i = 0; i < str.length(); i++) {
            char firstchar = str.charAt(i);//each index of the string
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char secondchar = str.charAt(j);
                if (secondchar == firstchar) {
                    count++;
                }

            }

                if (count == 2) {
                    System.out.println(str.indexOf(firstchar));
                    break;
                }

            }
        }

    }





