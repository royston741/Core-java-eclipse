/*
 	Program : Method overloading
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.Student;

// import out method
import static java.lang.System.out;

// import scanner class
import java.util.Scanner;

// Creating StudentTest method
public class StudentTest {
	/*
	 * method overloading features :- readabilty code, looks clean, reusable
	 * ,minimize complexity reduces, exceution , binding at compilation of time
	 */

	// creating displayStudent method
	static void displayStudents(Student... s1) {
		// printing the student
		for (Student student : s1) {
			out.println("Name:" + student.getStdName() + " Score:" + student.getStdScore() + "  Course:"
					+ student.getStdCourse());
		}
	}

	// method overloading
	static void displayStudents(double marks, Student... s1) {
		// running the loop on student array
		for (Student student : s1) {
			// if score greater than marks
			if (student.getStdScore() >= marks)
				// print details
				out.println("Name:" + student.getStdName() + " Score:" + student.getStdScore() + "  Course:"
						+ student.getStdCourse());
		}

	}

	// calling main method
	public static void main(String[] args) {
		// Creating new scanner object
		Scanner sc = new Scanner(System.in);

		// array of size 5
		Student s[] = new Student[5];

		// creating 5 student
		s[0] = new Student(1, "Sudip", 23, 78.9);
		s[1] = new Student(2, "Royston", 20, 90.8, "MCA");
		s[2] = new Student(3, "Sweety", 22, 89.7);
		s[3] = new Student(4, "Swarupa", 19, 80.7, "MCA");
		s[4] = new Student(5, "Krushikesh", 21, 91.2, "MCA");

		// choice input
		out.println("Enter 1 to see all students:");
		out.println("Enter 2 to see students above 90");
		out.println("Enter your choice:");
		int ch = sc.nextInt();

		// comparing choices
		switch (ch) {
		// display all students
		case 1 -> displayStudents(s);
		// display above 90 students
		case 2 -> displayStudents(90.0, s);
		// wrong input
		default -> out.println("Wrong input");
		}
		// close scanner
		sc.close();
	}

}
