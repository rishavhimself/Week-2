package ECommercePlatform;

// Define the subclass
public class Electronics extends Product implements Taxable{

        private double tax;

    // Constructor
        Electronics(String name, String productId, double price){
           super(name, productId, price);
        }
    // Implementation of overridden Methods
        @Override
        public void calculateDiscount() {
            double discount = price / 15;
            System.out.println("Discount applied : "+ discount);
        }

        @Override
        public void calculateTax() {
            tax=price*10/100;
        }

        @Override
        public void getTaxDetails() {
            System.out.println("Tax Amount : " + tax);
        }
}
