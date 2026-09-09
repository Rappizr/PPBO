package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        
        Account from = new Account("Rappi", 5000000);
        Account to = new Account("Rafid", 2500000);

        from.transferTo(to, 1500000);

        from.printInfo();
        to.printInfo();
    }
}
