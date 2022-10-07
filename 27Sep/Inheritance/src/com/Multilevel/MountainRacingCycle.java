/*
	Program : Multilevel Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Multilevel;

// MountainRacingCycle extends MountainCycle
public class MountainRacingCycle extends MountainCycle {

	// properties of MountainRacingCycle
	private String navSystem;
	private String lights;

	// no argument constructor
	public MountainRacingCycle() {
		super();
		System.out.println("------ no arguments constructor cycle MountainRacingCycle ------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public MountainRacingCycle(String tiers, double price, String brand, int noOfGears, double speed, String navSystem,
			String lights) {
		super(tiers, price, brand, noOfGears, speed);
		System.out.println("------ parameterized constructor MountainRacingCycle ------");
		this.navSystem = navSystem;
		this.lights = lights;
	}

	// getter for navSystem
	public String getNavSystem() {
		return navSystem;
	}

	// setter for navSystem
	public void setNavSystem(String navSystem) {
		this.navSystem = navSystem;
	}

	// getter for lights
	public String getLights() {
		return lights;
	}

	// setter for lights
	public void setLights(String lights) {
		this.lights = lights;
	}

	@Override
	public String toString() {
		return "MountainRacingCycle [navSystem=" + navSystem + ", lights=" + lights + ", toString()="
				+ super.toString();
	}

}
