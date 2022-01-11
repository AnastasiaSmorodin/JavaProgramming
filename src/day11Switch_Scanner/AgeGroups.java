package day11Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age= 8;
        String ageGroup = "";

        switch (age){
            case 1: case 2:
                ageGroup = "Infant";
                break;
            case 3: case 4: case 5:
                ageGroup = "Toddler";
                break;
            case 6: case 7: case 8: case 9:
                ageGroup = "Kid";
                break;
            case 10: case 11: case 12:
                ageGroup = "Pre-teen";
                break;
            case 13: case 14: case 15: case 16: case 17:
                ageGroup = "Teen";
                break;
            case 18: case 19: case 20:
                ageGroup = "Young adult";
                break;
            case 21: case 22: case 23: case 24:
            case 25: case 26: case 27: case 28:
            case 29: case 30: case 31: case 32: case 33:
            case 34: case 35: case 36: case 37: case 38:
            case 39:
                ageGroup = "Adult";
                break;
            case 40: case 41: case 42: case 43: case 44:
            case 45: case 46: case 47: case 48:
            case 49:
                ageGroup = "Young Middle Age Adult";
                break;
            case 50: case 51: case 52: case 53: case 54:
                ageGroup = "Middle Age Adult";
                break;
            default:
                ageGroup = "Senior Citizen";
                break;

        }
        System.out.println(ageGroup);
    }
}



