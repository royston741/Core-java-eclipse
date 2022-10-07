/*
	Program : String tokenizer
 	@Author : Royston
 	@Date : 6 Oct
 */

package com.StringConversion;

public class StringConversion {

	// Calling main method
	public static void main(String... args) {
		// Method 1 -------> valueOf() method
		int intVal = 56;
		float floatVal = 12.1f;
		boolean boolVal = false;
		char charVal = 'a';
		// The java string valueOf() method converts different types of values into
		// string.
		String str = String.valueOf(boolVal);
		// add 11
		str += 11;
		// print str
		System.out.println("------ valueOf() method -------");
		System.out.println(str);

		// Method 2 -----> concatination
		// concatinate
		String newStr = "Hello" + false + 1000;
		// print newStrr
		System.out.println("------ Concatinate -------");
		System.out.println(newStr);

	}
}
