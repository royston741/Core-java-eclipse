/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding3;

public class Test {
	public static void main(String[] args) {
		// creating a object a1
		HDFC a1 = new HDFC();
		// setting rate of interest for a1
		a1.setRateOfInterest();
		System.out.println(a1.getRateOfInterest());

		// creating object a2
		SBI a2 = new SBI();
		// setting rate of interest for a2
		a2.setRateOfInterest();
		System.out.println(a2.getRateOfInterest());
	}
}
