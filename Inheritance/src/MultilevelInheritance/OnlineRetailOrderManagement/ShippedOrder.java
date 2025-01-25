package MultilevelInheritance.OnlineRetailOrderManagement;

// Define the subclass
class ShippedOrder extends Order{
    protected String trackingNumber;

    // Constructor
    ShippedOrder(String orderId, String orderDate, String trackingNumber ){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    // Implementation of orderStatus
    protected void orderStatus(){
        super.orderStatus();
        System.out.println("Order In Transit");
        System.out.println("Track with Tracking Id : "+trackingNumber);

    }
}