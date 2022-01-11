package day19;

public class UniqueCharacters {
    public static void main(String[] args) {
  String str= "aabccdeef";
  String result="";

        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);
            int count=0;//represents frequency of char
            for (int i = 0; i < str.length(); i++) {//compares the chrctr other loop picked
                char each= str.charAt(i) ;//each character of str
                if(ch==each){
                    count++;
                }
            }
            if(count==1){//if the frequency of the character is 1 then chrctr is unique
                result+=ch;
            }

        }

        System.out.println(result);














    }
}
