/*
 	Program : Multiple  catch
 	@Author : Royston
 	@Date : 6 Oct
*/

package com.TryCatch;

import java.util.Scanner;

public class TryCatch {
	// call main method
	public static void main(String... args) {
		// Scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:");
		try {
			// converting string to int
			String s = sc.next();
			int i = Integer.parseInt(s);

			// division
			int d = 89 / i;

			System.out.println(d);
		}
		// ----------- multiple catch block -------------
		catch (NumberFormatException e) {
			System.out.println("The string is not a number");
		}

		catch (Throwable m) {
			System.out.println(m);
		}

		System.out.println("--------- The End ----------");
	}
}
