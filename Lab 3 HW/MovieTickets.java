import java.util.Scanner;

public class MovieTickets {
	
	static Scanner scanner = new Scanner(System.in);
	
	static final int EVENING = 1700, LAST_SHOW = 2400;
	
	static final float ADULT_AM = 8.00f, ADULT_PM = 10.50f, CHILD_AM = 0.00f, CHILD_PM = 4.00f, SENIOR_AM = 6.50f, SENIOR_PM = 8.00f;
	
	static int adult = 0, child = 0, senior = 0;

	public static void main(String[] args) {
		print("[#] Movie Ticket Calculator");
		print("[#] Created By: John Hardin");
		
		print("\n[+]What time is your showing? (24 Hour Format)");
		int time = scanner.nextInt();
		
		print("[+] How old is party member 1: ");
		getPartyMember(scanner.nextInt());
		
		print("[+] How old is party member 2: ");
		getPartyMember(scanner.nextInt());
		
		print("[+] How old is party member 3: ");
		getPartyMember(scanner.nextInt());
		
		print("[+] How old is party member 4: ");
		getPartyMember(scanner.nextInt());
		
		if(time >= EVENING && time <= LAST_SHOW) {
			calcPM();
		}
		else {
			calcAM();
		}
	}
	
	static void getPartyMember(int member) {
		if(member <= 10 && member > 0) {
			child++;
		} else if(member > 10 && member < 65) {
			adult++;
		} else if(member >= 65) {
			senior++;
		}
	}
	static void calcPM() {
		float adultCost, childCost, seniorCost, totalCost = 0f;
		adultCost = adult * ADULT_PM;
		childCost = child * CHILD_PM;
		seniorCost = senior * SENIOR_PM;
		totalCost = adultCost + childCost + seniorCost;
		
		print("\t[Matinee Order Summary]\n");
		print("Adult:\t$" + ADULT_PM + "\tx  " + adult + " =\t$" + adultCost);
		print("Child:\t$" + CHILD_PM + "\tx  " + child + " =\t$" + childCost);
		print("Senior:\t$" + SENIOR_PM + "\tx  " + senior + " =\t$" + seniorCost);
		print("TOTAL:\t\t\t$" + totalCost);
	}
	static void calcAM() {
		float adultCost, childCost, seniorCost, totalCost = 0f;
		adultCost = adult * ADULT_AM;
		childCost = child * CHILD_AM;
		seniorCost = senior * SENIOR_AM;
		totalCost = adultCost + childCost + seniorCost;
		
		print("\t[Matinee Order Summary]\n");
		print("Adult:\t$" + ADULT_AM + "\tx  " + adult + "  =\t$" + adultCost);
		print("Child:\t$" + CHILD_AM + "\tx  " + child + "  =\t$" + childCost);
		print("Senior:\t$" + SENIOR_AM + "\tx  " + senior + "  =\t$" + seniorCost);
		print("TOTAL:\t\t\t$" + totalCost);
	}
	
	static void print(String string) {
		System.out.println(string);
	}

}
