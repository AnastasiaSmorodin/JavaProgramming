package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setInfo("Mercedes","Benz","red",2020,43500);
        System.out.println(car1);
        car1.drive();
        car1.start();
        car1.stop();

        Car car2= new Car();
        car2.setInfo("Honda","Civic","Silver",2019,30000);
        System.out.println(car2);
        car2.drive();
        car2.start();
        car2.stop();
        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Red", 2019, 40000);

        System.out.println(car3);

        ArrayList<Car>carslist=new ArrayList<>();
        carslist.addAll(Arrays.asList(car1,car2));
       for(Car each: carslist){
           System.out.println(each.brand+":"+each.price);
       }
          carslist.removeIf(p-> p.brand.equals("Honda")&& p.year>=2005 && p.year<=2008);
        carslist.removeIf(p-> p.brand.equals("Mercedes")&& p.year>=1995 && p.year<=1997);

    }
}
