package day24CustomMethodsReturn;

public class ReturnStatement2 {
    public static void main(String[] args) {
        montname(14);
    }
    public static void montname(int monthnumber) {
        if(monthnumber<1|| monthnumber>12){
            System.out.println("invalid");
            return;
        }
        String montname = (monthnumber == 1) ? "January" : (monthnumber == 2) ? "February" :
                (monthnumber == 3) ? "March" : (monthnumber == 4) ? "April" :
                        (monthnumber == 5) ? "May" : (monthnumber == 6) ? "April" :
                                (monthnumber == 7) ? "July" : (monthnumber == 8) ? "Aug" :
                                        (monthnumber == 9) ? "Sept" : (monthnumber == 10) ? "Oct" :
                                                (monthnumber == 11) ? "Nov" : "Dec";
        System.out.println(montname);
    }



}
