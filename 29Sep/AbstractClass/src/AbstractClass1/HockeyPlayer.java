package AbstractClass1;

public class HockeyPlayer extends Player {
	public boolean checkPlayer(Player p) {
		// condition for football player
		if (p.getAge() > 9)
			return true;
		else
			return false;
	}

}
