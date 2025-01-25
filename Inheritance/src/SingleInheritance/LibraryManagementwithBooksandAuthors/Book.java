package SingleInheritance.LibraryManagementwithBooksandAuthors;

// Define the superclass
class Book {
    protected String title;
    protected int publishYear;

    // Constructor
    Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    // Implementation of displayDetails
    protected void displayDetails() {
        System.out.println("Title of the book : " + this.title);
        System.out.println("Book Published in  : " + this.publishYear);
    }
}