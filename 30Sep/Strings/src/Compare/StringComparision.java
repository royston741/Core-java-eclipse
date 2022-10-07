/*
 	Program : String comparison using == and equals
 	@Author : Royston
  	@Date : 30Sep
 */

package Compare;

// Create string comparision class
public class StringComparision {
	// calling main methd
	public static void main(String... main) {
		String s1 = "Java";
		String s2 = "Java";
		// compares the reference
		System.out.println(s1 == s2);
		// compares the content
		System.out.println(s1.equals(s2));

		String s3 = new String("Java");
		String s4 = new String("Java");
		// compare reference
		System.out.println(s3 == s4);
		// compare content
		System.out.println(s3.equals(s4));
	}
}
