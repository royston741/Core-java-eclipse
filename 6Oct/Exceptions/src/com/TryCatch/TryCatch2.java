/*
 	Program : Nested try catch
 	@Author : Royston
 	@Date : 6 Oct
*/

package com.TryCatch;

import java.util.Scanner;

// create TryCatch class
public class TryCatch2 {
	// call main method
	public static void main(String[] args) {
//		scanner object
		Scanner sc = new Scanner(System.in);
		String s = null;
		try {

			int ar[] = new int[3];
			System.out.println("enter numbers:");
			for (int i = 0; i <= 2; i++) {
				ar[i] = sc.nextInt();
			}

			try {
				System.out.println(s.length());
			} catch (NullPointerException n) {
				System.out.println(n);
			} finally {
				System.out.println("------- finnally ---------");
			}

		} catch (Exception e) {
			System.out.println(" Exception Occured:" + e);
		}
	}

}
