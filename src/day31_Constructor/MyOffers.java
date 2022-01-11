package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
       Offer offer1=new Offer();
        offer1.setInfo("Florida","ABC","SDET",100000,true,true,true,true);

        Offer offer2=new Offer();
        offer2.setInfo("Utah","Amazon","SDET",120000,true,true,true,true);

        Offer offer3=new Offer();
        offer3.setInfo("Alabama","Google","QA",110000,true,true,true,true);
        Offer offer4= new Offer();
        offer4.setInfo("Georgia","Apple","BA",120000,false,false,false,false);
        Offer offer5= new Offer();
        offer5.setInfo("Florida","Apple","Scrum Master",10000,false,false,false,false);
        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        Offer[] myOffers= {offer1,offer2,offer3,offer4,offer5};
        ArrayList<Offer>fulltimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fulltimeOffers.removeIf(p-> !p.isFullTime);//removes if offer is not fulltime
        System.out.println(fulltimeOffers.size());

        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("Alabama"));
        System.out.println(localOffers.size());





    }

}
