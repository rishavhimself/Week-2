 // Book class with default and parameterized constructors
 class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Books {

    public static void main(String[] args) {
        // Test Book class
        Book defaultBook = new Book();
        Book paramBook = new Book("Java Programming", "John Doe", 29.99);
        defaultBook.displayDetails();
        paramBook.displayDetails();
    }
}
