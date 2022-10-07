/*
 	Program : String method
 	@Author : Royston
  	@Date : 30Sep
 */
package StringMethods;

// Creating StringMethods class
public class StringMethods {
	// calling main method
	public static void main(String[] args) {
		// String variable
		String s = "Hi Java";

		// charAt
		System.out.println("Character at 0th position :" + s.charAt(0));

		// length
		System.out.println("Length is :" + s.length());

		// Concat
		String s1 = " Good ";
		s1 = s1.concat(s);
		System.out.println("Concantenated string is:" + s1);

		// substring
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));

		// to find the string
		System.out.println(s.contains("java"));
		// to find the string
		System.out.println(s.contains("Java"));

		// isEmpty
		String s2 = "";
		System.out.println(s2.isEmpty());
		s2 = " ";
		System.out.println(s2.isEmpty());

		// replacing
		String s3 = s.replace("Java", "C++");
		System.out.println(s3);

		// find the postion of character
		int position = s.indexOf("J");
		System.out.println(position);

		// trim
		String s4 = "      Hi Java    ";
		System.out.println(s4);
		System.out.println(s4.length());
		// trim method removes white spaces from begning and end
		s4 = s4.trim();
		System.out.println(s4);
		System.out.println(s4.length());

		// uppercase
		String s5 = "java";
		System.out.println("Upper case : " + s5.toUpperCase());
		// lowercase
		String s6 = "JAVA";
		System.out.println("Lower case : " + s6.toLowerCase());

	}

}
