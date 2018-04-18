
public class Car {
	
	private String sMake;
	private String sModel;
	private String sColor;
	private double dPrice;
	private int iMiles;
	
	public Car() {
		sMake = "Nissan";
		sModel = "GTR";
		sColor = "Black";
		dPrice = 110000;
		iMiles = 0;
	}
	public Car(String make,String model, String color, int price) {
		sMake = make;
		sModel = model;
		sColor = color;
		dPrice = price;
		iMiles = 0;
	}
	
	public void setPrice(double p) {
		dPrice = p;
	}
	
	public void paint(String c) {
		sColor = c;
	}
	public void displayCarInfo() {
		CarClient.print("[-] Make/Model: " + sMake + " " + sModel);
		CarClient.print("[-] Color: " + sColor);
		CarClient.print("[-] Price: $" + dPrice);
		CarClient.print("[-] Mileage: " + iMiles + " Miles");
	}
	public void travel(double dist) {
		CarClient.print("[!] The car is traveling " + dist + " Miles.");
		iMiles += dist;
	}

}
