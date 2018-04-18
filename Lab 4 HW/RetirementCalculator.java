import java.util.Scanner;

public class RetirementCalculator {
	
	static Scanner scanner = new Scanner(System.in);
	static final int RETIRE = 65;
	static int lastAge = 0;
	static int initial,target,cont,age;
	static double interest;

	public static void main(String[] args) {
		
		PrInT("[#] Retirement Calculator");
		PrInT("[#] By John Hardin");
		
		PrInT("[+] How Much money would you start with? ");
		initial = scanner.nextInt();
		
		PrInT("[+] How Much do you want to make by retirement (65 yrs old)? ");
		target = scanner.nextInt();
		
		PrInT("[+] How Much do you wawnt to contribute each year? ");
		cont = scanner.nextInt();
		
		PrInT("[+] How old are you now?");
		age = scanner.nextInt();
		
		PrInT("[+] Annual growth in percent: ");
		interest = scanner.nextDouble() / 100;
		
		if( isPossible() ) {
			showWork();
		} else {
			PrInT("Sorry, that goal isn't possible.");
		}
	}
	
	public static Boolean isPossible() {
		double current = initial;
		
		for(int i = age; i < RETIRE; i++) {
			current = (current + cont) * (1 + interest);
		}
		if(current < target) {
			return false;
		}
		return true;
	}
	
	public static Boolean isContNec(double current, int curAge) { // Checks if contribution is still necessary	
		double hold = current;
		
		for(int i = curAge; i < RETIRE + 1; i++) {
			hold = hold * (1 + interest);
		}
		if(hold < target) {
			if (lastAge < curAge) {
				lastAge = curAge;
			}
			return true;
		}
		return false;
		
	}
	public static void showWork() {
		
		double current = initial;
		PrInT("Projected Growth");
		PrInT("----------------");
		PrInT("Age\tInterest\tContribution\tEnd Balance");
		
		for(int i = age + 1; i < RETIRE + 1; i++) {
			
			double hold = current;
			
			if( isContNec(hold, i) ) {
				current = (current * (1 + interest)) + cont;
				System.out.printf("\n%d \t %.2f \t %d \t %.2f", i, (hold * interest), cont, current);
				//print(i + "\t" + (hold * interest)+ "\t" + cont + "\t" + current);
			} else {
				current = current * (1 + interest);
				System.out.printf("\n%d \t %.2f \t %.2f \t %.2f", i, (hold * interest), 0.00, current);
			}
		}
		
		PrInT("\n\n[!] You can stop contributing at age: " + lastAge + ", and coast the rest of the way!");
	}
	
	public static void PrInT(String string) {
		System.out.println(string);
	}

}
