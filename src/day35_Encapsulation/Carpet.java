package day35_Encapsulation;

public class Carpet {
      private double width, length;
      private  double unitPrice;
      private boolean isPersian;

      public double getWidth() {
            return width;
      }

      public double getLength() {
            return length;
      }

      public double getUnitPrice() {
            return unitPrice;
      }

      public boolean isPersian() {
            return isPersian;
      }

      public void setWidth(double width) {
            if(width<=0)
                  System.exit(0);
            this.width = width;
      }

      public void setLength(double length) {
            if(length<=0)
                  System.exit(0);
            this.length = length;
      }

      public void setUnitPrice(double unitPrice) {
            if(unitPrice<=0)
                  System.exit(0);
            this.unitPrice = unitPrice;
      }

      public void setPersian(boolean persian) {
            isPersian = persian;
      }

      public Carpet(double width, double length, double unitPrice, boolean isPersian) {
            setWidth(width);
            setLength(length);
            setUnitPrice(unitPrice);
            setPersian(isPersian);
      }
      public double calcCost(){
            if(isPersian==true){
            return width*length*unitPrice+200;}
            else return width*length*unitPrice;

      }

      public String toString() {
            return "Carpet{" +
                    "width=" + width +
                    ", length=" + length +
                    ", unitPrice=" + unitPrice +
                    ", isPersian=" + isPersian +
                    "total price="+calcCost()+
                    '}';
      }
}
