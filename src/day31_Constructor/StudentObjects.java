package day31_Constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student("Ana",29,'F','A',1234);
        System.out.println(student1);
        Student student2= new Student("Alex",28,'M','A',1235);
        System.out.println(student2);
    }
}
