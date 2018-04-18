
public class HikingForSloths {

	public static void main(String[] args) {
		double[] test = {57.3, 270.0, -4.1, 528.3, 143.8};
		print( "[!] Test[] isLow: " + isLowAltitude(test) );
		print("[!] Test[] trailData: ");
		showTrailData(test);
	}
	
	public static boolean isLowAltitude(double[] values) {
		int iLCount = 0;
		for(int i = 0; i < values.length; i++) {
			if(values[i] < 200.0) {
				iLCount++;
			}
		}
		if((double) iLCount / values.length >= 0.6) {
			return true;
		}
		return false;
	}
	
	public static void showTrailData(double[] values) {
		String out = "TrailData: ";
		for(int i = 0; i < values.length; i++) {
			out += values[i];
			if(i + 1 < values.length) {
				if(values[i + 1] > values[i]) {
					out += " / ";
				} else if (values[i + 1] < values[i]) {
					out += " \\ ";
				} else {
					out += " - ";
				}
			}
		}
		print(out);
	}
	public static void print(String string) {
		System.out.println(string);
	}
}
