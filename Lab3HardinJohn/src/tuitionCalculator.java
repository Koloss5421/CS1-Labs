import java.util.Scanner;

public class tuitionCalculator {
	
	static final int STD_RATE = 400;
	static final int DIS_RATE = 60;
	static final int ENG_RATE = 25;
	
	static final int STD_HOURS = 12;
	
	static int hours, engHours;
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		print("[#] Tuition Calculator");
		print("[#] By: John Hardin");
		
		getTotalHours();
		getEngHours();
		calcTuition();
	}
	
	static void getTotalHours() {
		print("[+] Enter your total hours: ");
		hours = scanner.nextInt();
	}
	
	static void getEngHours() {
		print("[+] How many of those hours are Engineering/Science courses?: ");
		engHours = scanner.nextInt();
	}
	
	static void calcTuition() {
		int temp = 0; 
		int total, standard, extra, engExtra;
		
		if (hours > STD_HOURS) {
			temp = hours - STD_HOURS;
			hours = 12;
		}
		standard = (STD_RATE * hours);
		extra = (DIS_RATE * temp);
		engExtra = (ENG_RATE * engHours);
		total = standard + extra + engExtra;
		
		print("[-] $400 per Credit Hour up to 12 * " + hours + " hours \t = $" + standard);
		print("[-] $60 per Credit Hour over 12 * " + temp + " hours \t = $" + extra);
		print("[-] $25 per Credit Hour of Sci/Eng * " + engHours + " hours \t = $" + engExtra);
		print("[!] GRAND TOTAL: \t\t = $" + total);
		
	}
	
	static void print(String string) {
		System.out.println(string);
	}
}
