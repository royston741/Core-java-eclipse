/*
 	Program : Method overloading
 	@Author : Royston
 	@Date : 26 Sep
 */

package com.Student;

// Creating student class
public class Student {

	// properties of student
	private int StdId;
	private String stdName;
	private int stdAge;
	private double stdScore;
	private String stdCourse;

	// no argument constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// argument constructor
	public Student(int stdId, String stdName, int stdAge, double stdScore) {
		super();
		StdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdScore = stdScore;
		this.stdCourse = "BCA";
	}

	// argument constructor
	public Student(int stdId, String stdName, int stdAge, double stdScore, String stdCourse) {
		super();
		StdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdScore = stdScore;
		this.stdCourse = stdCourse;
	}

	// getter student id
	public int getStdId() {
		return StdId;
	}

	// setter for student id
	public void setStdId(int stdId) {
		StdId = stdId;
	}

	// getter student name
	public String getStdName() {
		return stdName;
	}

	// setter for student name
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	// getter student age
	public int getStdAge() {
		return stdAge;
	}

	// setter for student age
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	// getter student score
	public double getStdScore() {
		return stdScore;
	}

	// setter for student score
	public void setStdScore(double stdScore) {
		this.stdScore = stdScore;
	}

	// getter student course
	public String getStdCourse() {
		return stdCourse;
	}

	// setter for student course
	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	@Override
	public String toString() {
		return "Student [StdId=" + StdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdScore=" + stdScore
				+ ", stdCourse=" + stdCourse + "]";
	}

}
