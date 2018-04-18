import java.util.Scanner;

public class CostEstimator {
	
	// Setup Scanner for input
	static Scanner scanner = new Scanner(System.in);
	
	// Total Surface Areas
	static float wallSA, doorSA, windowSA, totalSA;
	
	static boolean isDeluxe = false;
	
	static final float STD_COST = 14.99f;
	static final float DLX_COST = 29.99f;
	static final float TAX = 0.0925f;
	static final int MAX_PER_BUCKET = 250;

	public static void main(String[] args) {
		print("[*]\tPaint Cost Estimator \t[*]");
		print("[*]\tCreated By: John Hardin[*]");
		print("\n[#] Enter all measurements in decimal format! (Ex 4.17 for 4ft 2in): ");
		getRoom();
		getDoor();
		getWindow();
		calcTotalSA();
		
		getPaintType();
		calcAndPrint();
	}
	
	public static void getRoom() {
		print("[+] Enter Room Length: \t");
		float length = scanner.nextFloat();
		print("[+] Enter Room Width: \t");
		float width = scanner.nextFloat();
		print("[+] Enter Room Height: \t");
		float height = scanner.nextFloat();
		
		wallSA = ((length * height) * 2) + ((width * height) * 2);
	}
	
	public static void getDoor() {
		print("[+] Enter Door Width: ");
		float width = scanner.nextFloat();
		print("[+] Enter Door Height: ");
		float height = scanner.nextFloat();
		
		doorSA = width * height;
	}
	
	public static void getWindow() {
		print("[+] Enter Window Width: ");
		float width = scanner.nextFloat();
		print("[+] Enter Window Height: ");
		float height = scanner.nextFloat();
		
		windowSA = width * height;
	}
	public static void calcTotalSA() {
		totalSA = wallSA - (doorSA + windowSA);
	}
	
	public static void getPaintType() {
		print("[+] Enter Paint Type ( For Standard use [0]/ For Deluxe use [1]): ");
		 byte paint = scanner.nextByte();
		 
		 if(paint == 1) {
			 isDeluxe = true;
		 }
	}
	
	public static void calcAndPrint() {
		float subTotCans = totalSA / MAX_PER_BUCKET;
		int totalCans = (int) subTotCans;
		float subTotCost, totalTax;
		
		if(subTotCans > totalCans) {
			totalCans++;
		}
		
		print("[-] Paintable Area: \t\t" + totalSA + " ft^2");
		print("[-] Paint Needed: \t\t" + totalCans + " Cans");
		
		if(isDeluxe) {
			print("[-] Paint Type: \t\tDeluxe");
			subTotCost = (totalCans * DLX_COST) ;
		} else {
			print("[-] Paint Type: \t\tStandard");
			subTotCost = (totalCans * STD_COST) ;
		}
		print("[-] Subtotal: \t\t\t$" + subTotCost);
		totalTax = subTotCost * TAX;
		print("[-] Sales Tax: \t\t\t$" + totalTax);
		print("[!] Grand Total: \t\t$" + (subTotCost + totalTax) );
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
}
