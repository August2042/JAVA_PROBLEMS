class Employee
{
    String name;
    int id;

    // Constructor for Employee class
    Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee
{
    String manager_department;

    // Constructor for Manager class
    Manager(int id, String name, String manager_department)
    {
        super(id, name); // Call the constructor of the superclass (Employee)
        this.manager_department = manager_department;
    }

    // Display method to print Manager information
    public void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + manager_department);
    }
}

public class lms_q2_17 {
    public static void main(String[] args) {
        // Creating an instance of the Manager class
        Manager obj = new Manager(106317, "August Kumar", "HR");

        // Printing employee information
        System.out.println("EMPLOYEE INFORMATION");
        System.out.println("---------------------");
        obj.display(); // Displaying manager information using the display() method
    }
}
