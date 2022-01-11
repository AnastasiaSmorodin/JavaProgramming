package day31_Constructor.RestarauntTask;

public class Server {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public void setInfo(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void takeOrder(){
        System.out.println(name +" is taking an order");
    }
    public void cleanTable(){
        System.out.println(name+"  is cleaning the table");
    }

    public String toString() {
        String fullOrPart = (fullTime)? "full-time" : "part-time";
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullorPartTime=" + fullOrPart +
                '}';
    }
}
