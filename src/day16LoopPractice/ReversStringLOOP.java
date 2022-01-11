package day16LoopPractice;

public class ReversStringLOOP {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result="";
        for(int i= str.length()-1; i>=0 ; i--){//i is the index numbers of str
            //(starting from last index to index o)
            result += str.charAt(i);

        }
    }
}
