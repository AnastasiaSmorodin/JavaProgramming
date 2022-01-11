package day33;

public class practicing4 {
    public static void main(String[] args) {
        // count how many times the character is in the string like A3B2C1D2
        String str= "AAABBCDD";

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                char eachchar = str.charAt(j);
                if (ch == eachchar) {
                    count++;
                }
            }
                if (result.contains("" + ch)) {
                    continue;
                }
                result += ch+""+count;


            }


        System.out.println(result);

    }
}
