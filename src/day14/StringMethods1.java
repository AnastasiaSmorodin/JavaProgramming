package day14;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1= "      batch  25       ";
        str1=str1.trim();//prints without white spaces
        System.out.println(str1);
        String str2= "Cydeo School";
        int n1=str2.indexOf("h");//finds where is h located -8
        System.out.println("n1=" + n1);

        int n2= str2.indexOf("ool");//finding the number or first o - 9
        System.out.println("n2 = " + n2);
        String str3= "Java Programming language";

        int n3= str3.indexOf("a P");// will print the a thats last in the word Java-3
        System.out.println("n3 = " + n3);
        
        int n4= str3.indexOf("ge");//23
        System.out.println("n4 = " + n4);

        int n5= str3.lastIndexOf("g");//shows the last one 
        System.out.println("n5 = " + n5);
        
        
        String s= "Java Nova Cava Wawa orange";
        int firstA= s.indexOf("a");// the fist a
        int LastA= s.lastIndexOf("a");
        int secondA= s.indexOf("a ");
        int ThirdA= s.indexOf("a C");
        //int forthA= s.indexOf("ava W");
        int forthA= s.lastIndexOf("av");
        int fifthA= s.lastIndexOf("a W");
        int SixthA= s.lastIndexOf("aw");
        int SeventhA=s.lastIndexOf("a");
        
        
        
        System.out.println("firstA = " + firstA);
        System.out.println("LastA = " + LastA);
        System.out.println("secondA = " + secondA);
        System.out.println("ThirdA = " + ThirdA);
        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("SixthA = " + SixthA);
        System.out.println("SeventhA = " + SeventhA);
        
        





    }
}
