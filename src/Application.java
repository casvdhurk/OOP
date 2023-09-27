
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Product product1 = new Product();
		Product product2 = new Product();
		
		// Passen product 1 aan
		//product1.name = "TV";
		//product1.price = 123;
		product1.printPrice();
		product1.setPrice(250);
		
		// passen product 2 aan
		//product2.name = "laptop";
		//product2.price = 850;
		product2.printPrice();
		product2.setPrice(920.50);
		boolean outcome = product2.isExpensive();
		System.out.println("product 2 duur: " + outcome);
		
		Product product3 = new Product(34.75);
		System.out.println("product3 prijs = " + product3.getPrice());
		
		
		//System.out.println("Product 2 prijs is " + product2.price);
	}

}
