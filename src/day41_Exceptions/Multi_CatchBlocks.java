package day41_Exceptions;

import day39.PersonTask.Employee;

public class Multi_CatchBlocks {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("first catch block");
            e.printStackTrace();

         }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        } catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }


        try {
            System.out.println("______________________________________");
            System.out.println("Java".charAt(-1));
        } catch (RuntimeException e){
           e.printStackTrace();
        }
    }
}
