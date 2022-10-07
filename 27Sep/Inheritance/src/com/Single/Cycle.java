/*
	Program : Single Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Single;

// Creating class named SigleInheritance
public class Cycle {
	// properties of Cycle
	private String tiers;
	private double price;
	private String brand;

	// no argument constructor
	public Cycle() {
		super();
		System.out.println("------ no argument constructor of cycle------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Cycle(String tiers, double price, String brand) {
		super();
		System.out.println("------ parameterized constructor cycle------");
		this.tiers = tiers;
		this.price = price;
		this.brand = brand;
	}

	// getter for tiers
	public String getTiers() {
		return tiers;
	}

	// setter for tiers
	public void setTiers(String tiers) {
		this.tiers = tiers;
	}

	// getter for price
	public double getPrice() {
		return price;
	}

	// setter for price
	public void setPrice(double price) {
		this.price = price;
	}

	// getter for brand
	public String getBrand() {
		return brand;
	}

	// setter for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cycle [tiers =" + getTiers() + ", price =" + getPrice() + ", brand =" + getBrand() + "]";
	}

}
