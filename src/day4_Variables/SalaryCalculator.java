package day4_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours
        int hourlyRate = 65;
        int weeklyHours = 45;
        int salary = hourlyRate * weeklyHours * 52;//52 weeks in a year
        System.out.println(salary);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("salary = $" + salary);
        // soutv helps you to print a variable its a shortcut
        System.out.println("salary = $" + salary);
        System.out.println("hourlyRate =$ " + hourlyRate);




    }
}
