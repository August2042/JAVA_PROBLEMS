package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;

// Define the base Employee class with private attributes.
class Employee {
    private String empName;
    private Integer empId;
    private Double empSalary;

    // Constructor for Employee class.
    Employee(Integer empId, String empName, Double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // Getter methods for accessing employee information.
    public String getEmpName() {
        return empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    // Method to calculate annual bonuses (to be overridden by subclasses).
    public void calculateAnnualBonuses() {
        System.out.println("Calculating Annual Bonuses.....");
    }
}

// Define the Manager class as a subclass of Employee.
class Manager extends Employee {

    // Constructor for Manager class.
    Manager(Integer empId, String empName, Double empSalary) {
        super(empId, empName, empSalary);
    }

    // Override the calculateAnnualBonuses method for Managers.
    @Override
    public void calculateAnnualBonuses() {
        Double bonus;
        bonus = getEmpSalary() * 0.25; // 25% bonus for Managers
        System.out.println("Annual Bonuses For Manager " + getEmpName() + ": $" + bonus);
    }
}

// Define the Developer class as a subclass of Employee.
class Developer extends Employee {

    // Constructor for Developer class.
    Developer(Integer empId, String empName, Double empSalary) {
        super(empId, empName, empSalary);
    }

    // Override the calculateAnnualBonuses method for Developers.
    @Override
    public void calculateAnnualBonuses() {
        Double bonus;
        bonus = getEmpSalary() * 0.15; // 15% bonus for Developers
        System.out.println("Annual Bonuses For Developer " + getEmpName() + ": $" + bonus);
    }
}

// Main class to test the polymorphic behavior of Employee subclasses.
public class lms_q5 {

    public static void main(String[] args) {
        // Create Manager and Developer objects.
        Manager obj = new Manager(101, "Sandeep", 50000.0);
        Developer obj1 = new Developer(102, "Ankit", 30000.0);

        // Calculate and display annual bonuses for both objects.
        obj.calculateAnnualBonuses();  // Calls Manager's calculateAnnualBonuses
        obj1.calculateAnnualBonuses(); // Calls Developer's calculateAnnualBonuses
    }
}
