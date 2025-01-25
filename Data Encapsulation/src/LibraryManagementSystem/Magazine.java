package LibraryManagementSystem;

// Define the subclass
public class Magazine extends LibraryItem{

    // Constructor
    Magazine(String itemId,String title,String author){
        super(itemId, title, author);
    }

    // Implementation of overridden Methods
    @Override
    public void getFine(int days) {
        System.out.println("Total cost : "+days*15);
    }

    @Override
    public void reserveItem() {
        if(getAvailable()){
            System.out.println("Item Reserved");
            setAvailable(false);
        }else System.out.println("Item isn't available");
    }

    @Override
    public void checkAvailability() {
        if(getAvailable()){
            System.out.println("Item Available to reserve");
        }else System.out.println("Item not Available to reserve");
    }
}
