package day33;

public class HomePracticing2 {
    public static void main(String[] args) {

        //remove the dublicates from the string
        String str1= "AAABBBCCC";
        String result="";
        for (int i = 0; i <str1.length() ; i++) {
           String ch=""+str1.charAt(i);
           if(!result.contains(ch)) {

               result += ch;
           }
          }
        System.out.println(result);
        }

        }






