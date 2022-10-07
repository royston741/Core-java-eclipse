/*
 	Program : String builder
 	@Author : Royston
  	@Date : 30Sep
 */

package StringBufferAndBuilderTime;

public class StringBuilderDemo {

	// calling main method
	public static void main(String[] args) {
		// string builder is mutable
		StringBuilder str = new StringBuilder();
		System.out.println("Length:" + str.length());
		System.out.println("Capacity:" + str.capacity());

		StringBuilder str1 = new StringBuilder("Java");
		System.out.println("Length:" + str1.length());
		System.out.println("Capacity:" + str1.capacity());
	}
}
