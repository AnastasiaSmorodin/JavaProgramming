package day39.DeviceTask;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone= new Iphone("13",1000,true,true);
        BlackBerry blackBerry= new BlackBerry("i35",350,true,true);
        Google google= new Google("2", 900,true,true);
        Nokia nokia= new Nokia("3310",50,true,true);
        Samsung samsung=new Samsung("galaxy",800,true,true);
        PersonalComputer personalComputer= new PersonalComputer("HP","z500",12000,true,true);
        Laptop laptop= new Laptop("Lenovo","i3",12000,true,true);
        Desctop desctop= new Desctop("Samsung", "wds350",700,true,true );
        TV tv= new TV("Sony","200",2000,true,true);

        iphone.islowBattery();
        blackBerry.secure();
        google.xtraFeatures();
        nokia.notPopular();
        samsung.isBlowing();
        personalComputer.cantMove();
        laptop.touchScreen();
        tv.getModel();
        tv.channelUp();

    }
}
