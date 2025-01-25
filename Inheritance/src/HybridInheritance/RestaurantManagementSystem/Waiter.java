package HybridInheritance.RestaurantManagementSystem;

// Define the Waiter subclass that inherits from Person and implements Worker
class Waiter extends Person implements Worker {
    // Constructor
    public Waiter(String name, int id) {
        super(name, id);
    }

    // Implementation of performDuties()
    public void performDuties() {
        System.out.println("Taking orders, serving food, and ensuring customer satisfaction.");
    }
}