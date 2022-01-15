package day39.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog= new Dog("lucy", "spaniel",'F',2,"small","golden",false,true,true);
        Cat cat= new Cat("puffy", "persian",'M',1,"medium","tricolor",false,true,true);
        Dolphin dolphin= new Dolphin("Eddy", "bottlenose",'F',5,"large","blue",true,true,true);
        Bear bear= new Bear("PoPO", "brown",'M',2,"large","brown",true,false,false);
        Crocodile crocodile= new Crocodile("Sharp", "english",'M',22,"small","green",true,false,false);
        Eagle eagle= new Eagle("Fighter", "american",'F',12,"medium","golden-white",true,false,false);
        Lion lion = new Lion("Roar", "african",'F',4,"large","golden",true,false,false);
        Parrot parrot= new Parrot("Anna", "unknown",'M',7,"large","multicolor",false,true,true);
        Python python= new Python("Phyton", "asian",'F',4,"large","black",true,false,false);
        Tiger tiger= new Tiger("Tiger", "unknow",'M',9,"large","white",true,false,false);
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(bear);
        System.out.println(crocodile);
        System.out.println(eagle);
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(python);
        System.out.println(tiger);
        dog.setName("Alsou");

        System.out.println(dog.getName());
        System.out.println(dog);
        dog.eat();
        dolphin.eat();
        crocodile.eat();
        parrot.eat();
        eagle.eat();
        tiger.eat();

        tiger.flirting();
        crocodile.layingEggs();
        parrot.sing();
        lion.strong();
        lion.eat();

    }
}
