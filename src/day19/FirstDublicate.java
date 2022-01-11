package day19;



public class FirstDublicate {
    public static void main(String[] args) {

        //Write a program that can return the first duplicated character from a string
        String str= "abcddvgrtt";

        for (int i = 0; i <str.length() ; i++) {
            char outerchar= str.charAt(i);//first 'a'
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char innerchar = str.charAt(j);//first'a'
                if(outerchar==innerchar){
                    count++;
                }

            }
            if(count==2){
                System.out.println(outerchar);
               break;
            }

        }



    }
}
