/*
	Program : Super
	@Author : Royston
	@Date : 27 Sep
*/

package com.SuperKeyword;

// Creating class animal
public class Animal {
	// properties of Animal
	private String name;
	private String color;

	// no arguments constructor
	public Animal() {
		super();
		System.out.println("------ non argument constructor Animal ------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Animal(String name, String color) {
		super();
		System.out.println("------ parameterized constructor 1 Animal ------");
		this.name = name;
		this.color = color;
	}

	// parameterized constructor
	public Animal(String color) {
		super();
		System.out.println("------ parameterized constructor 2 Animal ------");
		this.color = color;
	}

	// getter setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + "]";
	}

}
