package day39.Shapes;

public class Shapes {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null){
            System.err.println("Name can not be null");
            System.exit(1);//unexpected event
        }
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shapes(String name) {
        setName(name);
    }

    public double area(){
       return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                " name='" + name + '\'' +
                ", area='" + area()+ '\'' +
                ", perimiter='" + perimeter() + '\'' +
                '}';
    }
}
