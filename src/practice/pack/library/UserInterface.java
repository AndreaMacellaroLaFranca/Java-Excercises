package practice.pack.library;

import java.util.Scanner;

public class UserInterface {

    public void begin(){

        LibraryManager library = new LibraryManager();
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));
        library.addBook(new Book("Animal Farm", "George Orwell", "9780451526342"));
        library.addBook(new Book("Brave New World", "Aldous Huxley", "9780060850524"));
        library.addBook(new Book("Fahrenheit 451", "Ray Bradbury", "9781451673319"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA BOOK SHOP!");
        int action = 0;

        do {
            System.out.println("1. Visualize our full library list.\n2. Search a book by its author.\n3. Rent a book.\n0. Exit");
            System.out.print("Digit the number of your choice: ");
            action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 1:
                    library.listBooks();
                    break;

                case 2:
                    System.out.print("Insert author name: ");
                    library.findBooksByAuthor(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter the ISBN of the book to rent: ");
                    String isbn = sc.nextLine();
                    library.removeBook(isbn); // This will remove the book based on the ISBN
                    System.out.println("Book with ISBN " + isbn + " has been rented.");
                    break;// End the case

                case 0:
                    System.out.print("Thank you for choosing us!");
                    break;

            }

        }while (action!=0);

    }
}
