package day37ConstructorPractices.PhoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("13", "proMax", 1300, "grey");
        Samsung samsung= new Samsung("galaxy", "a19", 1000,"black");
        Nokia nokia= new Nokia("3310","4 inch",50, "Gray;" );

        System.out.println(iphone);
        System.out.println(nokia);
        System.out.println(samsung);
        iphone.call(911);
        iphone.text(345665434);
        iphone.faceTime(234566543);
        iphone.faceTime("Aabgv@mail.ru");

        samsung.call(45676543);
        samsung.text(345765456);
        samsung.freeze();


        nokia.call(654367543);
        nokia.text(564345654);
        nokia.selfDefence();
    }

}
