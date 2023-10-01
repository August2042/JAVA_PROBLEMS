package comaparatorAndcomparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student_1 {
	private String studentName;
	private Integer studentRoll;
	private Integer studentAge;

	// Default constructor
	public Student_1() {
		super();
	}

	// Parameterized constructor
	public Student_1(String studentName, Integer studentRoll, Integer studentAge) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
		this.studentAge = studentAge;
	}

	// Getter for studentName
	public String getStudentName() {
		return studentName;
	}

	// Setter for studentName
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// Getter for studentRoll
	public Integer getStudentRoll() {
		return studentRoll;
	}

	// Setter for studentRoll
	public void setStudentRoll(Integer studentRoll) {
		this.studentRoll = studentRoll;
	}

	// Getter for studentAge
	public Integer getStudentAge() {
		return studentAge;
	}

	// Setter for studentAge
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	// Override toString() method to provide a custom string representation
	@Override
	public String toString() {
		return "Student_1 [studentName=" + studentName + ", studentRoll=" + studentRoll + ", studentAge=" + studentAge
				+ "]";
	}
}

public class App11 {
	public static void main(String[] args) {
		// Create a list of Student_1 objects
		List<Student_1> obj = new ArrayList<>();
		obj.add(new Student_1("Sonakshi", 1, 22));
		obj.add(new Student_1("Akansha", 2, 23));
		obj.add(new Student_1("Swati", 3, 21));
		obj.add(new Student_1("Anjali", 4, 22));
		obj.add(new Student_1("Sonam", 5, 21));
		obj.add(new Student_1("Sakshi", 6, 22));

		// Create an iterator to traverse the list
		Iterator<Student_1> itr = obj.iterator();

		// Iterate through the list and remove student names starting with 'S'
		while (itr.hasNext()) {
			Student_1 student = itr.next();

			if (student.getStudentName().startsWith("S")) {
				itr.remove();
			}
		}

		// Print the updated list of student objects
		for (Student_1 stud : obj) {
			System.out.println(stud);
		}
	}
}
