package day33;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentId;
    public char grade;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }
    public Student(String name, char gender,int age) {
        this(name, gender);
        this.age=age;
    }
    public Student(String name, char gender,int age,int studentId) {
        this(name, gender,age);
        this.studentId=studentId;
    }

    public Student(String name, char gender,int age,int studentId ,char grade) {
        this(name, gender, age, studentId);
        this.grade = grade;
    }

    
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
