// create Book Class
class Book {
    private static  String libraryName="ABC Library";   
    private String author;
    String title;
    final String ISBN;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Display Method
    void toDisplayInfo(){
        System.out.println("Book of : "+libraryName);
        System.out.println("Title of the Book :"+ title);
        System.out.println("Author of the Book :"+ author);
        System.out.println("ISBN : "+ISBN);
    }


    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    
}

// Subclass to demonstrate access to public and protected members
class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Accessing private member through getter
    }

    
}

public class Library {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456-789", "Java Programming", "John Doe");
        if(ebook instanceof Book){
            System.out.println("The given object is an instance of Book Class ");
            
            //Method calling
            ebook.toDisplayInfo();
            ebook.displayDetails();
        } 
    }
}
