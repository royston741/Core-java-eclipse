/*
 	Program : Aggregation student ddetails class
 	@Author : Royston
 	@Date : 27 Sep
 */

package com.Aggregation;

// Creating student detials class
public class StudetDetails {
	// calling main method
	public static void main(String... args) {
		// Creating a student object
		Student s1 = new Student(1, "Roy", new Address("AG 44", "Mumbai", 45089, "Maharashtra", "India"));
		System.out.println(s1);
	}
}
