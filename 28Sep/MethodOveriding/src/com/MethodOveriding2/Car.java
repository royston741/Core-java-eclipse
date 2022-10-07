/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding2;

public class Car extends Vehicle {
	// overwriting the msg
	@Override
	public void msg(String m) {
		System.out.println("Vehicle is Car" + m);
	}
}
