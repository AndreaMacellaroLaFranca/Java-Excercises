package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager implements Library {

    List<Book> listBooks = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        listBooks.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        for (Book book : listBooks){
            if (book.getIsbn().equalsIgnoreCase(isbn)){
                listBooks.remove(book);
                break;
            }
        }
    }

    @Override
    public List<Book> listBooks() {
        for(Book book : listBooks){
            System.out.println(book.toString());
        }
        return listBooks;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        for (Book book : listBooks){
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println(book.toString());
            }
        }return listBooks;
    }

}
