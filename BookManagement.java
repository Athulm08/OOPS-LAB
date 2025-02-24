import java.util.Scanner;

// Base class: Publisher
class Publisher {
    String publisherName;

    // Constructor
    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }

    // Method to display publisher details
    void displayPublisher() {
        System.out.println("Publisher: " + publisherName);
    }
}

// Derived class: Book (Inherits Publisher)
class Book extends Publisher {
    String bookTitle;
    String authorName;

    // Constructor
    Book(String publisherName, String bookTitle, String authorName) {
        super(publisherName); // Call to Publisher class constructor
        this.bookTitle = bookTitle;
        this.authorName = authorName;
    }

    // Method to display book details
    void displayBook() {
        displayPublisher();
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + authorName);
    }
}

// Subclass 1: Literature (Inherits Book)
class Literature extends Book {
    String genre;

    Literature(String publisherName, String bookTitle, String authorName, String genre) {
        super(publisherName, bookTitle, authorName);
        this.genre = genre;
    }

    void display() {
        System.out.println("\n[Literature Book Details]");
        displayBook();
       
   System.out.println("Genre: " + genre);
    }
}

// Subclass 2: Fiction (Inherits Book)
class Fiction extends Book {
    String category;

    Fiction(String publisherName, String bookTitle, String authorName, String category) {
        super(publisherName, bookTitle, authorName);
        this.category = category;
    }

    void display() {
        System.out.println("\n[Fiction Book Details]");
        displayBook();
        System.out.println("Category: " + category);
    }
}

// Main class
public class BookManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get Literature book details
        System.out.println("Enter details for Literature book:");
        System.out.print("Publisher Name: ");
        String pub1 = sc.nextLine();
        System.out.print("Book Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author Name: ");
        String author1 = sc.nextLine();
        System.out.print("Genre: ");
        String genre = sc.nextLine();

        // Get Fiction book details
        System.out.println("\nEnter details for Fiction book:");
        System.out.print("Publisher Name: ");
        String pub2 = sc.nextLine();
        System.out.print("Book Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author Name: ");
        String author2 = sc.nextLine();
        System.out.print("Category: ");
        String category = sc.nextLine();

        // Create objects
        Literature litBook = new Literature(pub1, title1, author1, genre);
        Fiction ficBook = new Fiction(pub2, title2, author2, category);

        // Display book details
        litBook.display();
        ficBook.display();

        sc.close();
    }
}

