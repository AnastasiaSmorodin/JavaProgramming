package day32;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name){
        this.name= name;
    }
    public Employee(String name, char gender){
     this(name);
        this.gender= gender;
    }

    public Employee(String name,char gender,String jobTitle){
        this(name,gender);

        this.jobTitle= jobTitle;
    }
    public Employee(String name,char gender,String jobTitle,double Salary){
        this(name,gender,jobTitle);
        this.salary= salary;
    }

}
