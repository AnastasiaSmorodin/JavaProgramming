package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee empl1= new Employee();
        empl1.setInfo("Alex",2440,'M',"server", 4500,true);
        Employee empl2= new Employee();
        empl2.setInfo("Alex",2440,'M',"server", 4500,true);
        Employee empl3= new Employee();
        empl3.setInfo("Alex",2440,'M',"server", 4500,true);
        Employee empl4= new Employee();
        empl4.setInfo("Alex",2440,'M',"server", 4500,true);
        Employee empl5= new Employee();
        empl5.setInfo("Alex",2440,'M',"server", 4500,true);

        Employee[] employees= {empl1,empl2,empl3,empl4,empl5};
        

    }
}
