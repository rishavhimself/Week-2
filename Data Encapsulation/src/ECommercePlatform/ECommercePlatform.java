package ECommercePlatform;

// Main class
public class ECommercePlatform {
    public static void main(String[] args){

        // Create instances
        Product jeans = new Clothing("Jeans","JE10",1200);
        Product oats = new Groceries("Oats","OA11",180);
        Product trimmer = new Electronics("Trimmer", "TR12",3200);

        // Function Call
        jeans.displayDetails();
        jeans.calculateDiscount();
        jeans.calculateTax();
        jeans.getTaxDetails();

        // Function Call
        oats.displayDetails();
        oats.calculateDiscount();
        oats.calculateTax();
        oats.getTaxDetails();

        // Function Call
        trimmer.displayDetails();
        trimmer.calculateDiscount();
        trimmer.calculateTax();
        trimmer.getTaxDetails();
    }
}
