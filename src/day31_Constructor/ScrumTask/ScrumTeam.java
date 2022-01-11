package day31_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Tester>testersList= new ArrayList<>();
    public ArrayList<Developer>devopList= new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
      testersList.add(tester);



        }

        public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
        }

        public void addDeveloper(Developer developer){
        devopList.add( developer);
        }

    public void addDevelopers(Developer[] developers){
        devopList.addAll(Arrays.asList(developers));
    }

        public void removeTester(int employeeId){
        testersList.removeIf(p-> p.employeeId==employeeId);



        }

        public void removeDeveloper(int employeeId){
        devopList.removeIf(p-> p.employeeId==employeeId);
        }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}


