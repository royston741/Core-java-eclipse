/*
	Program : Hybrid Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Hybrid;

// Create mountainCycle class inherit cycle class
public class MountainCycle extends Cycle {
	// properties of MountainCycle
	private int noOfGears;
	private double speed;

	// no arguments constructor
	public MountainCycle() {
		super();
		System.out.println("------ no arguments constructor of MountainCycle ------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public MountainCycle(String tiers, double price, String brand, int noOfGears, double speed) {
		super(tiers, price, brand);
		System.out.println("------ parameterized constructor of MountainCycle ------");
		this.noOfGears = noOfGears;
		this.speed = speed;
	}

	// getter for noOfGears
	public int getNoOfGears() {
		return noOfGears;
	}

	// setter for noOfGears
	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	// getter for speed
	public double getSpeed() {
		return speed;
	}

	// setter for speed
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "MountainCycle [noOfGears =" + getNoOfGears() + ", speed=" + getSpeed() + ", toString()="
				+ super.toString();
	}

}