package HybridInheritance.RestaurantManagementSystem;

// Main class
public class Restaurant {
    public static void main(String[] args) {
        // Create instances of Chef and Waiter
        Chef chef = new Chef("Rishav", 1);
        Waiter waiter = new Waiter("Raxx", 2);

        // Function Call
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}