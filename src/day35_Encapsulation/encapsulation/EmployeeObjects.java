package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee("Tatiana",'F',29,100000);
        System.out.println(employee1);
        employee1.setAge(32);
        System.out.println(employee1);
      Employee employee2= new Employee("Augyn",'F',32,123000);

    }
}
