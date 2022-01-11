package day11Switch_Scanner;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber= 3;
        String result="";
        switch(floorNumber){
            case 1:
                result = "Floor 1 selected.Companies: Lobby, Verizon,Starbucks";
                break;
            case 2 :
                result= "Floor 2 selected.Compamies:Cybertek,Nasa,Intelast";
                break;
            case 3:
                result= "Floor 3 selected. Companies:Lyft,Bofa, Stake house";
                break;
            default:
                result= "Invalid floor-6";}
        System.out.println(result);

        }

    }

