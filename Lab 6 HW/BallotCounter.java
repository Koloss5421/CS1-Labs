import java.util.Scanner;

public class BallotCounter {
	
	static boolean bRunning = true;
	static int[] iCandidates = new int[1000];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(bRunning) {
			print("[+] Enter the candidate's ID Number (0-999 | Negative to Exit): ");
			int iGet = scan.nextInt();
			
			if(iGet < 0) {
				bRunning = false;
			} else if(iGet < 999) {
				iCandidates[iGet] += 1;
			} else {
				print("[!] ERROR: Invalid Candidate number!");
			}
		}
		printResults();
	}
	
	public static void printResults() {
		for(int i = 0; i < iCandidates.length; i++) {
			if(iCandidates[i] != 0) {
				print("[-] Candidate " + i + ": " + iCandidates[i] + " vote(s)");
			}
		}
	}
	public static void print(String string) {
		System.out.println(string);
	}

}
