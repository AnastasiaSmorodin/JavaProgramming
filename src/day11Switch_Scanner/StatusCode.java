package day11Switch_Scanner;


public class StatusCode {
    public static void main(String[] args) {
       int statusCode= 200;
       String result ="";

       switch(statusCode){
           case 200 :
               result = "OK";
               break;
           case 201:
               result= "Created";
               break;
           case 202:
               result =" Accepted";
               break;
           case 301:
               result="Moved Permanently";
               break;
           case 303 :
               result= "See other";
               break;
           case 304 :
               result= " Not Modified";
               break;
           case 307 :
               result = "Temporary Redirect";
               break;
           case 400:
               result= "Bad request";
               break;
           case 401:
               result="Unauthorized";
               break;
           case 403:
               result="Forbidden";
               break;
           case 404:
               result="Not found";
               break;
           case 410:
               result= "Gone";
               break;
           case 500:
               result= "Internal Server Error";
           default:
               result="Service unavalilble"; }

        System.out.println(result);

















    }
}
