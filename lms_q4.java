package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;

// Define the base Vehicle class with common attributes.
class Vehicle {
    private String make;
    private String model;
    private int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Common method for calculating rental cost (to be overridden by subclasses).
    public void calculateRentalCost(int days) {
        System.out.println("Calculating Rental Cost For Vehicle....");
    }
}

// Define the Car class as a subclass of Vehicle.
class Car extends Vehicle {
    private int numberOfSeats;

    Car(String make, String model, int year, int numberOfSeats) {
        super(make, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    // Override the calculateRentalCost method for Cars.
    public void calculateRentalCost(int days) {
        double cost;
        cost = 50 * days;
        System.out.println(
            "Rental Cost for " + getMake() + " " + getModel() + " : " + " $" + cost + " for " + days + " days.");
    }
}

// Define the Bicycle class as a subclass of Vehicle.
class Bicycle extends Vehicle {
    private boolean hasGears;

    Bicycle(String make, String model, int year, boolean hasGears) {
        super(make, model, year);
        this.hasGears = hasGears;
    }

    // Override the calculateRentalCost method for Bicycles.
    public void calculateRentalCost(int days) {
        double cost;
        cost = 20 * days;
        System.out.println(
            "Rental Cost for " + getMake() + " " + getModel() + " : " + " $" + cost + " for " + days + " days.");
    }
}

// Define the Motorcycle class as a subclass of Vehicle.
class Motorcycle extends Vehicle {
    private int numberOfGears;

    Motorcycle(String make, String model, int year, int numberOfGears) {
        super(make, model, year);
        this.numberOfGears = numberOfGears;
    }

    // Override the calculateRentalCost method for Motorcycles.
    public void calculateRentalCost(int days) {
        double cost;
        cost = 40 * days;
        System.out.println(
            "Rental Cost for " + getMake() + " " + getModel() + " : " + " $" + cost + " for " + days + " days.");
    }
}

// Main class to test the vehicle rental system.
public class lms_q4 {

    public static void main(String[] args) {
        // Create instances of Car, Motorcycle, and Bicycle.
        Car obj1 = new Car("Nissan", "Altima", 2019, 5);
        Motorcycle obj2 = new Motorcycle("Honda", "CBR1000RR", 2015, 4);
        Bicycle obj3 = new Bicycle("Canyon", "Ultimate", 2014, true);

        // Display a header for the output.
        System.out.println("Calculated Rental Cost For Different Types Of Vehicle");
        System.out.println("-------------------------------------------------------");

        // Calculate and display rental costs for each vehicle.
        obj1.calculateRentalCost(10);
        obj2.calculateRentalCost(15);
        obj3.calculateRentalCost(20);
    }
}
