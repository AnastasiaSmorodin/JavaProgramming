package day41_Exceptions;

import day30_CustomClass.Student;

import java.io.FileInputStream;
import java.util.Locale;

public class Checked_vs_Unchecked {
    public static void main(String[] args) {
        //unchecked exception:
        int a=10;
       int b= 0;
       //System.out.println(  a / b  );

        char[] characters= {'A','B','C'};
     //   System.out.println(characters[99]);
       // index out of bounds for length 3
        Student student= null;
       // System.out.println(student.name); no object have ever created

        String str= "Wooden spoon";
        str=null;
       // System.out.println(str.toUpperCase());

        String str2= "";//object!=null
        System.out.println(str2.isEmpty());

        //checked exeption:
        System.out.println("Hello");
       // Thread.sleep(3000);

        System.out.println("Cydeo");

      //  FileInputStream file= new FileInputStream("path of the file");
      //  System.out.println("java".charAt(2000000));




    }
}
