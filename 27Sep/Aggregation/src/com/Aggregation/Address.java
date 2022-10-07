/*
 	Program : Aggregation address class
 	@Author : Royston
 	@Date : 27 Sep
*/

package com.Aggregation;

// creating a Address class
public class Address {
	// properties of address
	private String building;
	private String city;
	private int pinCode;
	private String state;
	private String country;

	// no argument constructor
	public Address() {
		super();
		System.out.println("------ no argument constructor of Address --------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Address(String building, String city, int pinCode, String state, String country) {
		super();
		System.out.println("------ parameterized constructor of Address --------");
		// initialize variables
		this.building = building;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}

	// getter for building
	public String getBuilding() {
		return building;
	}

	// setter for building
	public void setBuilding(String building) {
		this.building = building;
	}

	// getter for city
	public String getCity() {
		return city;
	}

	// setter for city
	public void setCity(String city) {
		this.city = city;
	}

	// getter for pinCode
	public int getPinCode() {
		return pinCode;
	}

	// setter for pinCode
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	// getter for state
	public String getState() {
		return state;
	}

	// setter for state
	public void setState(String state) {
		this.state = state;
	}

	// getter for country
	public String getCountry() {
		return country;
	}

	// setter for country
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", city=" + city + ", piCode=" + pinCode + ", state=" + state
				+ ", country=" + country + "]";
	}

}
