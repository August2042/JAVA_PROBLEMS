package LMS_LAB_POLYMORPHISM_ACCESS_MODIFIERS;

import java.util.Scanner;

//Base class for courses
class Course {
	private String courseName;
	private String enrolledStudents;

	public Course(String courseName) {
		this.courseName = courseName;
		this.enrolledStudents = "";
	}

	public String getCourseName() {
		return courseName;
	}

	// Method to enroll a student in the course
	public void enrollStudent(String studentName) {
		enrolledStudents += studentName + ", ";
		System.out.println(studentName + " enrolled in " + courseName);
	}

	// Method to display enrolled students
	public void displayEnrolledStudents() {
		if (enrolledStudents.isEmpty()) {
			System.out.println("No students enrolled in " + courseName);
		} else {
			System.out.println("Enrolled students in " + courseName + ": " + enrolledStudents);
		}
	}
}

//Subclasses representing specific courses
class MathCourse extends Course {
	public MathCourse() {
		super("Math");
	}
}

class ScienceCourse extends Course {
	public ScienceCourse() {
		super("Science");
	}
}

class HistoryCourse extends Course {
	public HistoryCourse() {
		super("History");
	}
}

public class lms_q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create instances of specific courses
		MathCourse mathCourse = new MathCourse();
		ScienceCourse scienceCourse = new ScienceCourse();
		HistoryCourse historyCourse = new HistoryCourse();

		char choice;
		do {
			System.out.println("Welcome to University Enrollment System");
			System.out.println("----------------------------------------");
			System.out.println("Available Courses:");
			System.out.println("1. " + mathCourse.getCourseName());
			System.out.println("2. " + scienceCourse.getCourseName());
			System.out.println("3. " + historyCourse.getCourseName());

			System.out.println("Select a course (1-3): ");
			int courseChoice = scanner.nextInt();

			// Consume the newline character
			scanner.nextLine();

			String studentName;
			switch (courseChoice) {
			case 1:
				System.out.println("Enter student name for Math course: ");
				studentName = scanner.nextLine();
				mathCourse.enrollStudent(studentName);
				break;
			case 2:
				System.out.println("Enter student name for Science course: ");
				studentName = scanner.nextLine();
				scienceCourse.enrollStudent(studentName);
				break;
			case 3:
				System.out.println("Enter student name for History course: ");
				studentName = scanner.nextLine();
				historyCourse.enrollStudent(studentName);
				break;
			default:
				System.out.println("Invalid choice.");
			}

			System.out.println("Do you want to enroll in another course? (y/n): ");
			choice = scanner.next().charAt(0);
		} while (choice == 'y');

		// Display enrolled students for each course
		mathCourse.displayEnrolledStudents();
		scienceCourse.displayEnrolledStudents();
		historyCourse.displayEnrolledStudents();

		System.out.println("Thank you for using the University Enrollment System!");
	}
}
