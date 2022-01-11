package day22DementionalArray;

public class task2part2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] arrays : items) {
            for (int i = arrays.length - 1; i >= 0; i--) {
                System.out.print("\t"+arrays[i]);

            }
            System.out.println();
            }

        }
    }

