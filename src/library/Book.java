package library;

public class Book {
    private String title, author, isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("Book title: %s %nAuthor: %s %nISBN (International Standard Book Number): %s%n",getTitle(),getAuthor(),getIsbn());
    }
}
