package day31_Constructor;

import java.util.ArrayList;

public class MovieObjects {
    public static void main(String[] args) {
      Movie mov1=  new Movie("USA","Journey to SDET: Cydeo Batch 25",
              "Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay");
        String[] casts={"Asiya","Adam","Muhtar","Serghei","Irina","Marius","Hulya","Ross"};

        mov1.addCasts(casts);
        System.out.println(mov1);

    }
}
