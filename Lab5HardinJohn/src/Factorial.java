import java.util.Scanner;

public class Factorial {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		print("[#] Factorial Calc");
		print("[#] By: John Hardin");
		print("[+] Enter a number: ");
		int scanIn = scanner.nextInt();
		print("[!] " + scanIn + "! = " + getFact(scanIn));
	}
	
	private static int getFact(int input) {
		if(input <= 0) {
			return 1;
		} else {
			int result = input;
			for(int i = input - 1; i > 0; i--) {
				result = result * i;
			}
			return result;
		}
	}
	
	private static void print(String string) {
		System.out.println(string);
	}
}
