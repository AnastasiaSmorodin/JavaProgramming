package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setInfo("Anna",'F',22,2430,'A');
        Student student2= new Student();
        student2.setInfo("hulya",'F',39,2431,'B');
        Student student3= new Student();
        student3.setInfo("Sergei",'M',28,2432,'C');
        Student student4= new Student();
        student4.setInfo("Irina",'F',19,2433,'D');
        Student student5= new Student();
        student5.setInfo("Slava",'F',19,2434,'D');

        Student[] students={student1,student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("___________________________");
        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>();
        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);




    }
}
