import java.util.ArrayList;

// Class to represent a Product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Display product details
    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Class to represent an Order
class Order {
    private int orderId;
    private ArrayList<Product> products; // Aggregation of Products
    private Customer customer; // Associated Customer

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display the details of the order
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " for Customer: " + customer.getName());
        System.out.println("Products in the order:");
        for (Product product : products) {
            product.displayInfo();
        }
    }
}

// Class to represent a Customer
class Customer {
    private String name;
    private ArrayList<Order> orders; // Associated Orders

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Display the customer's orders
    public void viewOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            System.out.println("- Order ID: " + order.getOrderId());
        }
    }
}

// Main class to demonstrate the model
public class ECommerce {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 799.99);
        Product product3 = new Product("Headphones", 99.99);

        // Create orders
        Order order1 = new Order(1, customer1);
        Order order2 = new Order(2, customer2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);

        // Customers place orders
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        // Display details
        System.out.println("E-Commerce Platform Details:");
        System.out.println();

        // Display orders placed by customers
        customer1.viewOrders();
        customer2.viewOrders();

        // Display details of orders
        order1.displayOrderDetails();
        order2.displayOrderDetails();
    }
}
