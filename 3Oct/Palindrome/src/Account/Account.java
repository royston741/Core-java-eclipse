/*
 Shuruti Singhal2:54 PM
Square Area : 49.0 Circle Area : 38.5Square has the largest area.3.Write a program 
to create an Account class containing acc_no, balance as datamembers and disp() to 
display the details. Inherit it in Person class with all mentioned data members and functions. 
Person class also has name and aadhar_no as extra data members of its own. Override disp()
function. Create 5 persons’ detailsWrite a program to create an Account class containing acc_no, 
 balance as datamembers and disp() to display the details. Inherit it in Person class with all 
 mentioned data members and functions. Person class also has name and aadhar_no as extra data
  members of its own. Override disp() function. Create 5 persons’ details

 */

package Account;

public class Account {
	protected int acc_no;
	protected double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int acc_no, double balance) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
	}

	void display() {
		System.out.println("The account number is : " + acc_no);
		System.out.println("The account balance is : " + balance);
	}
}
