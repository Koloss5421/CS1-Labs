import java.util.Scanner;

public class PayrollCalculator {
	
	static final int RND_PAY = 85000;
	static final int SALES_PAY = 40000;
	static final int SEC_PAY = 50000;
	
	static final double COMM = 0.01;
	static final int RND_BONUS = 10000;
	static final int SEC_BONUS = 1000;
	static final int DEP_BONUS = 25000;
	
	static Scanner scanner = new Scanner(System.in);
	
	static boolean running = true;
	
	
	public static void main(String[] args) {
		print("[#] Payroll Calculator");
		print("[#] By: John Hardin\n");
		while(running) {
			getEmpType();
		}
	}
	public static void getEmpType() {
		print("[+] Enter employee type (1 = R&D, 2 = Sales, 3 = Security): ");
		int option = scanner.nextInt();
		
		switch(option) {
			case 1:
				getRnd();
				break;
			case 2:
				getSales();
				break;
			case 3:
				getSec();
				break;
			default:
				print("[!] ERROR: '" + option + "' is not an option!");
		}
	}
	public static void getRnd() {
		print("[+] How many years has this person been with the Company?");
		int years = scanner.nextInt();
		print("[-] Salary: $" + (RND_PAY + ((years / 5) * RND_BONUS)));
		enterAnother();
	}
	public static void getSales() {
		print("[+] How much did this person sell this year (In Dollars)?");
		int sales = scanner.nextInt();
		print( "[-] Salary: $" + ( SALES_PAY + (sales * COMM) ) );
		enterAnother();
	}
	public static void getSec() {
		print("[+] How many years has this person been with the company?");
		int years = scanner.nextInt();
		print("[+] Was this person deployed this year (1 = yes)?");
		int dep = scanner.nextInt();
		
		if(dep != 1) { dep = 0 ;} // set dep to 0 for math to work
		
		print( "[-] Salary: $" + ( SEC_PAY + (SEC_BONUS * years) + (dep * DEP_BONUS) ) );
		enterAnother();
	}
	public static void enterAnother() {
		print("[+] Would you like to enter another employee (0 = no, anything else = yes)");
		int option = scanner.nextInt();
		
		if(option == 0) {
			running = false;
		}
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
}
