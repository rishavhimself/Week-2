package MultilevelInheritance.OnlineRetailOrderManagement;

// Define the subclass
class DeliveredOrder extends ShippedOrder{
    protected String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    // Implementation of orderStatus
    protected void orderStatus(){
        super.orderStatus();
        System.out.println("Order Delivered on : "+deliveryDate);
    }
}