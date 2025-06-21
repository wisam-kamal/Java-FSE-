class Book {
    private String bookId;
    private String title;
    private String author;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title.toLowerCase();
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

class LibrarySearch {

    public static Book linearSearch(Book[] books, String targetTitle) {
        targetTitle = targetTitle.toLowerCase();
        for (Book b : books) {
            if (b.getTitle().equals(targetTitle)) {
                return b;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        int low = 0, high = books.length - 1;
        targetTitle = targetTitle.toLowerCase();

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareTo(targetTitle);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    public static Book[] sortByTitle(Book[] books) {
        Book[] sorted = books.clone();
        int n = sorted.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (sorted[j].getTitle().compareTo(sorted[min].getTitle()) < 0) {
                    min = j;
                }
            }
            Book temp = sorted[i];
            sorted[i] = sorted[min];
            sorted[min] = temp;
        }

        return sorted;
    }
}
