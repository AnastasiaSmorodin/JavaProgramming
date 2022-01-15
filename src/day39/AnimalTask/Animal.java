package day39.AnimalTask;



public class Animal {
    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
       setAge(age);
        setSize(size);
       setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            System.err.println("Invalid name");
            System.exit(1);
        } else if(name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if(breed==null){
            System.err.println("Invalid breed name");
            System.exit(1);
        } else if
        (breed.isBlank()|| breed.isEmpty()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null){
            System.err.println("Invalid color ");
            System.exit(1);
        } else if(color.isBlank()|| color.isBlank()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.color = color;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " is drinking");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }
    public void move(){
        System.out.println(name+ " is moving");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
