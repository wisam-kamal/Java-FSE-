import java.util.*;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Qty: " + quantity + ", Price: ₹" + price;
    }
}

class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String id, int newQty, double newPrice) {
        Product p = products.get(id);
        if (p != null) {
            p.setQuantity(newQty);
            p.setPrice(newPrice);
        }
    }

    public void deleteProduct(String id) {
        products.remove(id);
    }

    public void displayAll() {
        for (Product p : products.values()) {
            System.out.println(p);
        }
    }
}
