import java.util.Scanner;

public class VendingMachine {
	
	static Scanner scanner = new Scanner(System.in);
	static String choice;
	static int quantity;
	static double money, amountNeeded;
	
	static final double SODA_PRICE = 1.00; 
	static final double DRAG_PRICE = 222.22; 
	static final double STDG_PRICE = 100.00; 
	static final double MGMS_PRICE = 2050.50;
	
	public static void main(String[] args) {
		print("[#] Vending Machine");
		
		printItems();
		getItem();
		getQuant();
		getMoney();
		
		switch(choice.toLowerCase()) {
			case "soda":
				if(money >= SODA_PRICE * quantity) {
					calcChange(SODA_PRICE);
				} else {
					notEnough(SODA_PRICE);
				}
				break;
			case "drgc":
				if(money >= DRAG_PRICE * quantity) {
					calcChange(DRAG_PRICE);
				} else {
					notEnough(DRAG_PRICE);
				}
				break;
			case "stdg":
				if(money >= STDG_PRICE * quantity) {
					calcChange(STDG_PRICE);
				} else {
					notEnough(STDG_PRICE);
				}
				break;
			case "mgms":
				if(money >= MGMS_PRICE * quantity) {
					calcChange(MGMS_PRICE);
				} else {
					notEnough(MGMS_PRICE);
				}
				break;
			default:
				print("[!] ERROR: '" + choice + "' is not an option!");
		}
	}
	public static void printItems() {
		print("[#] Items Available: ");
		print("[SODA] Cream Soda \t\t$" + SODA_PRICE);
		print("[DRGC] Dragon Scale Ships \t\t$" + DRAG_PRICE);
		print("[STDG] Steel Dagger \t\t$" + STDG_PRICE);
		print("[MGMS] Magic Missle \t\t$" + MGMS_PRICE);
	}
	public static void getItem() {
		print("[+] Enter Code for the item you want(Item code ex 'code' for [CODE]: ");
		choice = scanner.nextLine();
	}
	public static void getQuant() {
		print("[+] Enter the amount you want: ");
		quantity = scanner.nextInt();
	}
	public static void getMoney() {
		print("[+] Enter amount of money: ");
		money = scanner.nextDouble();
	}
	public static void notEnough(double price) {
		print("[!] ERROR: $" + money + " is not enough! You need $" + ((price * quantity) - money) + " more!");
	}
	public static void calcChange(double price) {
		double change = money - (price * quantity);
		print("[!] Thank you! Please take your items and change. Your Change is $" + change);
	}
	public static void print(String string) {
		System.out.println(string);
	}
}
