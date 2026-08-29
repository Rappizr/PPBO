package P1;

public class chargerHP extends charger{
    private String portType;
    private boolean isFastCharging;

public chargerHP(String brand, int wattage, String portType, boolean isFastCharging) {
        super(brand, wattage);
        this.portType = portType;
        this.isFastCharging = isFastCharging;
    }
    // Method 1
    public void chargePhone() {
        System.out.println("Mengisi daya smartphone via port " + portType);
    }
    // Method 2
    public void activateFastCharge() {
        System.out.println("Status fast charge: " + isFastCharging);
    }
    // Method 3 
    @Override
    public void printInfo() {
        System.out.println("=== Info Charger HP ===");
        System.out.println("Brand         : " + brand);
        System.out.println("Wattage       : " + wattage + "W");
        System.out.println("Port Type     : " + portType);
        System.out.println("Fast Charging : " + isFastCharging + "\n");
    }
}