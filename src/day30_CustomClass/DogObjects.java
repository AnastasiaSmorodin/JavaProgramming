package day30_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.name="Justin";
        dog1.breed= "spaniel";
        dog1.age=13;
        dog1.gender='M';
        dog1.size= "medium";
        dog1.color="golden";

        Dog dog2= new Dog();
        dog2.name="ACE";
        dog2.breed="husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="large";
        dog2.color="grey";

Dog dog3= new Dog();
dog3.setInfo("Lucy","spaniel",3,'M',"small","black" );


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        dog1.eat();
        dog2.bark();



    }
}
