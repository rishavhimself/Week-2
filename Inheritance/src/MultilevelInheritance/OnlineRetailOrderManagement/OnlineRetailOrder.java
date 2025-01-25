package MultilevelInheritance.OnlineRetailOrderManagement;

// Main class
public class OnlineRetailOrder {
    public static void main(String[] args) {
        // Create instance
        DeliveredOrder newOrder = new DeliveredOrder("1234", "24/01/2025", "0111AS21", "24/01/2025");

        // Function Call
        newOrder.orderStatus();
    }

}