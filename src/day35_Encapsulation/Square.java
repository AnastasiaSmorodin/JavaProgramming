package day35_Encapsulation;

public class Square {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if(side<=0){
            System.exit(0);
        }
        this.side = side;
    }

    public Square(int side) {
        setSide(side);
    }
    //calcArea(): returns the area of square
   // calcPerimeter(): returns the perimeter of square
   // toString(): can display the side, area, perimeter of square when object is passed in print statement
       public  double calcArea(){
        return side*side;
    }
    public double calcPerimiter(){
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter="+calcPerimiter()+
                '}';
    }
}

