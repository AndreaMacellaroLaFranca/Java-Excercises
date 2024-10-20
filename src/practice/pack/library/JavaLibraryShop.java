package practice.pack.library;

public class JavaLibraryShop {
    public static void main(String[] args) {

        LibraryManager library = new LibraryManager();

        Book b1 = new Book("1984", "George Orwell", "9780451524935");
        Book b2 = new Book("Animal Farm", "George Orwell", "9780451526342");
        Book b3 = new Book("Brave New World", "Aldous Huxley", "9780060850524");
        Book b4 = new Book("Fahrenheit 451", "Ray Bradbury", "9781451673319");
        Book b5 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        System.out.println("\n--BOOK LIBRARY--\n");
        library.listBooks();

        System.out.println("\n\n--GEORGE ORWELL BOOKS--\n");
        library.findBooksByAuthor("George Orwell");

        library.removeBook("9780743273565");

        System.out.println("\n--BOOK LIBRARY--\n");
        library.listBooks();

    }
}
