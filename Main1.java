public class Main1 {

	public static void main(String[] args) {
		
				Bicycle1 a = new Bicycle1();
				System.out.println("Bicycle Details:");
				System.out.println("Brand: "+ a.brand);
				System.out.println("Colour: "+ a.colour);
				System.out.println("Type: "+ a.type);
				System.out.println("Weight: "+ a.weight+"KG");
				System.out.printf("Price per unit: RM%.2f %n",a.price);
				System.out.println("Number of quantity: " + a.quantity);
				System.out.printf("Total Price: RM%.2f %n",a.totalprice);
				
				System.out.println();
				
				Bicycle1 b = new Bicycle1 ();
				System.out.println("Bicycle Details:");
				System.out.println("Brand: "+ b.brand);
				System.out.println("Colour: "+ b.colour);
				System.out.println("Type: "+ b.type);
				System.out.println("Weight: "+ b.weight+"KG");
				System.out.printf("Price per unit: RM%.2f %n",b.price);
				System.out.println("Number of quantity: " + b.quantity);
				System.out.printf("Total Price: RM%.2f %n",b.totalprice);

	}

}
