
public class DieClient {

	public static void main(String[] args) {
		Die die = new Die(20);
		int roll = die.roll();
		
		while(roll != 20) {
			roll = die.roll();
		}
		
		System.out.println("[-] It took " + die.getRolls() + " roll(s) to get to 20!");
	}

}
