/*
 	Program : Access modifiers
 	@Author : Royston
 	@Date : 27 Sep
 */

package com.AccessModifiers;

public class Test {
	// calling main method
	public static void main(String... args) {

		// -------- PRIVATE --------
		// private variables not visible in another class
		// The field Modifiers.n1 is not visible
		// accessing private variables
//		Modifiers privateVar = new Modifiers();
//		System.out.println(privateVar.n1);

		// ------- PUBLIC -------
		// public variable visible in another class
		// accessing public variables
//		Modifiers publicVar = new Modifiers();
//		System.out.println(publicVar.n2);

		// ------- PROTECTED -------
		// protected variable can be accessed in same package
		// accessing protected variables
//		Modifiers protectedVar = new Modifiers();
//		System.out.println(protectedVar.n3);

		// ------- DEFAULT ---------
		// default variable can be accessed in same package
		// accessing default variables
		Modifiers defaultVar = new Modifiers();
		System.out.println(defaultVar.n4);

	}
}
