/*
 	Program : String Bufferr
 	@Author : Royston
  	@Date : 30Sep
 */

package StringBufferAndBuilderTime;

// Creating StringBuffer class
public class StringBufferDemo {

	// calling main method
	public static void main(String[] args) {
		// String buffer are mutable mutable
		// Empty string
		StringBuffer str = new StringBuffer();
		System.out.println("Length :" + str.length()); // len is 0
		System.out.println("Capacity:" + str.capacity()); // capicity is 16

		// append
		StringBuffer str2 = new StringBuffer("Java");
		str2.append("  is Good");
		System.out.println(str2);

		// insert
		str2.insert(13, " language");
		System.out.println(str2);

		// replace start end
		str2.replace(4, 13, " programming");
		System.out.println(str2);

		// delete
		str2.delete(4, 16);
		System.out.println(str2);

		// reverse
		StringBuffer strRev = str2.reverse();
		System.out.println(strRev);
	}
}
