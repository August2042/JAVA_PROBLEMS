// Base class representing a Vehicle
class Vehicle 
{
    String model; // Model of the vehicle
    String make;  // Make of the vehicle

    // Vehicle parametrized Constructor
    Vehicle(String model, String make)       
    {
        this.model = model;
        this.make = make;
    }
}

// Subclass representing a Car, inheriting from Vehicle
class Car extends Vehicle
{
    int year; // Year of the car
    
    // Car parametrized Constructor
    Car(String model, String make, int year)     
    {
        super(model, make); // Call the constructor of the superclass (Vehicle)
        this.year = year;
    }

    // Method to display the model, make, and year of the car
    public void show()
    {
        System.out.println("Model : " + model);
        System.out.println("Make : " + make);
        System.out.println("Year : " + year);
    }
}

// Main class to demonstrate the Car class
public class lms_q1_17 
{
    public static void main(String[] args) 
    {
        Car obj = new Car("XUV 700", "Mahindra", 2020);  // Create an object of the Car class 
        obj.show(); // Display car information using the show() method
    }
}
