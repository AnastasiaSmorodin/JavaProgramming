package day39.AnimalTask;

public class Parrot extends FriendlyAnimal {

    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }



    public void fly(){
        System.out.println(getName()+ " "+ getBreed()+ " is fluing in the sky");
    }
    public void eat(){
        System.out.println(getName()+ " is eating parrot food");
    }

    public void sing(){
        System.out.println(getName()+ " "+ getBreed()+ " is singing a beautiful song");
    }
}

