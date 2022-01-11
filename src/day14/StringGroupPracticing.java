package day14;

import java.sql.SQLOutput;

public class StringGroupPracticing {
    public static void main(String[] args) {
        //indexOf(),charAt(),lastIndexOf(), replace(),repeat(),toUpperCase()
        //toLowerCase, Substring(),Substring(begining.end),replaceFirst(),
        // length(),trim(),

        //boolean: equals(), equalsIgnoreCase(),
        //isBlank(), contains(), startsWith(), endsWith(), isEmpty().

        String str= "Good morning.Have a Good day";
        System.out.println(str.indexOf("d"));
        System.out.println("____________________");
        System.out.println(str.charAt(1));
        System.out.println("________________");
        System.out.println(str.length());
        System.out.println(str.lastIndexOf("av"));
        System.out.println(str.replace("Good m","bad m"));
        String str2= "Java Java Java Java";
        System.out.println(str2.equalsIgnoreCase(str2.replaceFirst("Java", "java")));
        System.out.println(str2.repeat(5));
        String str3= "java java java java";
        System.out.println("______________________________________");
        String a= "Muhtar is a great dog";
        System.out.println(a.substring(a.indexOf('d')));
        System.out.println(a.substring(a.indexOf('g'),a.lastIndexOf(" ")));













    }

}
