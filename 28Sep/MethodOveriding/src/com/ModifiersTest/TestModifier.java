/*
 	Program : Access modifiers
 	@Author : Royston
 	@Date : 27 Sep
 */

package com.ModifiersTest;

import com.AccessModifiers.Modifiers;

public class TestModifier extends Modifiers {
	// calling main method
	public static void main(String... args) {

		// -------- PRIVATE --------
		// private variables not visible in another package
		// The field Modifiers.n1 is not visible
		// accessing private variables
//		Modifiers privateVar = new Modifiers();
//		System.out.println(privateVar.n1);

		// ------- PUBLIC -------
		// public variable visible in another package
		// accessing public variables
//		Modifiers publicVar = new Modifiers();
//		System.out.println(publicVar.n2);

		// ------- PROTECTED -------
		// protected variable can be accessed in another package using inheritance
		// accessing protected variables
//		TestModifier protectedVar = new TestModifier();
//		System.out.println(protectedVar.n3);

		// ------- DEFAULT ---------
		// default variable cannot be accessed outside the package
		// accessing default variables
//		Modifiers protectedVar = new Modifiers();
//		System.out.println(protectedVar.n4);

	}
}
