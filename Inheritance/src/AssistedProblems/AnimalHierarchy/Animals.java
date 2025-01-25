package AssistedProblems.AnimalHierarchy;

// Main class
public class Animals{
    public static void main(String[] args) {

        // Create instances
        Dog dog= new Dog("Spike", 7);
        Cat cat = new Cat("Tom", 4);
        Bird bird = new Bird("Sparrow", 1);

        // Function Call
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}