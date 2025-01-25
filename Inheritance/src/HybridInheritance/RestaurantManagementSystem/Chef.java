package HybridInheritance.RestaurantManagementSystem;

// Define the Chef subclass that inherits from Person and implements Worker
class Chef extends Person implements Worker {
    // Constructor
    public Chef(String name, int id) {
        super(name, id);
    }

    // Implementation of performDuties()
    public void performDuties() {
        System.out.println("Preparing meals, managing the kitchen, and ensuring food quality.");
    }
}
