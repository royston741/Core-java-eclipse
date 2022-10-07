/*
 	Program : Abstract class
 	@Author : Royston
 	@Date : 29Sep
 */

package AbstractClass1;

// Creating class Player
public abstract class Player {
	// properties of player
	private String name;
	private int age;

	// no argument constructor
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	// parameterized constructor
	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter and setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// getter and setter for age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// abstract method
	public abstract boolean checkPlayer(Player p);

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + "]";
	}

}
