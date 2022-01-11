package day22DementionalArray;

public class Task2Arrays {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] array : items) {
            for (String elements : array) {
                System.out.print("\t" + elements);

            }
            System.out.println();
        }
    }
}










