package day33;

public class CydeoStudents {

    String name;
        int age,id,batchNumber,groupNumber;
        char gender,grade;
        public static String schoolname= "Cydeo";
        public static String proggramingLanguage= "Java";

        public CydeoStudents(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.batchNumber = batchNumber;
            this.groupNumber = groupNumber;
            this.gender = gender;
            this.grade = grade;
        }
        public static void printSchoolName(){
            System.out.println(schoolname);
        }
        public static void printProgLanguage(){
            System.out.println(proggramingLanguage);
        }
        public void study(){
            System.out.println(name+ "is studying");
        }
        public void attendingClass(){
            System.out.println(name+ "is attending class");
        }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}

