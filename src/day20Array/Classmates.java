package day20Array;
/*
1. create an array named classmates, and store 10 of your
classmates' full names
 print the initials of each classmates in separate lines

 */
public class Classmates {
    public static void main(String[] args) {
        String[]classmates = {"Elga Ivanova","Ana Smorodin","Ross Boss" ,"Hulya Keles",
        "Turan Ates","Irina Dubenets","Alex drebot","Amanda Sandin","Serhei Griu",
               "Marius Gicu"};
        for (int i = 0; i < classmates.length; i++) {
            String element = classmates[i];//represents each element of string
            String first = "" + element.charAt(0);
            String second =""+element.charAt(element.indexOf(" ")+1);
                             //Elga Ivanova


            System.out.println(first + "."+second);
        }

    }
}
