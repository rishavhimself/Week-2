package AssistedProblems.AnimalHierarchy;

// Define the superclass
class Animal{
    protected String name;
    protected int age;

    // Constructor
    Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    // Implementation of makeSound
    protected void makeSound(){
        System.out.println("Different animal make different sound");
    }
}