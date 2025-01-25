package MultilevelInheritance.OnlineRetailOrderManagement;

// Define the superclass
class Order{
    protected String orderId, orderDate;

    // Constructor
    Order(String orderId, String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    // Implementation of orderStatus
    protected void orderStatus(){
        System.out.println("Order Placed");
    }

}
