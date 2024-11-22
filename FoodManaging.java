package foodorder;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManaging {
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<Order> orderlist = new ArrayList<>();
	public int SelectFood;
	
	public FoodManaging() {
		
	}
	Scanner sc = new Scanner(System.in);
	
	public void sc() {
		System.out.println("Enter the number of items selected from menu");
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0; i<n; i++) {
			Food food = new Food();
			food.input();
			foodlist.add(food);
		}
	}
	public void print() {
		for(int i=0;i<foodlist.size();i++) {
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
	}
	public void Price() {
		 float PriceFood = 0;
		 float TotalPayment = 0;
		 int number;
		 Order o = new Order();
		 o.input();
		 orderlist.add(o);
		 for(int i=0;i<10;i++) {
			 System.out.println("Select Food "+(i+1));
			 SelectFood = sc.nextInt();
			 if(SelectFood == 0) {
				 o.setTotalPayment(TotalPayment);
				 System.out.println("Totalpayment");
				 System.out.println(TotalPayment);
				 System.out.println("Thank you, see you again");
				 break;
			 }
			 else {
				 System.out.println("Enter number");
				 number = sc.nextInt();
				 Food food = foodlist.get(SelectFood-1);
				 o.setEatList(food);
				 PriceFood = food.getPrice()*number; 
			 }
			 TotalPayment+=PriceFood;
			 System.out.println("Order finish");
			 System.out.println("Payment "+(i+1)+" is:");
			 System.out.println(" "+PriceFood);
			 System.out.println("Finish Order Enter 0");
		 }
	}
	public void PrintOrder() {
		for(int i=0;i<orderlist.size();i++) {
			orderlist.get(i).print();
		}
	}
	public void search() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String TableNumber;
		int up = 0;
		System.out.println("Enter table number for Payment");
		TableNumber = sc.nextLine();
		for(int i=0;i<orderlist.size();i++) {
			if(orderlist.get(i).getTableNumber().equalsIgnoreCase(TableNumber)) {
				orderlist.get(i).print();
				up++;
			}
		}
		if(up==0) {
			System.out.println("No Table Number "+TableNumber);
		}
	}
	public String EditName() {
		System.out.println("Enter the edited name: ");
		return sc.nextLine();
	}
	public float EditPrice() {
		System.out.println("Enter the edited price: ");
		return sc.nextFloat();
	}
	public void EditFood() {
		String foodname;
		int up=0;
		System.out.println("Enter the food name to edit");
		foodname = sc.nextLine();
		for(int i=0;i<foodlist.size();i++) {
			if(foodlist.get(i).getName().equals(foodname)) {
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				break;
			}
		}
		if(up==0) {
			System.out.println("Food name is "+foodname);
		}
	}
	public void DeleteFood() {
		String deletefood;
		int up=0;
		System.out.println("Enter the food name to delete");
		deletefood = sc.nextLine();
		for(int i=0;i<foodlist.size();i++) {
			if(foodlist.get(i).getName().equals(deletefood)) {
				up++;
				foodlist.remove(i);
				System.out.println(deletefood+" is deleted: ");
				break;
				
			}
		}
		if(up==0) {
			System.out.println("Food name is "+deletefood);
		}
	}
}