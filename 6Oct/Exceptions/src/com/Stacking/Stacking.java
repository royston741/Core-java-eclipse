/*
 	Program : Stacking
 	@Author : Royston
 	@Date : 6 Oct
*/

//Exception-an unwanted event that disrupts the normal flow of a program execution
//types :-
//	1) Checked ---> compile time (Exception class)
//	2) Unchecked ---> run time (run time Exception class)
// root class of exception is throwable
package com.Stacking;

// Creating Stacking class
public class Stacking {

	// meth1 method
	public static void meth1() {
		System.out.println("------ method 1 ------");
		// call meth2
		meth2();
	}

	// meth2 method
	public static void meth2() {
		System.out.println("------ method 2 ------");
		// try meth3
		try {
			meth3();
		}
		// if exception
		catch (Exception e) {
			System.out.println("Err at method 3");
		}
	}

	// method 3
	public static void meth3() {
		System.out.println("------ method 3 ------");
		// arithmetic exception
		int a = 10 / 0;

	}

	// call main method
	public static void main(String[] args) {
		// call meth1
		meth1();
	}
}
