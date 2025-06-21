import java.util.*;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("P101", "Laptop", 10, 50000);
        Product p2 = new Product("P102", "Keyboard", 25, 800);
        Product p3 = new Product("P103", "Mouse", 30, 500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.updateProduct("P101", 15, 49000);
        inventory.deleteProduct("P102");

        inventory.displayAll();
    }
}
