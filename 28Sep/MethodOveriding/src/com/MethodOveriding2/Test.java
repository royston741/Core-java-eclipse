/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding2;

public class Test {
	public static void main(String... args) {

		Vehicle v = new Vehicle();
		v.msg("My Vehicle");

		Car c = new Car();
		c.msg("My Car");

		Bike b = new Bike();
		b.msg("My Bike");
	}
}
