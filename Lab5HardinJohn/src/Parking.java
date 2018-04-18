import java.util.Random;

public class Parking {

	public static void main(String[] args) {
		Random r = new Random();
		
		print("[#] Parking Calc");
		print("[#] By: John Hardin");
		print("[+] Enter number of minutes to park: ");
		print("[-] Total for 1440 min: " + calcPark( 1440 )); // One Day
		print("[-] Total for 1441 min: " + calcPark( 1441 )); // One Day 1 min
		print("[-] Total for 1470 min: " + calcPark( 1470 )); // One Day 30 min
		print("[-] Total for 1471 min: " + calcPark( 1471 )); // One Day 31 min
		print("[-] Total for 1500 min: " + calcPark( 1500 )); // One Day 60 min
		print("[-] Total for 1501 min: " + calcPark( 1501 )); // One Day 61 min
		int rand = (r.nextInt(1440 - 1) + 1);
		print("[-] [RANDOM] Total for " + rand + " min: " + calcPark( rand )); // Random
		print("[-] Total for 2880 min: " + calcPark( 2880 )); // 2 full days
	}
	
	private static float calcPark(int min) {
		float result = 0.0f;
		int curMin = min;
		if(min <= 0) {
			return 0;
		}
		if(curMin > 60) {
			
			while(curMin >= (24 * 60)) { // if it is a full day add 24 to ticket - remove the full day worth of min
				result += 24;
				curMin -= 1440;
			}
			while (curMin - 30 > 0 && curMin - 30 > 30) {
				
				if(curMin > (24 * 60)) {
					result += 24.00;
					curMin = curMin - 1440;
				} else {
					result += 1.0;
					curMin -= 30;
				}
			}
		}
		if(curMin > 30 && curMin <= 60) {
			result += 2;
			curMin = 0;
		}
		if(curMin <= 30) {
			curMin = 0;
		}
		
		
		return result;
	}
	private static void print(String string) {
		System.out.println(string);
	}

}
