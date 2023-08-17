// Base class representing a Person
class Person {

    String name; // The name of the person

}

// Subclass representing a Student, inheriting from Person
class Student extends Person {
    int student_Id; // Student's ID

    // Constructor for the Student class
    Student(int student_Id, String name) {
        this.name = name; // Set the name using the inherited property
        this.student_Id = student_Id; // Set the student ID
    }

    // Method to display student record
    public void display() {
        System.out.println("STUDENT RECORD");
        System.out.println();
        System.out.println("ID\t " + "Name");
        System.out.println("--------------");
        System.out.println(student_Id + " \t" + name);

    }
}

// Main class to demonstrate the Student class
public class lms_q4_17 {
    public static void main(String[] args) {
        Student obj = new Student(101, "August");

        obj.display(); // Display student record

    }
}
