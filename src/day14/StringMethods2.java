package day14;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
       String str2= str.replace("Java", "Phyton");
        System.out.println("str2 = " + str2);
        String email = "JohnSmith@yahoo.com";
        String email2= email.replace("yahoo.com", "gmail.com");
        System.out.println("email2 = " + email2);
        String sentence= "Java Java Phyton Phyton C# C# C++ C++ Phyton Phyton Phyton Phyton";
        String sentence2= sentence.replace("Phyton","").replace("   "," ");
        System.out.println("sentence2 = " + sentence2);

        String s= "dog dog dog dog dog dog";
        s=s.replace("dog","cat");
        System.out.println(s);
        String s2="C# is fun , C# is cool";
        s2=s2.replace(" C#", " Java");
        System.out.println("s2 = " + s2);
        String s3= "Java";
        s3=s3.replace("a","e");
        System.out.println(s3);
        

    }
}
