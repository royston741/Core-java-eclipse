/*
 	Program : String spliting
 	@Author : Royston
  	@Date : 30Sep
 */

package StringSplitOperator;

// Create StringSplit class
public class StringSplit {

	// Create useSplit method
	static void useSplit(String str) {
		// split string on the basis of parameter passed
		String[] strArr = str.split("a");
		// call displayStrArr method
		displayStrArr(strArr);
	}

	// create useCharSplit method
	static void useCharSplit(String str) {
		// break string to character array
		char[] charArr = str.toCharArray();
		// call displayCharArr
		displayCharArr(charArr);
	}

	// Create displayStrArr method
	static void displayStrArr(String... arr) {
		// printing the array
		for (String i : arr) {
			System.out.println(i);
		}
	}

	// Create displayCharArr method
	static void displayCharArr(char... arr) {
		// printing the array
		for (char i : arr) {
			System.out.println(i);
		}
	}

	// calling main method
	public static void main(String[] args) {
		// String variable
		String s1 = "I am a boy";
		// call usesplit metjod
		// useSplit(s1);
		// call usecharsplit method
		useCharSplit(s1);
	}

}
