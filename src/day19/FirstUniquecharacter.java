package day19;

public class FirstUniquecharacter {
    public static void main(String[] args) {
        //  4. Write a program that can return the index number
        //  of the first unique character.
        String str= "aaabedgcgfrhj";
        for (int i = 0; i <str.length(); i++) {
           char first= str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char second= str.charAt(j);
                if(first==second){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.indexOf(first));
                break;
            }
        }
    }
}
