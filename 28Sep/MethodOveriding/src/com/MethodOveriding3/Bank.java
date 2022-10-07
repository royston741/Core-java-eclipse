/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding3;

// creating bank class
public class Bank {
	// properties of netBanking
	private boolean netBanking;
	private int noOfBranches;
	protected double rateOfInterest;

	// no argument
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Bank(boolean netBanking, int noOfBranches, double rateOfInterest) {
		super();
		// initialize variables
		this.netBanking = netBanking;
		this.noOfBranches = noOfBranches;
		this.rateOfInterest = rateOfInterest;
	}

	// getter and setter for isNetBanking
	public boolean isNetBanking() {
		return netBanking;
	}

	public void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	// getter and setter for branches
	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	// getter and setter for interest rate
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest() {
		this.rateOfInterest = 0;
	}

	@Override
	public String toString() {
		return "Bank [netBanking=" + netBanking + ", noOfBranches=" + noOfBranches + ", rateOfInterest="
				+ rateOfInterest + "]";
	}

}
