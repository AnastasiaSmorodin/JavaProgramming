package day20Array;
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID

 */

public class Shoppinglist {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        String report="";
        for (int i = 0; i < items.length; i++) {
            String eachitem= items[i];//represents the each item
            double eachprice= prices[i];//each price
            int eachitemIDs= itemIDs[i];//each id   //all of them  6 elements in array

            if(eachitem.equalsIgnoreCase("Gloves")){
                System.out.println("Index of gloves is:"+i);//i represents the index of each element
            }
            if(eachitem.equalsIgnoreCase("Ipad")){
                System.out.println("Array contains Ipad");
            }
         report+= "Name: "+eachitem+" - Price: "+eachprice+" - #ID*/ "+eachitemIDs+"\n";
        }
        System.out.println(report);

    }
}
