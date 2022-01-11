package day35_Encapsulation;

public class CybertekStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;
    public  String fieldOfstudy;

    public static String schoolName;
    public static String programmingLanguage, secretCode;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfstudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfstudy = fieldOfstudy;
    }

    static {
        schoolName= "Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

  public static void printSchoolName(){
      System.out.println("school is"+ schoolName);
  }
    public static void printSecretCode(){
        System.out.println("school is"+ secretCode);}

    public static void printProgrammingLanguage(){
        System.out.println("school is"+ programmingLanguage);}

    public void attendClass(){
        System.out.println(name+ "is attending class");}

    public void study(){
        System.out.println(name+ "is studying");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfstudy='" + fieldOfstudy + '\'' +
                '}';
    }
}

