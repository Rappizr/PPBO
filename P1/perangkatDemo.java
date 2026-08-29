package P1;

public class perangkatDemo {
    public static void main(String[] args){

        laptop myLaptop = new laptop("Asus", 16);
        tws myTws = new tws("Soundcore", 90);
        charger baseCharger = new charger("Baseus", 65);
        chargerHP hpCharger = new chargerHP("Xiaomi", 67, "Type-C", true);
        chargerLaptop laptopCharger = new chargerLaptop("Asus", 150, "Besar", "Barrel");

        myLaptop.powerOn();
        myLaptop.openApp("Vscode");
        myLaptop.printInfo();

        // Eksekusi objek TWS
        myTws.connectBluetooth();
        myTws.playMusic();
        myTws.printInfo();

        // Eksekusi objek Charger
        baseCharger.plugIn();
        baseCharger.unplug();
        baseCharger.printInfo();

        // Eksekusi objek chargerHP
        hpCharger.chargePhone();
        hpCharger.activateFastCharge();
        hpCharger.printInfo();

        // Eksekusi objek chargerLaptop
        laptopCharger.chargeLaptop();
        laptopCharger.checkGrounding();
        laptopCharger.printInfo();
    }
}
