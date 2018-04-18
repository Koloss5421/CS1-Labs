
public class CrapsGameIf {
	
	static int dieOne, dieTwo, rollTotal;
	static Boolean phase = false; // if False, phase = 1 | if true, phase = 2
	
	public static void main(String[] args) {
		
		print("[#] Craps Game (If Ver)\n");
		
		print("Phase 1:");
		rollDice();
		printResults();
		checkForWinLoss(rollTotal);
		
		if(phase) {
			print("[*] Rolling Again...");
			print("\nPhase 2:");
			rollDice();
			printResults();
			checkForWinLoss(rollTotal);
		}
	}
	
	public static void checkForWinLoss(int num) {
		if(num == 7 || num == 11) {
			print("[!] You lost...");
		} else if(num == 2 || num == 3) {
			print("[!] You WON!");
		} else if(num == 12){
			print("[!] You need to restart...");
		} else {
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
