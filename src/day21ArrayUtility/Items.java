package day21ArrayUtility;

public class Items {
    public static void main(String[] args) {
        String[]items={"Shoes","Jacket", "Gloves","Airpods","Ipad","Iphone case"};
        double[]prices={99.99,150.0,9.99,250.0,439.50,39,99};
        int[]itemsId={12345,123456,12347,12348,12349,12350};

        for (int i = 0; i <items.length ; i++) {
            String item=items[i];
            double price=prices[i];
            int id = itemsId[i];
            System.out.println(item+"-"+id+"-$"+price);

        }
    }
}
