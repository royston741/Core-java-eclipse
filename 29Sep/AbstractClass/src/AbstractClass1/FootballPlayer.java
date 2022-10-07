package AbstractClass1;

public class FootballPlayer extends Player {
	@Override
	public boolean checkPlayer(Player p) {
		// condition for football player
		if (p.getAge() > 9)
			return true;
		else
			return false;
	}
}
