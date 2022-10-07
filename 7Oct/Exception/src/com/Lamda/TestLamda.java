/*
 	Program : lambda	
 	@Author : Royston
 	@date : 7 Oct
 */
package com.Lamda;

// create TestLambda class
public class TestLamda {

	public static void main(String[] args) {
		// anonymous class
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Draw circle");
			}
		};

		// lambda
		// no parameters
		Drawable d1 = () -> {
			System.out.println("Draw lambda");
		};
		d1.draw();

	}
}
