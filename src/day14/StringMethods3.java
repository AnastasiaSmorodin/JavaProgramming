package day14;

public class StringMethods3 {
    public static void main(String[] args) {
        String result="Java Java Java";
        result=result.replaceFirst("Java","Python");
        System.out.println(result);
        String result2 = "C# is fun , C# is cool";
        result2=result2.replaceFirst("C#", "Java");
        System.out.println(result2);
        String result3= "Java";
        result3=result3.replaceFirst("va", "vo");
        System.out.println(result3);



    }
}
