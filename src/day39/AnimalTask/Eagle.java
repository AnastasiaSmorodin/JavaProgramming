package day39.AnimalTask;

public class Eagle extends WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating everything it can see");
    }

    public void see(){
        System.out.println(getName()+" "+ getBreed()+" has the best vision");
    }
}
