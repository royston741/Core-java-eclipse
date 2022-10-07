package com.CustomException;

public class CustomException extends Exception {
	CustomException(int bal) {
		if (bal < 500) {
			System.out.println("Balance is low");
		}
	}
}
