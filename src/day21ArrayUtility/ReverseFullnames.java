package day21ArrayUtility;



public class ReverseFullnames {
    public static void main(String[] args) {
        String [] names= {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya",
                "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
        for(String each: names){//going to get us each name
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);//each caracter from name



            }
            System.out.println(reverse);
        }
        System.out.println();
    }
}
