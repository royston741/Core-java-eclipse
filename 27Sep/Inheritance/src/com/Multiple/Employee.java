/*
	Program : Multiple Inheritance
	@Author : Royston
	@Date : 27 Sep
*/

package com.Multiple;

//Creating person class
public class Employee {
	// Properties of student
	private int empId;
	private String empName;

	// no argument constructor
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	// getter for empId
	public int getEmpId() {
		return empId;
	}

	// setter for empId
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	// getter for empName
	public String getEmpName() {
		return empName;
	}

	// setter for empName
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
