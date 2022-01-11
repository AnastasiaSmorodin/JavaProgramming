package day35_Encapsulation.encapsulation;

public class PersonObjects {
    public static void main(String[] args) {
        Person person1= new Person();

        person1.setAge(30);
        person1.setName("Daniel");

        System.out.println(person1.getAge()+":"+person1.getName());

    }
}
