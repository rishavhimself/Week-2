package AssistedProblems.AnimalHierarchy;

// Define the subclass
class Dog extends Animal{

    // Constructor
    Dog(String name, int age){
        super(name,age);
    }

    // Implementation of makeSound
    protected void makeSound(){
        System.out.println(name+" barks !");
    }
}
