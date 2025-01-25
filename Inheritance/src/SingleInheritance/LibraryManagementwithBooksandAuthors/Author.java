package SingleInheritance.LibraryManagementwithBooksandAuthors;

// Define the subclass
class Author extends Book {
    protected String name;
    protected String bio;

    // Constructor
    Author(String name, String bio, String title, int publishYear) {
        super(title, publishYear);
        this.name = name;
        this.bio = bio;
    }

    // Implementation of displayDetails
    protected void displayDetails() {
        System.out.println("\nName of the Author : " + this.name);
        System.out.println("Bio : " + this.bio);
        super.displayDetails();
    }
}
