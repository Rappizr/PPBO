package P1;

public class chargerLaptop extends charger {
    private String adapterSize;
    private String connectorType;

public chargerLaptop(String brand, int wattage, String adapterSize, String connectorType) {
        super(brand, wattage);
        this.adapterSize = adapterSize;
        this.connectorType = connectorType;
    }
    // Method 1
    public void chargeLaptop() {
        System.out.println("Mengalirkan daya ke laptop via port " + connectorType);
    }
    // Method 2
    public void checkGrounding() {
        System.out.println("Grounding adapter " + adapterSize + " aman.");
    }
    // Method 3
    @Override
    public void printInfo() {
        System.out.println("=== Info Charger Laptop ===");
        System.out.println("Brand          : " + brand);
        System.out.println("Wattage        : " + wattage + "W");
        System.out.println("Adapter Size   : " + adapterSize);
        System.out.println("Connector Type : " + connectorType + "\n");
    }
}