package day21ArrayUtility;

public class Initials {
    public static void main(String[] args) {
        String [] names= {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya",
                "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};
         for(String each: names){
             String initials= each.charAt(0)+"."+ each.charAt(each.indexOf(" ")+1);
             System.out.println(initials);

         }



    }
    }


