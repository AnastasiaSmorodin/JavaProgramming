package day14;

public class StringMethods5 {
    public static void main(String[] args) {
        String str= "    ";
       boolean r= str.isEmpty();
        System.out.println(r);

        String str2= "  ";
        boolean s= str2.isBlank();
        System.out.println(s);
        System.out.println("_______________________");

        String s1="CYDEO";
        String s2= "cydeo";
        System.out.println(s1.equals(s2));// false not equal even if same /case sensitive
        System.out.println(s1.equalsIgnoreCase(s2));// true
        System.out.println("__________________________");

        String sentence ="My favorite proggramming language is Java";
        boolean hasCsharp = sentence.contains("C#");//false
        boolean hasJava = sentence.contains("Java");//true
        System.out.println(hasCsharp);
        System.out.println(hasJava);
        boolean hasjava2 = sentence.toLowerCase().contains("java");//to ignore case sencitivity
        System.out.println("_______________________");
        String input1 = "I love JaVa";
        String input2= "Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains(input2));//flse
        System.out.println(input1.toLowerCase().contains("java"));//ignore case
        System.out.println(input1.toUpperCase().contains("JAVA"));//sensitivity


        String a ="Wooden spoon";
        boolean x= a.startsWith("oo");
        boolean y= a.endsWith("spoon");
        boolean z= a.toLowerCase().startsWith("wooden");//for case sensitivity

        System.out.println(x);
        System.out.println(y);








    }
}
