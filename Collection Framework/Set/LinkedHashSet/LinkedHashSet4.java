
//custom class (Books) Objects inside hashset
import java.util.*;

class Book {
    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    // for handling duplicate objects we need to override theese methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return bookId == other.bookId && Objects.equals(title, other.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, title);
    }
}

public class LinkedHashSet4 {
    public static void main(String[] args) {
        // creating the linkedhashset
        LinkedHashSet<Book> set = new LinkedHashSet<>();
        // adding the data to the set
        set.add(new Book(1, "Java"));
        set.add(new Book(2, "Java")); // Duplicate name but id is different so this will add
        set.add(new Book(3, "Algorithm"));
        set.add(new Book(4, "Brain"));
        set.add(new Book(5, "Coding"));

        // Print the data
        System.out.println("Printing the set elements: ");
        System.out.println("BookId   |  Book Title ");
        for (Book b : set) {
            System.out.println("  " + b.bookId + "      " + b.title);
        }
        Book b1 = new Book(101, "Java Basics");
        Book b2 = new Book(101, "Java Basics");
        Book b3 = new Book(102, "Advanced Java");

        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
    }

}
