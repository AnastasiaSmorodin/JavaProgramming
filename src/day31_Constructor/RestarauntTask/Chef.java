package day31_Constructor.RestarauntTask;

public class Chef {
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
    public void makeOrder(){
        System.out.println(name+" is making an order");
    }
    public void washDishes(){
        System.out.println(name+" is washing the dishes");
    }

    public String toString() {
        String fullOrPart = (fullTime)? "full-time" : "part-time";
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
