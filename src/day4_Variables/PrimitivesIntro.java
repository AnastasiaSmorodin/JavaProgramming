package day4_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        //age:38 years old
        byte age = 38;
        // weight : 160 pounds; 160 is out of byte range;
        short weight = 160;
        int salary = 100_000;//int is prefferd data type fpr all integer numbers
        // of you want to read long number easier you can put _ in between
        long speedoflight = 12034560090000L;
        // to use the large lare numbers after you put L or l to not have a mistake
        //tax:0.26
        double tax = 0.26; //double used for dot small number
        // you can also use float but you will put it as float tax = 0.26F;
        //double is preffered
       // #
        char ch1 ='#';
        System.out.println("ch1 = " + ch1);
        char ch2=35;
        System.out.println("ch2 = " + ch2);
        char ch3= 45000;
        System.out.println("ch3 = " + ch3);
        char gender = 'F';
        char yesNo = 'Y';
        
        boolean isemployed = true;
        boolean statemnet= 100>300;
        System.out.println("statemnet = " + statemnet);

       String name = "wooden spoon";
       String city = "Mclean";
       String state = "Florida";
        System.out.println("name = " + name);
        System.out.println("state = " + state);





    }


}
