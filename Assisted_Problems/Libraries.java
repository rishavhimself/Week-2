
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            System.out.println("Book borrowed successfully: " + title);
            available = false;
        } else {
            System.out.println("Sorry, the book is not available: " + title);
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}




class Library {
    private String libraryName;
    private String libraryAddress;
      
    private ArrayList<Book> books = new ArrayList<>();

    public Library(String libraryName, String libraryAddress ){
        this.libraryName=libraryName;
        this.libraryAddress=libraryAddress;
    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    public void displayDetails() {
        System.out.println("Name :" + libraryName);
        System.out.println("Address : " + libraryAddress);
        System.out.println("Books present :" );
        for(Book list: books){
            System.out.print(list+" ");
        }
    }
}


public class Libraries {

    public static void main(String[] args) {
        Library libraryA = new Library("Abc Library", "xyz");
        
        Book book1 = new Book("C++ Basics", "Jane Smith", 19.99, true);
        
        libraryA.addBook(book1);
        libraryA.displayDetails();
        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
    
    }
}