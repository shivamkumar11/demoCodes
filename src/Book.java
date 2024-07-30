import java.util.ArrayList;

public class Book {
    private final int bookId;
    private final String bookName;
    private final String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public static void main() {
        ArrayList<Book> bookData = new ArrayList<>();
        bookData.add(new Book(1, "Post Office", "Rabindra Nath Tagore"));
        bookData.add(new Book(2, "Malgudi Day", "RK Naryana"));
        bookData.add(new Book(3, "Untouchable", "Mulk Raj Anand"));
        bookData.add(new Book(4, "Don Quixote", "Miguel de Cervantes"));

        for (Book books : bookData) {
            System.out.print(STR."""
            Book id: \{books.bookId}
            Book name: \{books.bookName}
            Book author: \{books.authorName}
            """);
            System.out.println("**************************************************");
        }
    }

}
