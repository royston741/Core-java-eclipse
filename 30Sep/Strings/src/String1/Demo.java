/*
	Program : Strings
 	@Author : Royston
 	@Date : 6 Oct
 */

/*
 Sequence of characters is a string 
 String is a class
 we can create string using following class :-
     	 Strings (Character sequence)
	   	  /    |   \
	 	 /	   |	\
		/      |	 \
	   /	   |      \
StringBuffer String  StringBuilder

 Strings created using string class are immutable
 Two way to  declare a string 
 1) literals ----> String s1 = "Hello Java";
 	- JVM stores the string value in string constant pool.
 	- when ever there are two identifiers with same value the reference to the value is provided
 	for eg :- 
 			  String s1="Welcome";
 			  String s2="Welcome"; -----> JVM will not provide seprate memory instead it will provide a refrence to s1 value from the pool  
 			
 2) Object   ----> String s2 = new String("Java");
 	- allocate seprate memory to objects even if values are same
 	for eg :-
 			String s1 = new String("Java"); // different memory
 			String s2 = new String("Java"); // different memory
 	
*/
package String1;

// Creating demo class
public class Demo {

	// calling main class
	public static void main(String[] args) {
		// literal declaration

		// STRINGS ARE NOT UPDATABLE
//		String s1 = "Hello Java";
		// concat method will not work because strings are immutable
//		s1.concat(" Welcome java");
//		System.out.println(s1);

		// MEMORY ALLOCATION IN LITERALS
//		String s1 = "Java"; // provide a memory
//		String s2 = "Java"; // provide referece to s1 as valus are same
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);
//		s1 = "Bye Java"; // change value of s1
		// now seprate memory will be provided tos1 and s2
//		System.out.println("----- After changing the value of s1 -----");
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);

		// orignal string
//		String originalS = "Welcome";
		// copy of orignal string
//		String copieds = originalS;
		// print strings
//		System.out.println("Original string is :" + originalS);
//		System.out.println("Copied String is :" + copieds);
		// changing value of orignal
//		originalS = originalS.concat(" Java");
		// the value of orignal changes
//		System.out.println("Original string is :" + originalS);
		// value of copy will not change
//		System.out.println("Copied String is :" + copieds);

		// Creating object

		// different memory will be provided for s1 and s2 even if values are same
//		String s1 = new String("Java");
//		String s2 = new String("Java");
//		System.out.println("s1 : " + s1);
//		System.out.println("s2 : " + s2);

//		String s1 = new String("Hello java");
		// concat method will not work because strings are immutable
//		s1.concat(" Welcome java");
//		System.out.println(s1);

		// orignal string
//		String originalS = new String("Welcome");
//		 copy of orignal string
//		String copieds = originalS;
		// print strings
//		System.out.println("Original string is :" + originalS);
//		System.out.println("Copied String is :" + copieds);
		// changing value of orignal
//		originalS = originalS.concat(" Java");
		// the value of orignal changes
//		System.out.println("Original string is :" + originalS);
		// value of copy will not change
//		System.out.println("Copied String is :" + copieds);

	}

}
