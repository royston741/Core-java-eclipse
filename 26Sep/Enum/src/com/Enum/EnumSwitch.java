/*
 	Program : Enum
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.Enum;

// Creating EnumSwitch class
public class EnumSwitch {

	enum Directions {
		NORTH, SOUTH, EAST, WEST
	}

	// calling main method
	public static void main(String[] args) {

		Directions dir = Directions.EAST;

		switch (dir) {
		case NORTH -> System.out.println("North direction");
		case SOUTH -> System.out.println("South direction");
		case EAST -> System.out.println("East direction");
		case WEST -> System.out.println("West direction");
		default -> System.out.println("No direction");
		}

	}
}
