package day11Switch_Scanner;

public class BrowserName {
    public static void main(String[] args) {
        String browsername="firefox", result="";
        switch(browsername){
            case "chrome":
                result= "Chrome browser is selected";
                break;
            case "edge":
                result="edge browser is selected";
                break;
            case "opera":
                result="opera browser is selected";
                break;
            case " safari":
                result="safari browser was selected;";
                break;
            case "firefox":
                result="firefox browser was selected";
                        break;
            default:
               result= "Invalid browser";}

        System.out.println(result);


        }

        }


