/*
	Program : Super
	@Author : Royston
	@Date : 27 Sep
*/

package com.SuperKeyword;

// Creating Dog class
public class Dog extends Animal {
	// properties of Dog
	private String color;
	private String breed;

	// no argument constructor
	public Dog() {
		super();
		System.out.println("------ non argument constructor dog ------");
	}

	// parameterized constructor
	public Dog(String color, String breed) {
		super(color);
		System.out.println("------ parameterized constructor dog ------");
		this.breed = breed;
	}

	// getter setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// getter setter for breed
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
