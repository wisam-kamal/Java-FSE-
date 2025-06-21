public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P101", "Laptop", "Electronics"),
                new Product("P102", "Shampoo", "Personal Care"),
                new Product("P103", "Notebook", "Stationery"),
                new Product("P104", "Phone", "Electronics"),
                new Product("P105", "T-shirt", "Fashion")
        };

        System.out.println("Linear Search Result:");
        Product found1 = ProductSearch.linearSearch(products, "Phone");
        System.out.println(found1 != null ? found1 : "Not Found");

        Product[] sorted = ProductSearch.sortByName(products);
        System.out.println("\nBinary Search Result:");
        Product found2 = ProductSearch.binarySearch(sorted, "Phone");
        System.out.println(found2 != null ? found2 : "Not Found");
    }
}
