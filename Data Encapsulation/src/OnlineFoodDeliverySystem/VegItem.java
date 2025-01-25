package OnlineFoodDeliverySystem;

// Define the subclass
public class VegItem extends FoodItem{

    // Constructor
    VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implementation of overridden Methods
    @Override
    public void calculateTotalPrice() {
        System.out.println("Total Cost : "+getPrice()*getQuantity());
    }

    @Override
    public void applyDiscount() {
        setDiscount(getPrice()/10);
        System.out.println("Total After Discount : "+(getPrice()-getDiscount()*getQuantity()));
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied : "+getDiscount());
    }
}
