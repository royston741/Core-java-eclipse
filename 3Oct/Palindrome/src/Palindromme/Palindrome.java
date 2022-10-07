package Palindromme;

public class Palindrome {

	static void isPalindrome(String str) {
		String reversedString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}

		if (str.equals(reversedString)) {
			System.out.print("Is palindrome");
		} else {
			System.out.print("Not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindrome("BUB");
	}

}
