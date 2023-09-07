package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;

// Define the base Employee1 class with common attributes and methods.
class Employee1 {
    private String name;
    private double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Common method for calculating monthly salary.
    public double calculateMonthlySalary() {
        return salary;
    }
}

// Define the Sales class as a subclass of Employee1.
class Sales extends Employee1 {
    private double salesBonus;

    Sales(String name, double salary, double salesBonus) {
        super(name, salary);
        this.salesBonus = salesBonus;
    }

    @Override
    public double calculateMonthlySalary() {
        // Override the method for Sales employees with bonus calculation.
        return super.calculateMonthlySalary() + salesBonus;
    }
}

// Define the Engineering class as a subclass of Employee1.
class Engineering extends Employee1 {
    private double engineerBonus;

    Engineering(String name, double salary, double engineerBonus) {
        super(name, salary);
        this.engineerBonus = engineerBonus;
    }

    @Override
    public double calculateMonthlySalary() {
        // Override the method for Engineering employees with bonus calculation.
        return super.calculateMonthlySalary() + engineerBonus;
    }
}

// Define the Marketing class as a subclass of Employee1.
class Marketing extends Employee1 {
    private double marketingBonus;

    Marketing(String name, double salary, double marketingBonus) {
        super(name, salary);
        this.marketingBonus = marketingBonus;
    }

    @Override
    public double calculateMonthlySalary() {
        // Override the method for Marketing employees with bonus calculation.
        return super.calculateMonthlySalary() + marketingBonus;
    }
}

// Main class to test the employee salary calculation.
public class lms_q2 {

    public static void main(String[] args) {
        // Create instances of Sales, Engineering, and Marketing employees.
        Sales obj1 = new Sales("Arvind", 25000, 1500);
        Engineering obj2 = new Engineering("Ashok", 35000, 3000);
        Marketing obj3 = new Marketing("Rohit", 30000, 2000);

        // Display monthly salaries for employees.
        System.out.println(obj1.getName() + "'s Monthly Salary : $" + obj1.calculateMonthlySalary());
        System.out.println(obj2.getName() + "'s Monthly Salary : $" + obj2.calculateMonthlySalary());
        System.out.println(obj3.getName() + "'s Monthly Salary : $" + obj3.calculateMonthlySalary());
    }
}
