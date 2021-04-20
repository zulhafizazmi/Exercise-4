import java.util.Scanner;

	public class Bicycle1 {
		
			String brand;
			String colour;
			String type;
			double weight;
			
			Scanner scan = new Scanner(System.in);
			int price;
			int quantity;
			int totalprice;
			
			Bicycle1() {
				System.out.print("Please enter the bicycle brand(Santa Cruz/Electron): ");
				this.brand = scan.nextLine();
				System.out.print("Please enter the bicycle colour(black / yellow): ");
				this.colour = scan.nextLine();
				System.out.println("Please enter the bicycle type(Mountain Bike/Electric Bike): ");
				this.type = scan.nextLine();
				System.out.print("Please enter the weight(13.2/12.4): ");
				this.weight = scan.nextDouble();
				if (brand.equalsIgnoreCase("Santa Cruz")) {
					if (colour.equalsIgnoreCase("black")) {
						if (type.equalsIgnoreCase("Mountain Bike")) {
						   if (weight == 13.2) {
							this.price = 3500;
						}
						else if (weight == 12.4) {
							this.price = 3000;
						}
					}
					else if (colour.equalsIgnoreCase("red")) {
						if (weight == 13.2) {
							this.price = 3500;
						}
						else if (weight == 12.4) {
							this.price = 3000;
						}
					}
				}
				else if (brand.equalsIgnoreCase("Electron")) {
					if (colour.equalsIgnoreCase("yellow")) {
						if (type.equalsIgnoreCase("Electric Bike")) {
						if (weight == 13.2) {
							this.price = 3200;
						}
						else if (weight == 12.4) {
							this.price = 2800;
						}
					}
					else if (colour.equalsIgnoreCase("blue")) {
						if (weight == 13.2) {
							this.price = 3200;
						}
						else if (weight == 12.4) {
							this.price = 2800;
						}
					}
				}
				System.out.print("Please enter the quantity: ");
				this.quantity = scan.nextInt();
				this.totalprice = this.price * this.quantity;
				System.out.println();
				}
			
			Bicycle1(String brand, String colour, String type, double weight) {
				this.brand = brand;
				this.colour = colour;
				this.type = type;
				this.weight = weight;
				if (brand.equalsIgnoreCase("Santa Cruz")) {
					if (colour.equalsIgnoreCase("black")) {
						if (weight == 13.2) {
							this.price = 3500;
						}
						else if (weight == 12.4) {
							this.price = 3000;
						}
					}
					else if (colour.equalsIgnoreCase("red")) {
						if (weight == 13.2) {
							this.price = 3500;
						}
						else if (weight == 12.4) {
							this.price = 3000;
						}
					}
				}
				else if (brand.equalsIgnoreCase("Electron")) {
					if (colour.equalsIgnoreCase("yellow")) {
						if (weight == 13.2) {
							this.price = 3200;
						}
						else if (weight == 12.4) {
							this.price = 2800;
						}
					}
					else if (colour.equalsIgnoreCase("blue")) {
						if (weight == 13.2) {
							this.price = 3200;
						}
						else if (weight == 12.4) {
							this.price = 2800;
						}
					}
				}
				this.quantity = quantity;
				this.totalprice = this.price * this.quantity;
				System.out.println();
			}
			
	}
