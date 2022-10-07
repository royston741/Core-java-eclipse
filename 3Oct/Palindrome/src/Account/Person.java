package Account;

public class Person extends Account {
	private String name;
	private int adhar_no;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int acc_no, double balance, String name, int adhar_no) {
		super(acc_no, balance);
		this.name = name;
		this.adhar_no = adhar_no;
	}

	@Override
	void display() {
		System.out.println("The Person name is : " + name);
		System.out.println("The Person adhar no is : " + adhar_no);
		System.out.println("The account number is : " + acc_no);
		System.out.println("The account balance is : " + balance);
	}

}
