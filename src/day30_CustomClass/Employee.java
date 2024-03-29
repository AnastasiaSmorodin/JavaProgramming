package day30_CustomClass;

public class Employee {
    public String name;
    public int id;
    public char gender;
    public String jobTitle;
    public int salary;
    public boolean isFullTime;

    public void setInfo(String name, int id, char gender, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work() {
        System.out.println(name + "working tonight as a" + jobTitle);
    }
}


