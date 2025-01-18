class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}


public class Circles {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle paramCircle = new Circle(5.0);
        defaultCircle.displayRadius();
        paramCircle.displayRadius();
    }
}
