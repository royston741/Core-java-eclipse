/*
 	Program : overiding
 	@Author : Royston
 	@Date : 28 Sep
 */

package com.MethodOveriding3;

public class SBI extends Bank {
	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 8;
	}

}
