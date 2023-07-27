 import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String rollNumber;
    private String course;

    // Constructor to initialize the student object
    public Student(String name, int age, String rollNumber, String course) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Getters to access the private members of the class
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }
}

public class Student_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store information for 5 students
        Student[] students = new Student[5];

        // Input information for each student
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Roll Number: ");
            String rollNumber = scanner.nextLine();

            System.out.print("Course: ");
            String course = scanner.nextLine();

            // Create a student object and store it in the array
            students[i] = new Student(name, age, rollNumber, course);
            System.out.println();
        }

        // Display the information for all students
        System.out.println("Student Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("Roll Number: " + students[i].getRollNumber());
            System.out.println("Course: " + students[i].getCourse());
            System.out.println();
        }

        scanner.close();
    }
}
