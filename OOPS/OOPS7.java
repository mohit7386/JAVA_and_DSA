//Copy Constructor 
class Book {
    String title;

    // Constructor
    Book(String Btitle) {
        title = Btitle;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
        // syntax
        // Class name(Class name variable name){
        // Var. name of class data members = var name.varnameClass
        // }
    }

    void display() {
        System.out.println("Book Title: " + title);
    }
}

// main class
public class OOPS7 {
    public static void main(String[] args) {
        // creating object
        Book B1 = new Book("JAVA Programming!");
        Book B2 = new Book(B1);
        B1.display();
        B2.display();
    }

}
