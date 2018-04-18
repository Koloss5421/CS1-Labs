
public class Lab5HW {

	public static void main(String[] args) {
		String sSocial = "123 45 4789";
		System.out.println("Is Social Security Format Correct for: " + sSocial + " | " + isValidSSN(sSocial)); // Check Social Security format here
		
		System.out.println("\n\n");
		
		String sToTrim = "           A     B      C      D     EAAAAA     J     I     P    K                  ";// Maybe a bit excessive but it worked to test it
		System.out.println("String to trim: '" + sToTrim + "' | Trimmed: '" + trim(sToTrim) + "'" );
	}
	
	public static String trim(String s) {
		String sCurrent = s;
		int iFirstChar = -1; // NOT SET
		int iLastChar = -1;
		int iSpaceCount = 0;
		int iLastSpace = -1;
		int iChangeCount = 0;
		boolean bFormat = false;

		for(int i = 0; i < sCurrent.length(); i++) { // This loop Removes all the 
			if(sCurrent.charAt(i) != ' ') {
				if(iFirstChar == -1) {
					iFirstChar = i;
				}
				iLastChar = i + 1;
			}
		}
		if(iFirstChar != -1 && iLastChar != -1) {
			sCurrent = sCurrent.substring(iFirstChar, iLastChar);
		}
		
		while(!bFormat) {
			for(int j = 0; j < sCurrent.length(); j++) {
				if(sCurrent.charAt(j) == ' ') {
					iSpaceCount++;
					if(iSpaceCount > 1) {
						String old = sCurrent;
						sCurrent = old.substring(0, iLastSpace + 1) + old.substring(j + 1, old.length());
						iSpaceCount = 0;
						iChangeCount++;
					} else {
						iLastSpace = j;
					}
				} else {
					iLastSpace = -1;
					iSpaceCount = 0;
				}
			}
			if(iChangeCount == 0) {
				bFormat = true;
			} else {
				iChangeCount = 0;
			}
		}
		
		return sCurrent;
	}
	
	public static boolean isValidSSN(String n) {
		if(n.length() == 11) {
			
			char cX = n.charAt(3);
			char cY = n.charAt(6);
			
			if( !(cX == '-' || cX == ' ') ) {
				return false; // False because length is 11 and format only accepts '-' or ' '
			} else {
				if(cX == '-' && cY != '-') {
					return false;
				}
				if(cX == ' ' && cY != ' ') {
					return false;
				}
			}
			
			String[] sSubStrings = {n.substring(0, 3) , n.substring(4, 5) , n.substring(7, 11) }; // If the method gets to this point, split the substrings into an array			
			for (int i = 0; i < sSubStrings.length; i++) { // Loop for subStrings Array 'Cause Quicker.
				
				for(int j = 0; j < sSubStrings[i].length(); j++) { // Loop for current subString at i
					if( sSubStrings[i].charAt(j) < '0' || sSubStrings[i].charAt(j) > '9' ) {
						return false;
					}
				}
			}
			return true; // Return true if it makes it here that is.
		} else if(n.length() == 9) {
			
			for(int j = 0; j < n.length(); j++) {
				if( n.charAt(j) < '0' || n.charAt(j) > '9' ) {
					return false;
				}
			}
			
			return true;
		} else {
			return false;
		}
		
	}

}
