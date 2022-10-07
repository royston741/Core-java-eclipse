/*
 	Program : Method overloading
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.addition;

//Creating AdditionTest class
public class AdditionTest {
	// calling main method
	public static void main(String... args) {
		Addition a = new Addition();
		// add 3 int
		System.out.println(a.add(1, 1, 1));

		// add 4 int
		System.out.println(a.add(1, 1, 1, 1));

		// add 2 floats
		System.out.println(a.add(1, 1));

	}
}
