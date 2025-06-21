class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName.toLowerCase();
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

class ProductSearch {
    public static Product linearSearch(Product[] products, String targetName) {
        targetName = targetName.toLowerCase();
        for (Product product : products) {
            if (product.getProductName().equals(targetName)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;
        targetName = targetName.toLowerCase();

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductName().compareTo(targetName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static Product[] sortByName(Product[] products) {
        int n = products.length;
        Product[] sorted = products.clone();

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (sorted[j].getProductName().compareTo(sorted[min].getProductName()) < 0) {
                    min = j;
                }
            }
            Product temp = sorted[i];
            sorted[i] = sorted[min];
            sorted[min] = temp;
        }
        return sorted;
    }
}
