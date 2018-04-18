import java.util.Scanner;

public class Sorter {
	
	static Scanner scan = new Scanner(System.in);
	static String[][] names = {
			{"Dwight","Eisenhower"},
			{"John","Kennedy"},
			{"Lyndon", "Johnson"},
			{"Richard", "Nixon"},
			{"Gerald", "Ford"},
			{"James", "Carter"},
			{"Ronald", "Reagan"},
			{"George", "Bush"}, // Did 9/11
			{"William", "Clinton"},
			{"George", "Bush"},
			{"Barack", "Obama"},
			{"Donald", "Trump"}
	};
	
	public static void main(String[] args) {
		print("[#] Printing names[]...");
		printNames();
		print("[#] Sorting names[]...");
		sortNames();
		print("[#] Printing names[]..");
		printNames();
		
		print("[+] Enter a name (ex. George Bush): ");
		String search = scan.nextLine();
		print("Index of '" + search + "' is: " + searchName(search) );
	}
	
	public static void sortNames() {
		boolean swapped = false;
		boolean running = true;
		
		while(running) {
			swapped = false;
			for(int i = 0; i < names.length - 1; i++) {
				if( checkNames(names[i], names[i + 1], true) == true ) {
					swapped = true;
					String[] tmp = names[i];
					names[i] = names[i + 1];
					names[i + 1] = tmp;
				}
			}
			if(!swapped) {
				running = false;
			}
		}
	}
	public static boolean checkNames(String[] sA, String[] sB, boolean last) {
		String a, b;
		if(last) {
			a = sA[1];
			b = sB[1];
		} else {
			a = sA[0];
			b = sB[0];
		}
		int iSim = 0;
		for(int i = 0; i < a.length(); i++) {
			if(iSim == 0 && a.charAt(i) < b.charAt(i)) {
				return false;
			}
			if(iSim == 0 && a.charAt(i) > b.charAt(i)) {
				return true;
			}
			if(iSim == i - 1 && a.charAt(i) > b.charAt(i)) {
				return true;
			}
			if(iSim == b.length() - 1 && a.length() > b.length()) {
				return checkNames(sA, sB, false); // check first Names
			}
			iSim++;
		}
		return false;
	}
	
	public static int searchName(String string) {
		int iMin = 0;
		int iMax = names.length;
		String[] search = string.split(" ");
		boolean bFound = false;
		
		while(iMin <= iMax) {
			int iMid = (iMin + iMax) / 2;
			
			if(names[iMid][1].toLowerCase().compareTo(search[1].toLowerCase()) < 0) {
				iMin = iMid + 1;
			} else if(names[iMid][1].toLowerCase().compareTo(search[1].toLowerCase()) > 0) {
				iMax = iMid - 1;
			} else {
				return iMid;
			}
		}
		return -1;
	}
	
	public static void printNames() {
		for(int i = 0; i < names.length; i++) {
			print(names[i][0] + " " + names[i][1] + " [" + i + "]");
		}
	}
	public static void print(String string) {
		System.out.println(string);
	}
}
