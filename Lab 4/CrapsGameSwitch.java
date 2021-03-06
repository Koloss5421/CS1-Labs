
public class CrapsGameSwitch {
	static int dieOne, dieTwo, rollTotal;
	static Boolean phase = false; // if False, phase = 1 | if true, phase = 2
	
	public static void main(String[] args) {
		
		print("[#] Craps Game (Switch Ver)\n");
		
		print("Phase 1:");
		rollDice();
		printResults();
		checkForWinLoss(rollTotal);
		
		if(phase) { // It didn't say I couldn't use an if at all. This is just for phase switching.
			print("[*] Rolling Again...");
			print("\nPhase 2:");
			rollDice();
			printResults();
			checkForWinLoss(rollTotal);
		}
	}
	
	public static void checkForWinLoss(int num) {
		
		switch(num) { // Actual conditional for the Win Loss Part
			case 7:
			case 11:
				print("[!] You lost...");
				break;
			case 2:
			case 3:
				print("[!] You WON!");
				break;
			case 12:
				print("[!] You need to restart...");
				break;
			default:
				phase = true;
		}
	}
	
	public static void rollDice() {
		print("[*] Rolling dice...");
		dieOne = (int) (Math.random() * 6) + 1;
		dieTwo = (int) (Math.random() * 6) + 1;
		rollTotal = dieOne + dieTwo;
	}
	
	public static void printResults() {
		System.out.printf("[-] You rolled %d and %d, totaling %d\n", dieOne, dieTwo, rollTotal);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
