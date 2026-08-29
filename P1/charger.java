package P1;

public class charger {
    protected String brand;
    protected int wattage;

public charger(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    // Method 1
public void plugIn() {
    System.out.println("Charger " + brand + " terhubung ke listrik.");
    }
    // Method 2
public void unplug() {
    System.out.println("Charger " + brand + " dicabut dari listrik.");
    }
    // Method 3
public void printInfo() {
    System.out.println("=== Info Charger ===");
    System.out.println("Brand   : " + brand);
    System.out.println("Wattage : " + wattage + "W\n");
    }
}