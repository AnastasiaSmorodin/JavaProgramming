package day24CustomMethodsReturn;
/*1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has

 */



public class WarmupTasks {
    public static void main(String[] args) {
        initials("Anastasia", "Smorodin");
        domain("anastasiasmo@gmail.com");
        monthname(3);

    }


    public static void initials(String firstName, String lastname) {
        System.out.println(firstName.charAt(0) + "." + lastname.charAt(0));
    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.length());
        System.out.println(domain);
    }


    public static void monthname(int monthnumber) {
        String montname = "";
        if (monthnumber >= 1 && monthnumber <= 12) {
            montname = (monthnumber == 1) ? "January" : (monthnumber == 2) ? "February" :
                    (monthnumber == 3) ? "March" : (monthnumber == 4) ? "April" :
                            (monthnumber == 5) ? "May" : (monthnumber == 6) ? "April" :
                                    (monthnumber == 7) ? "July" : (monthnumber == 8) ? "Aug" :
                                            (monthnumber == 9) ? "Sept" : (monthnumber == 10) ? "Oct" :
                                                    (monthnumber == 11) ? "Nov" : "Dec";

        } else {
            montname = "invalid";

        }
        System.out.println(montname);
    }







}




