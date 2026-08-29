package P1;

public class laptop {
    private String Brand;
    private int ramSize;

    public laptop(String brand, int ramSize) {
        this.Brand = brand;
        this.ramSize = ramSize;
    }
    // Method 1
    public void powerOn() {
        System.out.println("Laptop " + Brand + " berhasil dinyalakan.");
    }
    // Method 2
    public void openApp(String appName) {
        System.out.println("Membuka aplikasi " + appName + " pada laptop.");
    }
    // Method 3 
    public void printInfo() {
        System.out.println("=== Info Laptop ===");
        System.out.println("Brand : " + Brand);
        System.out.println("RAM   : " + ramSize + " GB\n");
    }
}