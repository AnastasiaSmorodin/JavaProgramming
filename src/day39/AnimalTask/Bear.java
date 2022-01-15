package day39.AnimalTask;

public class Bear extends WildAnimal{
    public Bear(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating roots and fish ");
    }
    public void fishing() {
        System.out.println(getName() + "  "+ getBreed() + " are the nest fishers ");
    }
}
