import java.util.Scanner;

public class CambatStats {
	
	static Scanner s = new Scanner(System.in);
	static double[] dAttacks;

	public static void main(String[] args) {
		print("[#] Combat Stats");
		print("[#] By: John Hardin\n\n");
		
		print("[+] How Many attacks are taking place (Whole number > 0)?");
		int iLength = s.nextInt();
		
		dAttacks = new double[iLength];
		
		
		double dLow = 0.0;
		double dHigh = 0.0;
		double dSum = 0.0;
		boolean bFirst = true;
		
		for(int i = 0; i < dAttacks.length; i++) {
			print("[+] Enter the amount of Damage: [In Decimal: 10.2, 101.56, etc]");
			dAttacks[i] = s.nextDouble();
			
			if(bFirst) { // If First run just set the value to both min and max;
				dLow = dAttacks[i];
				dHigh = dAttacks[i];
				bFirst = !bFirst;
			}
			if(dAttacks[i] > dHigh) {
					dHigh = dAttacks[i];
			}
			if(dAttacks[i] < dLow) {
					dLow = dAttacks[i];
			}
			dSum += dAttacks[i];
		}
		print("[!] Max Dmg: " + dHigh);
		print("[!] Min Dmg: " + dLow);
		print("[!] Avg Damage: " + (dSum / iLength));
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
