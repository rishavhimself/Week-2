package AssistedProblems.AnimalHierarchy;

// Define the subclass
class Bird extends Animal{

    // Constructor
    Bird(String name,int age){
        super(name, age);
    }
    protected void makeSound(){
        System.out.println(name+" mumms !");
    }
}
