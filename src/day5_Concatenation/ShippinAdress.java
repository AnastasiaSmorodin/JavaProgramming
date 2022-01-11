package day5_Concatenation;

public class ShippinAdress {
    public static void main(String[] args) {
        String name = "Anastasia Smorodin", buildingnumber = "52B",
                streetName = "Hidden lakes drive ", city = "Destin",
                state = "Florida", zipcode = "32550";
        //you can declare the variable name using it once and put , insted ;
        // if you use all string or all int - just put , in between to not
        //put string string all the time//
 String adress = name + "\n" + buildingnumber + " " + streetName + "\n" +
         city + "," + state + " " + zipcode;

        System.out.println(name + "\n" + buildingnumber + " " + streetName + "\n" +
                city + "," + state + " " + zipcode);


    }
}
