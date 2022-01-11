package day31_Constructor.ScrumTask;

import day30_CustomClass.Test;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 12, "SDET", 140000);
        Tester tester3 = new Tester("Alex", 13, "QA", 135000);
        Tester tester4 = new Tester("Lala", 14, "SDET", 115000);
        Tester[] testers = {tester2, tester3, tester4};
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 120000);
        Developer developer2 = new Developer("Olga", 24, "Java Developer", 125000);
        Developer developer3 = new Developer("Hulya", 23, "Java Master", 130000);
        Developer developer4 = new Developer("Turan", 26, "Software Developer", 135000);
        Developer developer5 = new Developer("Ana", 27, "Senior Developer", 140000);
        Developer[] developers = {developer2, developer3, developer4};
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper( developer1);

        System.out.println(scrum);
        System.out.println("___________________________________");
        for(Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name+":"+ eachTester.salary);
        }
        System.out.println("_______________________________");
        for(Developer eachDeveloper: scrum.devopList){
            System.out.println(eachDeveloper.name+":"+ eachDeveloper.salary);
        }
        System.out.println("_____________________________________");

    }
}
