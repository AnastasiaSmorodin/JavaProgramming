package day14;

public class SubString2 {
    public static void main(String[] args) {
        String email = "Cydeo.School@gmail.com";
        int begginingIndex= email.indexOf("@")+1;
        int endidgIndex= email.lastIndexOf(".");
        String domain= email.substring(begginingIndex, endidgIndex);
        System.out.println(domain);
        System.out.println("________________________________");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beg = str1.indexOf(" J") + 1;
        int end = str1.lastIndexOf(",");

        String s2 = str1.substring(beg, end );  //Java is cool


        String s3 = str1.substring(  str1.lastIndexOf("I")  );// i love java

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);




    }
}
