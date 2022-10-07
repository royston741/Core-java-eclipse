/*
 	Program : Compare string builder and string Buffer time	
 	@Author : Royston
 	@date : 30 Oct
 */

package StringBufferAndBuilderTime;

// Create CompareTest class
public class CompareTest {
	// create check performance method
	public static void checkPerformance(String str) {
		// ----------- String buffer ------------
		// storing current time
		long currTime = System.currentTimeMillis();
		// Creating stringBuffer object
		StringBuffer sbf = new StringBuffer(str);
		// appending sbf
		for (int i = 0; i < 1000000; i++) {
			sbf.append("hi");
		}
		// Storing StringBuffer time
		long sbfTime = System.currentTimeMillis() - currTime;

		// ----------- String builder ------------
		// storing current time
		currTime = System.currentTimeMillis();
		// Creating stringBuilder object
		StringBuilder sbl = new StringBuilder(str);
		// appending sbl
		for (int i = 0; i < 1000000; i++) {
			sbl.append("hi");
		}

		// Storing StringBuilder time
		long sblTime = System.currentTimeMillis() - currTime;

		// printing time taken
		System.out.println("String buffer time is : " + sbfTime + " mili sec");
		System.out.println("String builder time is : " + sblTime + " mili sec");
	}

	// calling main method
	public static void main(String[] args) {
		// calling checkPerformance method
		checkPerformance("Hello");
	}

}
