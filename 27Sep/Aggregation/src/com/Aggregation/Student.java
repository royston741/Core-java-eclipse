/*
 	Program : Aggregation student class
 	@Author : Royston
 	@Date : 27 Sep
 */

package com.Aggregation;

/*
    aggregation- relation between two independent classes
	composition - relation between two independent classes
	
	 Aggregation: has a relationship
	 Student has an address
	 Employee has an account
	 reference of the class 
*/

// creating Student class
public class Student {
	// Student properties
	private int stdId;
	private String stdName;
	private Address stdAddr;

	// no argument constructor
	public Student() {
		super();
		System.out.println("------ no argument constructor of Student --------");
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student(int stdId, String stdName, Address stdAddr) {
		super();
		System.out.println("------ parameterized constructor of Student --------");
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddr = stdAddr;
	}

	// getter for stdId
	public int getStdId() {
		return stdId;
	}

	// setter for stdId
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	// getter for stdName
	public String getStdName() {
		return stdName;
	}

	// setter for stdName
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	// getter for stdAddr
	public Address getStdAddr() {
		return stdAddr;
	}

	// setter for stdAddr
	public void setStdAddr(Address stdAddr) {
		this.stdAddr = stdAddr;
	}
}
