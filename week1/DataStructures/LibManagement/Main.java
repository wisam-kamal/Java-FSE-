public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("B101", "Java Programming", "John Doe"),
                new Book("B102", "Data Structures", "Alice Smith"),
                new Book("B103", "Algorithms", "Bob Brown"),
                new Book("B104", "Operating Systems", "Jane White")
        };

        System.out.println("Linear Search Result:");
        Book result1 = LibrarySearch.linearSearch(books, "Algorithms");
        System.out.println(result1 != null ? result1 : "Not Found");

        Book[] sortedBooks = LibrarySearch.sortByTitle(books);
        System.out.println("\nBinary Search Result:");
        Book result2 = LibrarySearch.binarySearch(sortedBooks, "Algorithms");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}
