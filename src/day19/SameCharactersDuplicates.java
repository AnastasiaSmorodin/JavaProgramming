package day19;

public class SameCharactersDuplicates {
    public static void main(String[] args) {
        String str="abbcdettr";
        String result="";
//3. Write a program that can display all the characters that appeared twice in the string.
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            int count=0;

            for (int j = 0; j <str.length() ; j++) {
                char each1=str.charAt(j);
                if (each==each1) {
                    count++;
                }

            }if (!result.contains(each+"")&& count==2){
                result +=each;


            }
        }
        System.out.println(result);





    }
}


