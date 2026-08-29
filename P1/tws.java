package P1;

public class tws {
    private String brand;
    private int batteryLevel;

    public tws(String brand, int batteryLevel) {
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }
    // Method 1
    public void connectBluetooth() {
        System.out.println("TWS " + brand + " terhubung ke perangkat.");
    }
    // Method 2
    public void playMusic() {
        System.out.println("Memutar audio melalui TWS.");
    }
    // Method 3 
    public void printInfo() {
        System.out.println("=== Info TWS ===");
        System.out.println("Brand   : " + brand);
        System.out.println("Battery : " + batteryLevel + "%\n");
    }
}