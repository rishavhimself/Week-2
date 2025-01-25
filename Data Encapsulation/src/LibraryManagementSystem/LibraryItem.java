package LibraryManagementSystem;

// Define the superclass
public abstract class LibraryItem implements Reservable {

    private String  itemId, title, author;
    private boolean available =true;

    // Constructor
    LibraryItem(String itemId,String title,String author){
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }

    //Getter and Setter Methods
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method
    public abstract void getFine(int days);

    // Implementation of getItemDetails
    public void getItemDetails(){
        System.out.println("\nItem name : "+title);
        System.out.println("Item Id : "+itemId);
        System.out.println("Author Name : "+author);
    }

}


