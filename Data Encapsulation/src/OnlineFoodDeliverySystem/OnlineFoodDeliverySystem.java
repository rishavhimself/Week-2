package OnlineFoodDeliverySystem;

//Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        // Create instances
        FoodItem newVegItem = new VegItem("Pasta",300,5);
        FoodItem newNonVegFood = new NonVegItem("Chicken Tikka", 500,5);

        // Function Call
        newVegItem.getItemDetails();
        newVegItem.calculateTotalPrice();
        newVegItem.applyDiscount();
        newVegItem.getDiscountDetails();
        newNonVegFood.getItemDetails();
        newNonVegFood.calculateTotalPrice();
        newNonVegFood.applyDiscount();
        newNonVegFood.getDiscountDetails();
    }
}
