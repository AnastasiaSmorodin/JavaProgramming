package day20Array;

public class Classmates2 {
    public static void main(String[] args) {
        String[]classmates = {"Olga Ivanova","Ana Smorodin","Ross Boss" ,"Hulya Keles",
                "Turan Akes","Irina Dubenets","Alex drebot","Amanda Sandin","Serhei Griu",
                "Marius Gicu"};

        for (int i = 0; i < classmates.length; i++) {
            String element= classmates[i];
            String reverse="";
            for (int j = element.length()-1; j >=0 ; j--) {
                reverse+=element.charAt(j);
            }
            System.out.print(reverse);

        }

    }
}
