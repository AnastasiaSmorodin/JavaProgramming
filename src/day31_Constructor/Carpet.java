package day31_Constructor;

public class Carpet {
    public double width,length,unitPrice;
    public boolean isPersian;

    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        if(isPersian==true){
        return width*length*unitPrice+200;}
        else{
            return width*length*unitPrice;

            }

    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian + "  total price="+calcCost()+
                '}';
    }
}


