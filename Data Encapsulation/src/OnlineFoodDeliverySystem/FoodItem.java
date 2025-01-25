package OnlineFoodDeliverySystem;

// Define the superclass
public abstract class FoodItem implements Discountable{

    private String itemName;
    private double price,discount;
    private int quantity;

    // Constructor
    FoodItem(String itemName,double price,int quantity){
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }

    //Getter and Setter Methods
    public double getDiscount() {
        return discount;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // Abstract method
    public abstract void calculateTotalPrice();

    // Implementation of getItemDetails
    public void getItemDetails(){
        System.out.println("\nItem Name : "+itemName);
        System.out.println("Item Price : "+price);
        System.out.println("Item Quantity: "+quantity);
    }

}
