package SplitString;

import java.util.Scanner;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the line : ");
		String str = sc.nextLine();

		String words[] = str.split(" ");

//		for (String i : words) {	
//			System.out.println(i);
//		}
		String large = words[0];
		String small = words[0];
		for (int i = 0; i < words.length; i++) {
			int len = words[i].length();
			if (small.length() > len) {
			}
			if (large.length() < len) {
			}
		}

	}

}
