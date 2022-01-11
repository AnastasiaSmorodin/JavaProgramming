package day16LoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "aabcccddddddd";
        String result="";

        for(int i=0; i<=str.length()-1; i++){//i: index numbers of str
            char ch=str.charAt(i);//ch:represents each of the caracters of str
            if(str.indexOf(ch)==str.lastIndexOf(ch)){//if the firs index and last index number of character are the same the character is unique
                result+=ch;

            }




        }
        System.out.println(result);




    }

}
