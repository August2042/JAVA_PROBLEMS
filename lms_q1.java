
package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;
import java.util.Scanner;

//Base class for geometric shapes
class Shape1 {
 // Method to calculate the area (default implementation)
 public double calculateArea() {
     System.out.println("Calculating area....");
     return 0; // Return 0 as a default value, can be overridden by subclasses
 }
}

//Subclass representing a circle
class Circle3 extends Shape1 {
 private double radius;

 // Constructor to initialize the circle
 Circle3(double radius) {
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

//Subclass representing a rectangle
class Rectangle3 extends Shape1 {
 int length, breadth;

 // Constructor to initialize the rectangle
 Rectangle3(int length, int breadth) {
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

//Subclass representing a triangle
class Triangle3 extends Shape1 {
 double base, height;

 // Constructor to initialize the triangle
 Triangle3(double base, double height) {
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

public class lms_q1 {
 public static void main(String[] args) {
     char choice;

     do {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Shape Hierarchy");
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
                 Circle3 obj1 = new Circle3(r);
                 obj1.calculateArea(); // Calculate and display the area
                 break;

             case "Rectangle":
                 System.out.println("Enter the length: ");
                 int l = sc.nextInt();
                 System.out.println("Enter the breadth: ");
                 int b = sc.nextInt();
                 Rectangle3 obj2 = new Rectangle3(l, b);
                 obj2.calculateArea(); // Calculate and display the area
                 break;

             case "Triangle":
                 System.out.println("Enter the base: ");
                 int B = sc.nextInt();
                 System.out.println("Enter the height: ");
                 int H = sc.nextInt();
                 Triangle3 obj3 = new Triangle3(B, H);
                 obj3.calculateArea(); // Calculate and display the area
                 break;

             default:
                 System.out.println("Invalid Shape !!!");
         }
         System.out.println("Do you want to continue if yes then press y or else n.....");
         choice = sc.next().charAt(0);
     } while (choice == 'y');

     System.out.println(">>>>>> Thank you for using the Shape Hierarchy Demo <<<<<");
 }
}
