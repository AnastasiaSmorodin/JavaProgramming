package day33;

public class Emailask {
    public static void main(String[] args) {
        /*
        6). Create a class called EmailTask2.
        Assume that email address is constructed by person's first name and followed by an underscore and last name.
        Write a program that will print out information about user based on email. Print first name, last name, and domain.
                First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
        Ex: input:craig_federighi@apple.com
        Output:
        First name: Craig
        Last name: Federighi
        Domain: apple*/
         String email= "anastasia_smorodin@gmail.com";
         String firstName=email.substring(0,1).toUpperCase()+ email.substring(1,email.indexOf("_"));
         String lastName= email.substring(email.indexOf("_")+1,email.indexOf("_")+2).toUpperCase()+email.substring(email.indexOf("_")+2,email.lastIndexOf("@"));
         String domaine= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domaine = " + domaine);


   
    }   
    
    
}
