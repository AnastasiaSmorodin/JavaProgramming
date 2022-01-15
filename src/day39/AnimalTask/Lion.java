package day39.AnimalTask;

public class Lion extends WildAnimal {
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating poor little animals ");
    }
    public void strong(){
        System.out.println(getName()+ " "+ getBreed()+ " is the strongest animal in the wild");
    }
}
