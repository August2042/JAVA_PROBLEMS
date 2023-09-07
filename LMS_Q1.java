package oopsJava;
// Define a Shape interface
interface Shape {
    // Abstract methods to calculate area and perimeter
    double calculateArea();
    double calculatePerimeter();
}

// Implement the Shape interface for a Circle
class Circle2 implements Shape {
    int radius;

    // Constructor to set the radius
    Circle2(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

// Implement the Shape interface for a Rectangle
class Rectangle implements Shape {
    int length, breadth;

    // Constructor to set the length and breadth
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

// Implement the Shape interface for a Triangle
class Triangle implements Shape {
    int a, b, c;

    // Constructor to set the sides of the triangle
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}

public class LMS_Q1 {
    public static void main(String[] args) {
        Circle2 c = new Circle2(5);
        System.out.println("Area of Circle: " + c.calculateArea());
        System.out.println("Perimeter of Circle: " + c.calculatePerimeter());

        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Rectangle: " + r.calculateArea());
        System.out.println("Perimeter of Rectangle: " + r.calculatePerimeter());

        Triangle t = new Triangle(5, 4, 3);
        System.out.println("Area of Triangle: " + t.calculateArea());
        System.out.println("Perimeter of Triangle: " + t.calculatePerimeter());
    }
}
