/*
 	Program : Enum
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.Enum;

/*
 	Enum is a group of constants
*/
// Creating enum class
public class Enum {

	enum Colors {
		RED(6), WHITE(7), BLACK(9), BLUE(8);

		// constructor : giving values to constant: private

		private int value;// no instance can be created

		private Colors(int value) {
			this.value = value;
		}

	}

	// Calling main method
	public static void main(String... args) {
		// declaring constant
		final String course = "B Tech";
		System.out.println(course);
		// final constant cannot be changed
		// course = "BCA";

		/*
		 * enum Colors { RED, WHTE, BLACK, BLUE } // arrays of constants // values:
		 * array contaning all enums for (Colors c : Colors.values()) {
		 * System.out.println(c); }
		 */

		for (Colors c : Colors.values()) {
			System.out.println(c + " " + c.value);
		}

	}

}
