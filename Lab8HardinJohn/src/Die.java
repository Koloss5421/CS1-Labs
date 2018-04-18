
public class Die {
	
	private int iSides;
	private int iRolled;
	
	public Die(int sides) {
		iSides = sides;
		iRolled = 0;
	}

	public int roll() {
		iRolled++;
		return (int) (Math.random() * iSides) + 1;
	}
	
	public int getSides() {
		return iSides;
	}
	
	public int getRolls() {
		return iRolled;
	}
}
