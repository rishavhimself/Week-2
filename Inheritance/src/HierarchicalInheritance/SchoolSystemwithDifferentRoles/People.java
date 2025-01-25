package HierarchicalInheritance.SchoolSystemwithDifferentRoles;

// Define the superclass
class People{
    protected String  name;
    protected int age;

    // Constructor
    People(String name , int age){
        this.name=name;
        this.age=age;
    }

    // Implementation of displayDetails
    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
