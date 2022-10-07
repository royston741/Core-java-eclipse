
package MethodOverloading;

import java.util.Scanner;

public class Student {

	private String name;
	private int age;
	private String addr;

	public Student() {
		super();
		this.name = "unknown";
		this.age = 0;
		this.addr = "not available";
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public void getInfo() {
		System.out.println("The student name is :" + name);
		System.out.println("The student age is :" + age);
		System.out.println("The student Address is :" + addr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student stdArr[] = new Student[1];

		for (int i = 0; i < stdArr.length; i++) {
			stdArr[i] = new Student();

			System.out.println("Enter student name : ");
			String name = sc.next();

			System.out.println("Enter student age : ");
			int age = sc.nextInt();

			System.out.println("Enter student address : ");
			String addr = sc.next();

			stdArr[i].setInfo(name, age, addr);
		}

		for (int i = 0; i < stdArr.length; i++) {
			stdArr[i].getInfo();
		}

	}

}
