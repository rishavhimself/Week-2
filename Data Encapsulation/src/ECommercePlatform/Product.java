package ECommercePlatform;

// Define the superclass
public abstract class Product implements Taxable {
    public String productId, name;
    public double price;

    // Constructor
    public Product(String name, String productId, double price){
        this.name=name;
        this.productId=productId;
        this.price=price;
    }

    // Abstract method
    public abstract void calculateDiscount();

    // Implementation of displayDetails method
    public void displayDetails(){
         System.out.println("\nProduct Name : "+name);
         System.out.println("Product Id : "+productId);
         System.out.println("Cost of Product : "+price);
     }
}
