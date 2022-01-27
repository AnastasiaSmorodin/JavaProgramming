package day42;

import java.io.FileNotFoundException;

public class ThrowsKeyWord2 {



    public static void method1()  throws FileNotFoundException {
        new FileNotFoundException("");

    }
    public static void method2() throws  FileNotFoundException{
        method1();
    }

    public static void method3()throws FileNotFoundException, InterruptedException{
        method2();
        Thread.sleep(1000);
    }
}
