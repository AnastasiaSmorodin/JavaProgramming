package day16LoopPractice;

public class RemoveDublicates {
    public static void main(String[] args) {
        String str="aabbaacc";
        String result="";

        for(int i=0; i <= str.length()-1; i++) {//i is representing the index numbers of str
            //starting from 0
            String ch = "" + str.charAt(i);//represents each character of str;

            if (!result.contains(ch)) {
                result += ch;

            }
        }


            System.out.println(result);

    }
}
