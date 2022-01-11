package day11Switch_Scanner;

import org.w3c.dom.ls.LSOutput;

import java.sql.PreparedStatement;

public class CydeoBatches {
    public static void main(String[] args) {
        String batch = "US morning", result = "";
        switch (batch) {
            case "US morning":
                result = "Class times are 10-5 EST.M,T,Th,F";
                break;
            case "US evening":
                result = "Class times are 7-10 EST.M,T,W,Th,S,S";
                break;
            case "EU":
                result = "Class times are 10-5 EST. M,T,W,Th,F.";
                break;
            default:
                result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("________________");

        if (batch == "US morning" || batch == "US evening" || batch == "EU") {

            if (batch == "US morning") {
                result = "Class times are 10-5 EST.M,T,Th,F";
            } else if (batch == "US evening") {
                result = "Class times are 7-10 EST.M,T,W,Th,S,S";
            } else {
                result = "Class times are 10-5 EST. M,T,W,Th,F.";
            }
        } else {
            result = "Invalid number";
        }
        System.out.println(result);


        System.out.println("______________________");
        if (batch == "US morning" || batch == "US evening" || batch == "EU") {
            switch (batch) {
                case "US morning":
                    result = "Class times are 10-5 EST.M,T,Th,F";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST.M,T,W,Th,S,S";
                    break;
                default:
                    result = "Class times are 10-5 EST. M,T,W,Th,F.";
            }
        } else {
            result = "Invalid number";
        }
        System.out.println(result);







        }






        }











