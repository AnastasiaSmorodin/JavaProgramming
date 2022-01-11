package day32;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee emp1= new Employee("Aaron");

        Employee emp2= new Employee("Aaron",'f');
        System.out.println(emp1);
        System.out.println(emp2);
  Employee emp3= new Employee("Ana",'f',"sdet");
        System.out.println(emp3);
    }
}
