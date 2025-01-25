package LibraryManagementSystem;

//Main class
public class LibraryManagementSystem {
    public static void main(String[] args){

        // Create instances
        LibraryItem newBook= new Book("BO12","Java Intro","XYZ");
        LibraryItem newMagazine = new Magazine("MA34","C++","ABC");
        LibraryItem newDVD = new DVD("DV56","Python AtoZ","PQR");

        // Function Call
        newBook.getItemDetails();
        newBook.checkAvailability();
        newBook.reserveItem();
        newBook.getFine(7);
        newMagazine.getItemDetails();
        newMagazine.checkAvailability();
        newMagazine.reserveItem();
        newMagazine.getFine(5);
        newDVD.getItemDetails();
        newDVD.checkAvailability();
        newDVD.reserveItem();
        newDVD.getFine(10);

    }
}
