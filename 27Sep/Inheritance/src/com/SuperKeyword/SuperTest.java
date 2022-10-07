/*
	Program : Super
	@Author : Royston
	@Date : 27 Sep
*/

package com.SuperKeyword;

//Constructor call must be the first statement in a constructor

// Creating SuperTest class
public class SuperTest {
	// calling main method
	public static void main(String[] args) {
		Dog d = new Dog("White", "Labra");
		System.out.println(d);
		d.setColor("Brown");
		System.out.println(d);
	}

}
