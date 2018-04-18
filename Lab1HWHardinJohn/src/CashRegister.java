import java.util.Scanner;

public class CashRegister {
	
	static float totalCoins, totalBills, grandTotal = 0;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("[*] Cash Register By: John Hardin [*]");
		System.out.println("[-] Enter the number of each: ");
		getPennies();
		getNickels();
		getDimes();
		getQuarters();
		getDollars();
		getFives();
		getTens();
		getTwenties();
		
		printTotal();
	}
	
	public static void getPennies() {
		System.out.println("[+] Pennies: ");
		float entered = getInput() * .01f;
		totalCoins += entered;
		grandTotal += entered;
	}
	public static void getNickels() {
		System.out.println("[+] Nickels: ");
		float entered = getInput() * .05f;
		totalCoins += entered;
		grandTotal += entered;
	}
	public static void getDimes() {
		System.out.println("[+] Dimes: ");
		float entered = getInput() * .10f;
		totalCoins += entered;
		grandTotal += entered;
	}
	public static void getQuarters() {
		System.out.println("[+] Quarters: ");
		float entered = getInput() * .25f;
		totalCoins += entered;
		grandTotal += entered;
	}
	public static void getDollars() {
		System.out.println("[+] $1 Bills: ");
		float entered = getInput();
		totalBills += entered;
		grandTotal += entered;
	}
	public static void getFives() {
		System.out.println("[+] $5 Bills: ");
		float entered = getInput() * 5f;
		totalBills += entered;
		grandTotal += entered;
	}
	public static void getTens() {
		System.out.println("[+] $10 Bills: ");
		float entered = getInput() * 10f;
		totalBills += entered;
		grandTotal += entered;
	}
	public static void getTwenties() {
		System.out.println("[+] $20 Bills: ");
		float entered = getInput() * 20f;
		totalBills += entered;
		grandTotal += entered;
	}
	
	public static void printTotal() {
		System.out.println("===============================");
		System.out.println("[-] Total in Coins: $" + totalCoins);
		System.out.println("[-] Total in Bills: $" + totalBills);
		System.out.println("[!] GRAND TOTAL: $" + grandTotal);
	}
	
	
	public static int getInput() {
		return Integer.parseInt( scanner.nextLine() );
	}
}
