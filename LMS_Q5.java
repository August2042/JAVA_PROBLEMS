package oopsJava;

// Define the Cooking interface with three abstract methods: prepareIngredients, cook, and serve
interface Cooking {
	void prepareIngredients();

	void cook();

	void serve();
}

// Implement the Cooking interface with the Chef class
class Chef implements Cooking {
	public void prepareIngredients() {
		System.out.println("The chef is getting the best ingredients.");
	}

	public void cook() {
		System.out.println("The chef is making a special dish.");
	}

	public void serve() {
		System.out.println("The chef serves the dish beautifully.");
	}
}

// Implement the Cooking interface with the HomeCook class
class HomeCook implements Cooking {
	public void prepareIngredients() {
		System.out.println("The home cook is gathering ingredients.");
	}

	public void cook() {
		System.out.println("The home cook is making a delicious meal.");
	}

	public void serve() {
		System.out.println("The meal is shared with family at the table.");
	}
}

// Main class to demonstrate interface and class implementations
public class LMS_Q5 {
	public static void main(String[] args) {
		// Create an object of the Chef class
		Chef obj1 = new Chef();
		// Create an object of the HomeCook class
		HomeCook obj2 = new HomeCook();

		// Call methods for the Chef object
		obj1.prepareIngredients();
		obj1.cook();
		obj1.serve();
		System.out.println(); // Print an empty line for separation
		// Call methods for the HomeCook object
		obj2.prepareIngredients();
		obj2.cook();
		obj2.serve();
	}
}
