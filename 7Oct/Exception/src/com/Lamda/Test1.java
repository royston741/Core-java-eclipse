/*
 	Program : lambda
 	@Author : Royston
 	@date : 7 Oct
 */

package com.Lamda;

public class Test1 {

	public static void main(String[] args) {
		// lambda
		// no return type and 1 parameters
		MyName d1 = (name) -> {
			System.out.println("The name is : " + name);
		};
		d1.printMyName("Roy");

		// return type and 1 parameters
		MyName2 d2 = (name) -> {
			return name;
		};
		d2.printMyName("Roy");

		// omit parentheses
		MyName2 d3 = name -> {
			return name;
		};
		d3.printMyName("Joy");

		// lambda with multiple parameters and no return type
		Add a1 = (a, b) -> {
			System.out.println("The addition is : " + (a + b));
		};
		a1.add(1, 2);

		// lambda with multiple parameters and return type
		Add2 a2 = (a, b) -> {
			return (a + b);
		};
		a2.add(4, 9);

		// if there is single statement to return
		Add2 a3 = (a, b) -> (a + b);
		a3.add(4, 9);
	}
}
