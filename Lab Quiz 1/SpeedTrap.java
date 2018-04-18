import java.util.Scanner;

public class SpeedTrap {
	static Scanner scanner = new Scanner(System.in);
	
	static final int inf = 10; // less than 2mph over
	static final int mis = 20; // at least between 2 and 5
	static final int fel = 50; // >= 5 over the limit
	
	static int felons, misdems, infract, abide = 0;

	public static void main(String[] args) {
		print("[#] Ticket Calculator");
		print("[#] By: John Hardin\n");
		
		print("[+] How many sloths were involved?");
		int num = scanner.nextInt();
		getData(num);
	}
	public static void getData(int num) {
		for(int i = 0; i < num; i++) {
			print("[+] How fast was sloth " + (i + 1) + "moving, in MPH?");
			double iSpeed = scanner.nextDouble();
			print("[+] What was the speed limit, in mph?");
			int iLimit = scanner.nextInt();
			calcFine(iSpeed, iLimit);
		}
		printTickets();
	}
	public static void calcFine(double speed, int limit) {
		double calc = speed - limit;
		
		if(calc > 0) {
			if(calc < 2) {
				infract++;
			}
			if(calc >= 2 && calc < 5) {
				misdems++;
			}
			if(calc >= 5) {
				felons++;
			}
		} else {
			abide++;
		}
	}
	public static void printTickets() {
		print("[-]\tLaw-Abiding\t" + abide + "\t = $" + (abide * 0.00));
		print("[-]\tInfractions\t" + infract + "\t = $" + (float)(infract * inf));
		print("[-]\tMisdemeanors\t" + misdems + "\t = $" + (float)(misdems * mis));
		print("[-]\tFelonies\t" + felons + "\t = $" + (float)(felons * fel));
		
		print("[!] Total ticket revenue: $" + (float)((infract * inf) + (misdems * mis) + (felons * fel) ) );
	}
	public static void print(String string) {
		System.out.println(string);
	}

}
