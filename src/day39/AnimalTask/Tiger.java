package day39.AnimalTask;

public class Tiger extends WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating all the little rabbits");
    }

    public void flirting() {
        System.out.println(getName() + "  "+ getBreed() + " is flirting with opposite gender tiger ");
    }
}
