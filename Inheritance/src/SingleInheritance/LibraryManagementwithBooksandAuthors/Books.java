package SingleInheritance.LibraryManagementwithBooksandAuthors;

// Main class
public class Books {
    public static void main(String[] var0) {

        // Create instances
        Book newBook = new Book("Intro to Java", 2012);
        Author newAuthor = new Author("Raxx", "NA", "Intro to Java", 2012);

        // Function Call
        newBook.displayDetails();
        newAuthor.displayDetails();
    }
}