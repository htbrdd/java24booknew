package java24book;

public class Commodity {

	public static void main(String arguments) {
		String command  = "BUY";
		int balance = 550;
		int quantity = 42;
		
		switch (command) {
		case "BUY":
			quantity += 5;
			balance -= 20;
			break;
		case "SELL":
		quantity -= 5;
		balance += 15;
		}
		System.out.println("Balnce: " + balance + "\n" + "Quantity: " + quantity); 
	}
}