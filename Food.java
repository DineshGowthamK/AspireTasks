package foodorder;

import java.util.Scanner;

public class Food {
	private String Name;
	private float Price;
	
	public Food(String Name, float Price) {
		this.Name = Name;
		this.Price = Price;
	}
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

	public void input() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Food");
		Name = sc.nextLine();
		System.out.println("Enter the Price of the Food");
		Price = sc.nextFloat();
		}
	
	public void payment() {
		System.out.println("Price: "+Price);
	}
	public String detail() {
		return (Name+" "+Price);
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(Float Price) {
		this.Price = Price;
	}
}
