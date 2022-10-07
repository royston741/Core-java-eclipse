/*
	Program : Hybrid Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Hybrid;

// Creating ElectricCycle
public class ElectricCycle extends Cycle {
	// ElectricCycle properties
	private String battery;

	// no argument constructor
	public ElectricCycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public ElectricCycle(String tiers, double price, String brand, String battery) {
		super(tiers, price, brand);
		this.battery = battery;
	}

	// getter for battery
	public String getBattery() {
		return battery;
	}

	// setter for battery
	public void setBattery(String battery) {
		this.battery = battery;
	}

}
