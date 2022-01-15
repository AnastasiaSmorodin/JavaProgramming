package day39.AnimalTask;

public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating animals while they are drinking");
    }

    public void layingEggs() {
        System.out.println(getName() + "  "+ getBreed() + " is laying eggs when it season ");
    }

}
