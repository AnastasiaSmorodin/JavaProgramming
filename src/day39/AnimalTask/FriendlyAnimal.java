package day39.AnimalTask;

public class FriendlyAnimal extends Animal {
    public boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
    public void play(){
        System.out.println( getName()+ " "+ getBreed()+ " is playing");
    }
    public void pet(){
        System.out.println(getName()+ " "+ getName()+ " is getting pet");
    }
}
