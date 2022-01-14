package day39.PersonTask;

public class Student  extends  Person {

    public Student(String name, int age, char gender, int studentId, String fieldOfstudy) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfstudy(fieldOfstudy);
    }

    private int studentId;
    private String fieldOfstudy;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfstudy() {
        return fieldOfstudy;
    }

    public void setFieldOfstudy(String fieldOfstudy) {
        this.fieldOfstudy = fieldOfstudy;
    }

    public void study(){
        System.out.println(getName()+"is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " +getName()+ " "+
                " ,age=" +getAge()+ " "+
                "studentId=" + studentId +
                ", fieldOfstudy='" + fieldOfstudy + '\'' +
                '}';
    }
}
