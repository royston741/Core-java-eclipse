/*
 	Program : Access modifiers
 	@Author : Royston
 	@Date : 27 Sep
 */

package com.AccessModifiers;

public class Modifiers {
	// PRIVATE
	// access in same class
	// not access in another class, another package
	private int n1 = 1;

	// PUBLIC
	// access in same class, another class, another package
	public int n2 = 2;

	// PROTECTED
//	The protected access modifier is accessible within package and outside the package but through inheritance only.
//	The protected access modifier can be applied on the data member, method and constructor. 
	// It can't be applied on the class.
	protected int n3 = 3;

	// DEFAULT
	int n4 = 4;

	public Modifiers() {
		super();
		// TODO Auto-generated constructor stub
	}

	// private constructor
	private Modifiers(int n1, int n2, int n3, int n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}

	void display() {
		System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4);
	}

	// calling main method
	public static void main(String... args) {
		// static method cannot call a non static variable
		// System.out.println(n1);

		// ------- PRIVATE -------
		// private visible inside the same class
		// accessing private variables
		// Modifiers privateVar = new Modifiers();
		// System.out.println(privateVar.n1);

		// ------- PUBLIC -------
		// accessing public variables
		// Modifiers publicVar = new Modifiers();
		// System.out.println(publicVar.n2);

		// ------- PROTECTED -------
		// protected variable can be accessed in same class
		// accessing protected variables
//		Modifiers protectedVar = new Modifiers();
//		System.out.println(protectedVar.n3);

		// ------- DEFAULT ---------
		// default variable can be accessed in same class
		// accessing default variables
		Modifiers defaultVar = new Modifiers();
		System.out.println(defaultVar.n4);

		// ------- private constructor ------
//		Modifiers privateConstructor = new Modifiers(1, 2, 3, 4);
//		privateConstructor.display();
	}

}
