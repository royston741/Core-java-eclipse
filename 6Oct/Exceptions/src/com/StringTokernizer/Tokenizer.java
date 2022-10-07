/*
	Program : String tokenizer
 	@Author : Royston
 	@Date : 6 Oct
 */

/*
 	The java.util.StringTokenizer class allows you to break a String into tokens. 
 	It is simple way to break a String. It is a legacy(old) class of Java.
 */

package com.StringTokernizer;

// import StrinkTokenizer
import java.util.StringTokenizer;

// Create Tokenizer class
public class Tokenizer {

	// Create breakString method
	static void breakString(String str) {
		// Create String tokenizer method
		StringTokenizer st = new StringTokenizer(str);
		// while there are words in string
		while (st.hasMoreTokens()) {
			// print the words
			System.out.println(st.nextToken());
		}
	}

	// Create countString method
	public static void countToken(String str) {
		// Create String tokenizer method
		StringTokenizer st = new StringTokenizer(str);
		// print the number of words
		System.out.println("Number of words : " + st.countTokens());
	}

	// Calling main method
	public static void main(String... args) {
		String str = "hello java. Java is fun, Java is good";
		// calling BreakString method
		breakString(str);

		// calling countToken method
		countToken(str);
	}
}
