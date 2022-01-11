package day7_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        //assignment := assigns the data to variable
        int number = 100;
        System.out.println("number = " + number);
        number=200;
        System.out.println("number = " + number);
        String word = "Java Programming";
        System.out.println("word = " + word);
        
        word = "Wooden Spoon";
        System.out.println("word = " + word);
        // += addition assignment operator it helps increase the value of variable
        int x= 100;
        x+=200;// x+=200 is a short cut for x=x+200 =300
        System.out.println("x = " + x);
        
        String str = "Wooden";
        str+=" Spoon";
        System.out.println("str = " + str);//Wooden Spoon will be printed result

        double availableBalance=1000.50;
        // - 500$
        availableBalance -=500 ;
        System.out.println("availableBalance = " + availableBalance);
        //-= only for integers.

        double salary = 50000.50;
        // in order to double salary we need to *2 so we use salary*=2
        salary *=2;
        System.out.println("salary = " + salary);
        
        
        double num2 = 25000;
        //if you want to divide by 2 you need to do:
        num2 /=2;
        System.out.println("num2 = " + num2);// result will be devided by 2 so 12500.0
        System.out.println("______________________");
        double num3 = 100;
        //%=  if you want to assighn to variable the remainder.

        num3 %=3;
        System.out.println("num3 = " + num3); //100/3= 33  and 1 ostatok
        //print will be 1.0

        int amount = 127;//cents
        int quarters = 127/25;
        int cents = 127 %5;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        
        int cents2=127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2);//

        int y=300;
        y %=16;
        System.out.println("y = " + y);// will show remainder of 300 divided by 16
        










        

    }
}
