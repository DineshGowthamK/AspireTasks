package foodorder;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	public String TableNumber;
	ArrayList<Food> EatList = new ArrayList<Food>();
	public float TotalPayment;
	
	public String getTableNumber() {
		return TableNumber;
	}
	public void setEatList(Food food) {
		EatList.add(food);
	}
	public void setTotalPayment(float TotalPayment) {
		this.TotalPayment = TotalPayment;
	}
	public void input() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Table Number: ");
		TableNumber = sc.nextLine();
	}
	public  void print() {
		System.out.println("Table Number: "+this.TableNumber+" Total Payment: "+this.TotalPayment);
		for(Food f:this.EatList) {
			System.out.println("Selected Food is "+ f.getName());
		}
		System.out.println();
	}
	
}
