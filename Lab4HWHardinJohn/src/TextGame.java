import java.util.Scanner;

public class TextGame {
	
	public static int x, y = 0;
	public static Scanner scanner = new Scanner(System.in);
	
	public static Boolean running = true;
	
	public static void main(String[] args) {
		
		print("[#] Map Explorer");
		print("[#] By: John Hardin\n\n");
		
		while(running) {
			printLoc();
			getInput();
		}
	}
	
	public static void printLoc() {
		print("[-] You are currently at ( " + x + ", " + y + " )");
		print("[+] Enter a Direction (N = North, S = South, E = East, W = West, quit = Quit Game): \n");
	}
	
	public static void getInput() {
		String input = scanner.nextLine().toLowerCase();
		
		if( input.equals("n") ) { y++; }
		else if( input.equals("s") ) { y--; }
		else if( input.equals("e") ) { x++; }
		else if( input.equals("w") ) { x--; }
		else if( input.equals("quit") ) { running = false; }
		else { print("[!] ERROR: '" + input + "' is not an option!"); }
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
