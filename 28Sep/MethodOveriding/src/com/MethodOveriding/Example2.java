/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding;

public class Example2 extends Example1 {
	// overiding method
	@Override
	void msg() {
		System.out.println("--- Welcome ---");
	}
}
