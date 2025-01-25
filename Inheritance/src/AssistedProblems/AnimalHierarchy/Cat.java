package AssistedProblems.AnimalHierarchy;

// Define the subclass
class Cat extends Animal{

    // Constructor
    Cat(String name,int age){
        super(name, age);
    }

    // Implementation of makeSound
    protected void makeSound(){
        System.out.println(name+" meows !");
    }
}
