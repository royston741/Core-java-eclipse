package com.CustomException;

public class Account {

	public static void main(String[] args) throws CustomException {
		int balance = 40;
		if (balance < 500) {
			throw new CustomException(balance);
		} else {
			System.out.println("Valid");
		}
	}

}
