/*
	Program : Multiple Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Multiple;

// Creating person class
public class Student {
	// Properties of student
	private int stdId;
	private String stdName;

	// no argument constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}

	// getter of stdId
	public int getStdId() {
		return stdId;
	}

	// setter of stdId
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	// setter of stdName
	public String getStdName() {
		return stdName;
	}

	// getter of stdName
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

}
