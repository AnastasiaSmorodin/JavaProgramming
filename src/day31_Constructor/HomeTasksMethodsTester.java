package day31_Constructor;

import day31_Constructor.RestarauntTask.Server;

public class HomeTasksMethodsTester {
    public static void main(String[] args) {
      SalaryCalculator salary1  =new SalaryCalculator(12,7.5,6.5,40);
        System.out.println(salary1);

        AddressTask adress1= new AddressTask("1233","Dancing cloud", "Destin","Fl",32541);
        System.out.println(adress1);
        System.out.println("____________________________________");

Item item1= new Item("cola",5,2);
System.out.println(item1);
        System.out.println("_______________________________");

Carpet carpet1= new Carpet();
carpet1.customOrder(5.5,4.5,100,false);
        System.out.println(carpet1);

        Server server1= new Server();
        server1.setInfo("a",122,34,false);
        System.out.println(server1);





    }
}
