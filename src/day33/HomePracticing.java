package day33;

public class HomePracticing {
    public static void main(String[] args) {
        //check if one string is build from the same letter as the other
        String str1="zabc";
        String str2="cab";
        String each= "";
        String each2= "";

        for (int i = 0; i <str1.length() ; i++) {
            each=""+str1.charAt(i);}
           for (int j = 0;j < str2.length(); j++) {
                each2 = "" + str2.charAt(j);}

                if (str1.contains(each2)&& str2.contains(each) && str1.length()==str2.length()){
                    System.out.println("same");
                } else {
                    System.out.println("not same");
                }


        }

    }

