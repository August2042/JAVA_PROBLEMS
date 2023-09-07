package oopsJava;

// Define the interface Drawable with an abstract method draw()
interface Drawable {
	void draw();
}

// Implement the Drawable interface with the Circle1 class
class Circle1 implements Drawable {
	public void draw() {
		System.out.println("Circle is draw...");
	}
}

// Implement the Drawable interface with the Square class
class Square implements Drawable {
	public void draw() {
		System.out.println("Square is draw...");
	}
}

// Main class to demonstrate interface and class implementations
public class LMS_Q4 {
	public static void main(String[] args) {
		// Create an object of the Square class
		Square obj1 = new Square();
		// Create an object of the Circle1 class
		Circle1 obj2 = new Circle1();

		// Call the draw() method on the Square object
		obj1.draw();
		// Call the draw() method on the Circle1 object
		obj2.draw();
	}
}
