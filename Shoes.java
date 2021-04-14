
import java.util.Scanner;

public class Shoes {

	Scanner scan = new Scanner (System.in);
	
	brand, collection, color, design;
	double weight, price, totalweight, totalprice;
	int noofshoes;
	
	//Create Setter Method
	
	void setBrand() {
		System.out.print("Enter Brand : ");
		this.brand = scan.nextLine();
	
	} 
	void setCollection() {
		System.out.print("Enter Collection : ");
		this.collection = scan.nextLine();
		
	} 
	void setColor(String color) {
		System.out.println("Enter Color");
		this.color = scan.nextLine();

	}
	void setDesign() {
		System.out.println("Enter Design");
		this.design = scan.nextLine();		
	}
	void setWeight() {
		System.out.println("Please Enter the weight of shoes");
		this.weight = scan.nextLine();
	}
	void setPrice() {
		System.out.println("Please Enter the price of shoes");
		this.price = scan.nextLine();
	}
	void setNoOfShoes() {
		System.out.println("Please Enter the number of shoes");
		this.setnoofshoes = scan.nextLine();		
	}
	String getBrand() {
		return this.brand;	
	}
	String getCollection() {
		return this.collection;
	}
	String getColor() {
		return this.color;			
	}
	String getDesign() {
		return this.design;	
	}
	double getWeight() {
		return this.weight;		
	}
	double getPrice() {
		return this.price;	
	}
	int getNoOfShoes() {
		return this.noofshoes;	
	}
	double getTotalWeight() {
		this.totalweight = this.noofshoes * this.weight;
		return this.totalweight;		
	}	
	double getTotalPrice() {
		this.totalprice = this.totalweight * this.price;
		return this.totalprice;
	}
}
