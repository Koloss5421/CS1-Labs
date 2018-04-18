
public class CarClient {

	public static void main(String[] args) {
		Car cayman = new Car("Porche", "Cayman S", "Black", 63800);
		Car leaf = new Car("Nissan", "Leaf", "Blue", 29010);
		
		cayman.displayCarInfo();
		leaf.displayCarInfo();
		
		cayman.paint("Purple");
		leaf.paint("Green");
		
		cayman.travel(12000);
		leaf.travel(8000);
		
		cayman.setPrice(50000);
		leaf.setPrice(24500);
		
		cayman.displayCarInfo();
		leaf.displayCarInfo();
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
