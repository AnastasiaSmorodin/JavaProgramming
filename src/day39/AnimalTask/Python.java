package day39.AnimalTask;

public class Python extends WildAnimal{
    public Python(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }
         @Override
    public void eat() {
        System.out.println(getName() + "  "+ getBreed() + " is eating whatever it sees on his way ");
    }

    public void alsoaProgrammingLanguage() {
        System.out.println(getName() + "  "+ getBreed() + " is also a programming language ");
    }
}
