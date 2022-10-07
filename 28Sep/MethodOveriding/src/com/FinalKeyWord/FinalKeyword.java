/*
 	Program : global constant using final
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.FinalKeyWord;

// Creating First class 
public class FinalKeyword {
	// global variable declaration
	// It is constant its value cannot be changed
	public final int num1 = 1000;

	// suppose the value is not initialized to the constant
	public final int num2;

	// global constant static
	// public final static int num3;
	public final static int num3 = 78;

	public FinalKeyword() {
		super();
		this.num2 = 29;
		// TODO Auto-generated constructor stub
	}

	public FinalKeyword(int num2) {
		super();
		this.num2 = num2;
	}

	// Calling main method
	public static void main(String... args) {
		// num1 is not directly accessible so create a object
		FinalKeyword n1 = new FinalKeyword();
		System.out.println("The value of object 1 is : ");
		// print global constant
		System.out.println("num1 : " + n1.num1);
		System.out.println("num2 : " + n1.num2);

		// new object n2
		FinalKeyword n2 = new FinalKeyword(5);
		System.out.println("The value of object 2 is : ");
		// print global constant
		System.out.println("num1 : " + n2.num1);
		System.out.println("num1 : " + n2.num2);

		System.out.println("------ static global constant ------");
		// num3 = 14; --> global constant using static keyword cannot be initialized
		// afterwords
		System.out.println("num3 : " + num3);

	}
}
