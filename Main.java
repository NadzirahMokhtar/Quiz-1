package ShoesSetGetScanner;

public class Main {

	public static void main(String[] args) {
		
		Shoes Sarah = new Shoes();
		Sarah.setBrand();
		Sarah.setCollection();
		Sarah.setColor();
		Sarah.setDesign();
		
		Sarah.setWeight();
		Sarah.setPrice();
		Sarah.setNoOfShoes();
		
		System.out.println("Brand: " + Sarah.getBrand());
		System.out.println("Collection: " + Sarah.getCollection());
		System.out.println("Color: " + Sarah.getColor());
		System.out.println("Design: " + Sarah.getDesign());
		System.out.printf("Weight: %.2f g %n", Sarah.getWeight());
		System.out.printf("Price: RM %.2f %n", Sarah.getPrice());
		System.out.println("No of Shoes: " + Sarah.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Sarah.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Sarah.getTotalPrice());
		System.out.println();
		
		Shoes Ahmad = new Shoes();
		Ahmad.setBrand();
		Ahmad.setCollection();
		Ahmad.setColor();
		Ahmad.setDesign();
		
		Ahmad.setWeight();
		Ahmad.setPrice();
		Ahmad.setNoOfShoes();
		
		System.out.println("Brand: " + Ahmad.getBrand());
		System.out.println("Collection: " + Ahmad.getCollection());
		System.out.println("Color: " + Ahmad.getColor());
		System.out.println("Design: " + Ahmad.getDesign());
		System.out.printf("Weight: %.2f g %n", Ahmad.getWeight());
		System.out.printf("Price: RM %.2f %n", Ahmad.getPrice());
		System.out.println("No of Shoes: " + Ahmad.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Ahmad.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Ahmad.getTotalPrice());
		System.out.println();
		
		Shoes Abby = new Shoes();
		Abby.setBrand();
		Abby.setCollection();
		Abby.setColor();
		Abby.setDesign();
		
		Abby.setWeight(5.0);
		Abby.setPrice(49);
		Abby.setNoOfShoes(2);
		
		System.out.println("Brand: " + Abby.getBrand());
		System.out.println("Collection: " + Abby.getCollection());
		System.out.println("Color: " + Abby.getColor());
		System.out.println("Design: " + Abby.getDesign());
		System.out.printf("Weight: %.2f g %n", Abby.getWeight());
		System.out.printf("Price: RM %.2f %n", Abby.getPrice());
		System.out.println("No of Shoes: " + Abby.getNoOfShoes());
		System.out.printf("Total weight: %.2f g %n", Abby.getTotalWeight());
		System.out.printf("Total Price: RM %.2f %n", Abby.getTotalPrice());
		System.out.println();
		

	}

}
