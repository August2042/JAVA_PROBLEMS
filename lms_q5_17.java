// Base class representing an Animal
class Animal {
    // Method to make a sound (default implementation)
    public void makeSound() {
        System.out.println("Animal Sound....");
    }
}

// Subclass representing a Dog, inheriting from Animal
class Dog extends Animal {
    // Override the makeSound method with specific behavior for a dog
    @Override
    public void makeSound() {
        System.out.println("Dog Barking....");
    }
}

// Main class to demonstrate the Dog class
public class lms_q5_17 {
    public static void main(String[] args) {
        Dog obj = new Dog(); // Create an instance of Dog

        obj.makeSound(); // Call the overridden makeSound method for the Dog instance
    }
}
