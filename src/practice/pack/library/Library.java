package practice.pack.library;

import java.util.List;

public interface Library {

    void addBook(Book book);

    void removeBook(String isbn);

    List<Book> listBooks();

    List<Book> findBooksByAuthor(String author);
}
