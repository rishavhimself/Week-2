package ECommercePlatform;

// Define the subclass
public class Groceries extends Product implements Taxable{

    private double tax;

    // Constructor
    Groceries(String name, String productId, double price){
        super(name, productId, price);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateDiscount() {
        double discount = price / 10;
        System.out.println("Discount applied : "+ discount);
    }

    @Override
    public void calculateTax() {
        tax=price*18/100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax Amount : "+tax);
    }
}
