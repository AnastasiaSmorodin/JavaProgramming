package day24CustomMethodsReturn;

public class Practice4 {
    public static void main(String[] args) {
        String str = "aabccdeebbbbbbbbbbbnnnnnnnnnnnnffffffffff";
       str =removeDublicate(str);
        System.out.println(str);

    }

    public static String removeDublicate(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
          char each=  str.charAt(i);
          if(!result.contains(""+each)){
              result+=each;
          }

        }
        return result;
    }
}
