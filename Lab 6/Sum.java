import java.util.Scanner;

public class Sum {
	
	static int iLength = 5; // Change this value to change the length
	static int[] iValues = new int[iLength];
	static boolean bIsAdding = true;
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean bFirst = true; // Is this the first run?
		int iSum = 0; // Used to store the sum
		print("[#] Alternating Sum Calculator");
		print("[#] By: John Hardin \n\n");
		for(int i = 0; i < iValues.length; i++) {
			print("[+] Enter a number: ");
			iValues[i] = s.nextInt();
			if(bFirst) {  // Check if this is the first number if so just set sum equal to it.
				iSum = iValues[i];
				bFirst = !bFirst; // set bFirst False so it either adds or subtracts after this.
			} else if(bIsAdding) { // Do we add or subtract this time
				iSum += iValues[i];
			} else {
				iSum -= iValues[i];
			}
			bIsAdding = !bIsAdding; // To keep from having this in both 'else if' and 'else' I set bIsAdding to true and just put this at the bottom
		}
		print("[!] The Sum is: " + iSum);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
