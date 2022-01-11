package day35_Encapsulation;


import day35_Encapsulation.Carpet;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet catpet1= new Carpet(5,7,25,false);
        catpet1.calcCost();
        System.out.println(catpet1.calcCost());
    }
}
