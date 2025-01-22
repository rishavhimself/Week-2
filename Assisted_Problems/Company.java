
class Department {
    
    private String departmentName;
    private String departmentId;
    static int totalEmployees=0;

    public Department(String departmentName, String departmentId){
        this.departmentName=departmentName;
        this.departmentId=departmentId;
    }

    void getDetails(){
        System.out.println("Name of the department : "+ departmentName);
        System.out.println("Department ID : "+ departmentId);
    }


    class Employee{
        static String companyName="ABC pvt.ltd";
        String name;
        final String id;
        Long salary;
        String designation;
        
        Employee(String name, String id,String designation, Long salary){
            this.name=name;
            this.id=id;
            this.designation=designation;
            this.salary=salary;
            totalEmployees++;
        }
        
        static void dispalyTotalEmployees(){
            System.out.println("Total number of employees is : "+totalEmployees);
        }
    
        void displayDetails(){
            System.out.println("Name : "+name);
            System.out.println("Id : "+id);
            System.out.println("Designation of the employee : "+designation);
            System.out.println("Salary :" +salary);
        }

    }	
			
	//Creating the object
	Employee employee = new Employee("Rishav","I111AS23","Intern",12345l);
}

public class Company {
    private String companyname;
    private String companyAddress;
    public static void main(String[] args) {
       
    Department department1 = new Department("Cloud","C1");
        department1.getDetails();
        department1.employee.displayDetails();
    }
}
