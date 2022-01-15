package day39.AnimalTask;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName()+ " "+ getBreed()+ " is scratching my couch!Go away!!!");
    }
    public void eat(){
        System.out.println(getName()+ " "+getBreed()+ "is eating cat food");
    }
}
