package day35_Encapsulation;

public class Items {
    private String name;
    private double unitPrice;
    private int quantity;

    public Items(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetterOrDigit(name.charAt(i))) || Character.isDigit(name.charAt(0)) || name.isEmpty()
                    || name.isBlank()) return;
        }
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0)
            System.exit(0);
        this.unitPrice = unitPrice;
    }


    public void setQuantity(int quantity) {
        if (quantity <= 0 || (name.equalsIgnoreCase("toilet paper") && quantity != 1)) return;

        this.quantity = quantity;
    }

    public double calCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total Cost=" + calCost() +
                '}';

    }
}



