/*
 	Program : Method overloading
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.addition;

// Creating addition class
public class Addition {
	// ---------- METHOD OVERLOADING ---------

	/*
	 * method overloading as per type of arguments and number of arguments
	 */

	int add(int a, int b, int c, int d) {
		System.out.println("---- 4 number addition-------");
		// add 3 inntegers
		int sum = a + b + c + d;
		return sum;
	}

	int add(int a, int b, int c) {
		System.out.println("---- 3 number addition-------");
		// add 3 inntegers
		int sum = a + b + c;
		return sum;
	}

	// method overloading type of argumnets
	float add(float a, float b) {
		System.out.println("---- 2 number float addition-------");
		// add two float
		float sum = a + b;
		return sum;
	}

	// we cannot overload a method by changing the return type
	/*
	 * int add(float a, float b) {
	 * System.out.println("---- 2 number int addition-------"); int sum = (int) (a +
	 * b); return sum; }
	 */

}
