public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("O101", "Alice", 4500),
                new Order("O102", "Bob", 1200),
                new Order("O103", "Charlie", 7300),
                new Order("O104", "David", 3300)
        };

        System.out.println("Sorted by Bubble Sort:");
        Order[] bubbleSorted = OrderSort.bubbleSort(orders.clone());
        for (Order o : bubbleSorted) {
            System.out.println(o);
        }

        System.out.println("\nSorted by Quick Sort:");
        Order[] quickSorted = orders.clone();
        OrderSort.quickSort(quickSorted, 0, quickSorted.length - 1);
        for (Order o : quickSorted) {
            System.out.println(o);
        }
    }
}
