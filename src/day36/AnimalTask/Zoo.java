package day36.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setInfo("Lucy","spaniel",'F',11,"large","black");
        Cat cat1= new Cat();
        Tiger tiger1= new Tiger();
        tiger1.setInfo("Shein","tiger",'M',5,"large","gold");
        cat1.setInfo("Murka","persian",'F',4,"small", "white");


        cat1.scratch();
        cat1.meow();
        tiger1.eat();
        tiger1.sleep();
        tiger1.drink();
        tiger1.move();

        tiger1.roar();
        tiger1.hunt();

        System.out.println(tiger1);
    }
}
