package day31_Constructor.RestarauntTask;

import day31_Constructor.ScrumTask.Developer;
import day31_Constructor.ScrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaraunt {
    public String owner, location;
    public int numbersOfStars;
    public ArrayList<Server> serversList= new ArrayList<>();
    public ArrayList<Chef >chefsList= new ArrayList<>();

    public Restaraunt(String owner, String location, int numbersOfStars) {
        this.owner = owner;
        this.location = location;
        this.numbersOfStars = numbersOfStars;
    }
    public void  hireServer(Server server){
        serversList.add(server);
    }
    public void   hireServer(Server [] servers){
        serversList.addAll(Arrays.asList(servers));
    }
    public void  hireChef(Chef chef){
        chefsList.add(chef);
    }
    public void  hireChef(Chef [] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.equals(employeeID));
    }
    public void terminateServer(int employeeID){
        serversList.removeIf(p-> p.equals(employeeID));
    }

    public String toString() {
        return "Restaraunt{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numbersOfStars=" + numbersOfStars +
                ", serversList=" + serversList.size() +
                ", chefsList=" + chefsList.size() +
                '}';
    }
}
