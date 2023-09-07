
package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;

import java.util.Scanner;

// Base class for geometric shapes
class Shape {
	// Method to calculate the area (default implementation)
	public double calculateArea() {
		System.out.println("Calculating area....");
		return 0; // Return 0 as a default value, can be overridden by subclasses
	}
}

// Subclass representing a circle
class Circle2 extends Shape {
	private double radius;

	// Constructor to initialize the circle
	Circle2(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double circleArea;
		circleArea = 3.14 * radius * radius; // Calculate circle area
		System.out.println("Area of Circle : " + circleArea);
		return circleArea; // Return the calculated area
	}
}

// Subclass representing a rectangle
class Rectangle2 extends Shape {
	int length, breadth;

	// Constructor to initialize the rectangle
	Rectangle2(int length, int breadth) {
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public double calculateArea() {
		int rectangleArea;
		rectangleArea = length * breadth; // Calculate rectangle area
		System.out.println("Area of Rectangle : " + rectangleArea);
		return rectangleArea; // Return the calculated area
	}
}

// Subclass representing a triangle
class Triangle2 extends Shape {
	double base, height;

	// Constructor to initialize the triangle
	Triangle2(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		double triangleArea;
		triangleArea = 0.5 * base * height; // Calculate triangle area
		System.out.println("Area of Triangle : " + triangleArea);
		return triangleArea; // Return the calculated area
	}
}

public class lms_q3 {
	public static void main(String[] args) {
		char choice;
		double totalArea = 0; // Initialize total area

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Geometric Shapes Area Calculator");
			System.out.println("--------------------------------------------");
			System.out.println("1). Circle");
			System.out.println("2). Rectangle");
			System.out.println("3). Triangle");
			System.out.println();
			System.out.println("Enter the shape for calculating area of any geometric shapes");
			String option = sc.nextLine();

			switch (option) {
			case "Circle":
				System.out.println("Enter the radius: ");
				int r = sc.nextInt();
				Circle2 obj1 = new Circle2(r);
				double circleArea = obj1.calculateArea(); // Get the calculated area
				totalArea += circleArea; // Add circle area to total
				break;

			case "Rectangle":
				System.out.println("Enter the length: ");
				int l = sc.nextInt();
				System.out.println("Enter the breadth: ");
				int b = sc.nextInt();
				Rectangle2 obj2 = new Rectangle2(l, b);
				double rectangleArea = obj2.calculateArea(); // Get the calculated area
				totalArea += rectangleArea; // Add rectangle area to total
				break;

			case "Triangle":
				System.out.println("Enter the base: ");
				int B = sc.nextInt();
				System.out.println("Enter the height: ");
				int H = sc.nextInt();
				Triangle2 obj3 = new Triangle2(B, H);
				double triangleArea = obj3.calculateArea(); // Get the calculated area
				totalArea += triangleArea; // Add triangle area to total
				break;
				
			default :
				System.out.println("Invalid Shape !!!");
			}
			System.out.println("Do you want to continue if yes then press y or else n.....");
			choice = sc.next().charAt(0);
		} while (choice == 'y');

		System.out.println("Total area of all shapes: " + totalArea); // Display total area
		System.out.println(">>>>>> Thank you for using this Application <<<<<");
	}
}
