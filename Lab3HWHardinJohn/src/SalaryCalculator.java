import java.util.Scanner;

public class SalaryCalculator {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int salary = 0;
		print("[#] Salary Calculator ");
		print("[#] Created By: John Hardin");
		
		//GET INPUT
		print("[+] Enter Employee Grade: ");
		int grade = scanner.nextInt();
		
		print("[+] Enter Employee Step: ");
		int step = scanner.nextInt();
		
		switch(grade) {
			case 1:
				switch(step) {
					case 1:
						salary = 18785;
						break;
					case 2:
						salary = 19414;
						break;
					case 3:
						salary = 20039;
						break;
					default:
						noStep(step);
						
				}
				break;
			case 2:
				switch(step) {
					case 1:
						salary = 21121;
						break;
					case 2:
						salary = 21624;
						break;
					case 3:
						salary = 22323;
						break;
					default:
						noStep(step);
				}
				break;
			case 3:
				switch(step) {
					case 1:
						salary = 23045;
						break;
					case 2:
						salary = 23813;
						break;
					case 3:
						salary = 24581;
						break;
					default:
						noStep(step);
				}
				break;
			case 4:
				switch(step) {
					case 1:
						salary = 25871;
						break;
					case 2:
						salary = 26733;
						break;
					case 3:
						salary = 27595;
						break;
					default:
						noStep(step);
				}
				break;
			default:
				print("[!] ERROR: Grade: '" + grade + "' does not exist!");
				break;
		}
		
		switch(salary) {
			case 0:
				break;
			default:
				print("Employee Salary: \t\t$" + salary);
			break;
		}
		
	}
	
	static void noStep(int step) {
		print("[!] ERROR: Step: '" + step + "' does not exist!");
	}
	
	static void print(String string) {
		System.out.println(string);
	}

}
